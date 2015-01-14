(ns angsrc.aircraft
  (:use [embang emit runtime]))

(defanglican aircraft
  ; Radar tracking model inspired by the aircraft example in BLOG.
  ; To keep things simple, all positions are one-dimensional.
  
  ; Aircraft are identified by integers from 0 to (- num_aircraft 1).
  [assume num_aircraft (+ 1 (sample (poisson 5)))]
  
  ; The true position of an aircraft.
  [assume aircraft_position (lambda (aircraft_id) (sample (normal 0 10)))]
  
  ; Each aircraft produces either zero blips or one blip.
  [assume num_blips (mem (lambda (aircraft_id) (sample (discrete (list 0.1 0.9)))))]
  
  ; Blips are identified by lists like ('blip 0 'ofaircraft 45).
  [assume blip_ids (lambda (aircraft_id)
      (map (lambda (i) (list 'blip i 'ofaircraft aircraft_id)) (range 0 (num_blips aircraft_id))))]
  
  ; Given a blip, return the aircraft that generated it.
  [assume source (mem (lambda (blip_id) (nth blip_id 2)))]
  
  ; The blip position is a noisy observation of the true aircraft position.
  [assume blip_position (mem (lambda (blip_id) (sample (normal (aircraft_position (source blip_id)) 1))))]
  
  ; Total number of blips (needed to express the observations).
  [assume num_blips_total (reduce + 0 (map num_blips (range 0 num_aircraft)))]
  
  ; List of all blips (needed to express the observations).
  [assume all_blips 
    (concat
      (map first
           (reduce conj () (filter
                             (lambda (lst) (if (nil? lst) false true))
                             (map blip_ids (range 0 num_aircraft)))))
      (repeat 3 '(blip 0 ofaircraft 0)))]

  ; Observe three blips on the radar screen:
  [observe (normal num_blips_total 0.001) 3]

  ; Observe the location of the three blips:
  [observe (normal (blip_position (nth all_blips 0)) 0.001) 100.0]
  [observe (normal (blip_position (nth all_blips 1)) 0.001) 200.0]
  [observe (normal (blip_position (nth all_blips 2)) 0.001) 300.0]

  ; Want to know the number of aircraft and their positions:
  [predict num_aircraft]
  [predict (map aircraft_position (range 0 num_aircraft))])

(defanglican optimized
  ; Radar tracking model inspired by the aircraft example in BLOG.
  ; To keep things simple, all positions are one-dimensional.
  
  ;;; Computations that can be pre-evaluated

  ;; values

  [assume aircraft-position-prior (normal 0 10)]
  [assume blip-position-prior (normal 0 1)]
  [assume observation-noise (normal 0 0.001)]
  [assume blib_source (discrete (list 0.1 0.9))]
  [assume padding (repeat 3 '(blip 0 ofaircraft 0))]

  ;; functions

  ; The true position of an aircraft.
  [assume aircraft_position (lambda (aircraft_id) (sample aircraft-position-prior))]
  
  ; Each aircraft produces either zero blips or one blip.
  [assume num_blips (mem (lambda (aircraft_id) (sample blib_source)))]
  
  ; Blips are identified by lists like ('blip 0 'ofaircraft 45).
  [assume blip_ids (lambda (aircraft_id)
      (map (lambda (i) (list 'blip i 'ofaircraft aircraft_id)) (range 0 (num_blips aircraft_id))))]
  
  ; Given a blip, return the aircraft that generated it.
  [assume source (mem (lambda (blip_id) (nth blip_id 2)))]
  
  ; The blip position is a noisy observation of the true aircraft position.
  [assume blip_position (mem (lambda (blip_id)
                                     (+ (sample blip-position-prior) (aircraft_position (source blip_id)))))]

  ;;; Sampling starts here

  ; Aircraft are identified by integers from 0 to (- num_aircraft 1).
  [assume num_aircraft (+ 1 (sample (poisson 5)))]
  [assume aircraft_ids (range 0 num_aircraft)]

  ; Total number of blips (needed to express the observations).
  [assume num_blips_total (reduce + 0 (map num_blips aircraft_ids))]
  
  ;; Observe that depends only on the total number of bplips

  ; Observe three blips on the radar screen:
  [observe observation-noise (- num_blips_total 3)]

  ; List of all blips (needed to express the observations).
  [assume all_blips 
    (concat
      (map first
           (reduce conj () (filter
                             (lambda (lst) (not (nil? lst)))
                             (map blip_ids aircraft_ids))))
      padding)]

  ; Observe the location of the three blips:
  [observe observation-noise (- (blip_position (nth all_blips 0)) 100.0)]
  [observe observation-noise (- (blip_position (nth all_blips 1)) 200.0)]
  [observe observation-noise (- (blip_position (nth all_blips 2)) 300.0)]

  ; Want to know the number of aircraft and their positions:
  [predict num_aircraft]
  [predict (map aircraft_position aircraft_ids)])
