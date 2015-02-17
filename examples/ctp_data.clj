(ns ctp-data)

;;;; Data for Canadian Traveller Problem

;;; 10 nodes

(def ctp-data
  {:10a {:tri
         [[[36.0 90.0] [58.0 55.0] [62.0 91.0]]
          [[58.0 55.0] [85.0 11.0] [95.0 63.0]]
          [[1.0 15.0] [36.0 90.0] [58.0 55.0]]
          [[1.0 15.0] [21.0 5.0] [58.0 55.0]]
          [[21.0 5.0] [58.0 55.0] [85.0 11.0]]
          [[58.0 55.0] [62.0 91.0] [74.0 81.0]]
          [[58.0 55.0] [74.0 81.0] [95.0 63.0]]
          [[62.0 91.0] [74.0 81.0] [78.0 85.0]]
          [[74.0 81.0] [78.0 85.0] [95.0 63.0]]
          [[78.0 85.0] [92.0 87.0] [95.0 63.0]]]
         :graph
         [[[1 0.26] [3 0.83] [6 0.41]]
          [[0 0.26] [5 0.17] [6 0.36] [9 0.16]]
          [[6 0.52] [7 0.53] [8 0.64]]
          [[0 0.83] [6 0.7] [8 0.22]]
          [[5 0.14] [7 0.24]]
          [[1 0.17] [4 0.14] [7 0.28] [9 0.06]]
          [[0 0.41] [1 0.36] [2 0.52] [3 0.7] [7 0.38] [8 0.62] [9 0.31]]
          [[2 0.53] [4 0.24] [5 0.28] [6 0.38] [9 0.28]]
          [[2 0.64] [3 0.22] [6 0.62]]
          [[1 0.16] [5 0.06] [6 0.31] [7 0.28]]]
         :s 4 :t 8}

   :20a {:tri
         [[[34.0 57.0] [47.0 34.0] [54.0 69.0]]
          [[47.0 34.0] [54.0 69.0] [83.0 62.0]]
          [[83.0 62.0] [95.0 84.0] [99.0 19.0]]
          [[13.0 77.0] [34.0 57.0] [45.0 70.0]]
          [[34.0 57.0] [45.0 70.0] [54.0 69.0]]
          [[54.0 69.0] [83.0 62.0] [83.0 67.0]]
          [[83.0 62.0] [83.0 67.0] [95.0 84.0]]
          [[18.0 31.0] [34.0 57.0] [47.0 34.0]]
          [[4.0 25.0] [15.0 33.0] [18.0 31.0]]
          [[67.0 80.0] [83.0 67.0] [95.0 84.0]]
          [[54.0 69.0] [67.0 80.0] [83.0 67.0]]
          [[45.0 70.0] [54.0 69.0] [67.0 80.0]]
          [[46.0 28.0] [52.0 26.0] [61.0 6.0]]
          [[18.0 31.0] [46.0 28.0] [47.0 34.0]]
          [[46.0 28.0] [47.0 34.0] [52.0 26.0]]
          [[13.0 77.0] [20.0 91.0] [45.0 70.0]]
          [[20.0 91.0] [45.0 70.0] [67.0 80.0]]
          [[4.0 25.0] [10.0 57.0] [15.0 33.0]]
          [[47.0 34.0] [52.0 26.0] [82.0 27.0]]
          [[47.0 34.0] [82.0 27.0] [83.0 62.0]]
          [[52.0 26.0] [61.0 6.0] [82.0 27.0]]
          [[82.0 27.0] [83.0 62.0] [99.0 19.0]]
          [[15.0 33.0] [18.0 31.0] [20.0 53.0]]
          [[18.0 31.0] [20.0 53.0] [34.0 57.0]]
          [[10.0 57.0] [13.0 77.0] [20.0 53.0]]
          [[13.0 77.0] [20.0 53.0] [34.0 57.0]]
          [[10.0 57.0] [15.0 33.0] [20.0 53.0]]]
         :graph
         [[[5 0.16] [14 0.33] [18 0.48]]
          [[12 0.21] [15 0.65] [16 0.25] [18 0.28]]
          [[4 0.15] [7 0.31] [8 0.29] [10 0.22] [13 0.28] [19 0.04]]
          [[8 0.36] [11 0.3] [15 0.19] [16 0.35] [17 0.3]]
          [[2 0.15] [9 0.33] [19 0.14]]
          [[0 0.16] [7 0.29] [9 0.2] [10 0.25] [14 0.33]]
          [[7 0.23] [8 0.36] [12 0.29] [14 0.09] [16 0.3] [18 0.17]]
          [[2 0.31] [5 0.29] [6 0.23] [8 0.26] [10 0.15] [14 0.17]]
          [[2 0.29] [3 0.36] [6 0.36] [7 0.26] [11 0.09] [13 0.06] [16 0.46]]
          [[4 0.33] [5 0.2] [10 0.11] [19 0.25]]
          [[2 0.22] [5 0.25] [7 0.15] [9 0.11] [19 0.21]]
          [[3 0.3] [8 0.09] [13 0.06] [17 0.22]]
          [[1 0.21] [6 0.29] [16 0.05] [18 0.21]]
          [[2 0.28] [8 0.06] [11 0.06] [17 0.27]]
          [[0 0.33] [5 0.33] [6 0.09] [7 0.17] [18 0.24]]
          [[1 0.65] [3 0.19] [16 0.46]]
          [[1 0.25] [3 0.35] [6 0.3] [8 0.46] [12 0.05] [15 0.46]]
          [[3 0.3] [11 0.22] [13 0.27]]
          [[0 0.48] [1 0.28] [6 0.17] [12 0.21] [14 0.24]]
          [[2 0.04] [4 0.14] [9 0.25] [10 0.21]]]
         :s 0 :t 17}

   :50a {:tri
         [[[81.0 27.0] [84.0 33.0] [97.0 24.0]]
          [[81.0 27.0] [83.0 12.0] [97.0 24.0]]
          [[57.0 41.0] [65.0 48.0] [71.0 37.0]]
          [[71.0 37.0] [81.0 27.0] [84.0 33.0]]
          [[1.0 59.0] [8.0 60.0] [19.0 45.0]]
          [[53.0 76.0] [67.0 86.0] [70.0 66.0]]
          [[43.0 64.0] [46.0 72.0] [53.0 76.0]]
          [[83.0 12.0] [85.0 11.0] [97.0 24.0]]
          [[61.0 2.0] [83.0 12.0] [85.0 11.0]]
          [[1.0 59.0] [6.0 62.0] [8.0 60.0]]
          [[1.0 59.0] [11.0 24.0] [19.0 45.0]]
          [[11.0 24.0] [35.0 32.0] [40.0 10.0]]
          [[11.0 24.0] [27.0 36.0] [35.0 32.0]]
          [[63.0 28.0] [81.0 27.0] [83.0 12.0]]
          [[54.0 9.0] [61.0 2.0] [63.0 28.0]]
          [[57.0 41.0] [63.0 28.0] [71.0 37.0]]
          [[61.0 2.0] [63.0 28.0] [83.0 12.0]]
          [[63.0 28.0] [71.0 37.0] [81.0 27.0]]
          [[53.0 51.0] [57.0 41.0] [65.0 48.0]]
          [[43.0 64.0] [53.0 51.0] [53.0 76.0]]
          [[53.0 51.0] [65.0 48.0] [70.0 66.0]]
          [[43.0 64.0] [44.0 54.0] [53.0 51.0]]
          [[53.0 51.0] [53.0 76.0] [70.0 66.0]]
          [[11.0 24.0] [19.0 45.0] [20.0 38.0]]
          [[11.0 24.0] [20.0 38.0] [27.0 36.0]]
          [[19.0 45.0] [20.0 38.0] [27.0 36.0]]
          [[67.0 86.0] [70.0 66.0] [79.0 87.0]]
          [[70.0 66.0] [79.0 87.0] [94.0 79.0]]
          [[67.0 86.0] [69.0 94.0] [79.0 87.0]]
          [[69.0 94.0] [79.0 87.0] [93.0 95.0]]
          [[79.0 87.0] [93.0 95.0] [94.0 79.0]]
          [[35.0 32.0] [40.0 10.0] [48.0 19.0]]
          [[35.0 32.0] [48.0 19.0] [49.0 29.0]]
          [[40.0 10.0] [48.0 19.0] [54.0 9.0]]
          [[84.0 33.0] [88.0 36.0] [97.0 24.0]]
          [[88.0 36.0] [97.0 24.0] [99.0 48.0]]
          [[19.0 45.0] [27.0 36.0] [31.0 37.0]]
          [[27.0 36.0] [31.0 37.0] [35.0 32.0]]
          [[31.0 37.0] [35.0 32.0] [44.0 54.0]]
          [[44.0 54.0] [53.0 51.0] [55.0 39.0]]
          [[53.0 51.0] [55.0 39.0] [57.0 41.0]]
          [[35.0 32.0] [44.0 54.0] [55.0 39.0]]
          [[35.0 32.0] [49.0 29.0] [55.0 39.0]]
          [[78.0 43.0] [84.0 33.0] [88.0 36.0]]
          [[71.0 37.0] [78.0 43.0] [84.0 33.0]]
          [[25.0 97.0] [60.0 88.0] [69.0 94.0]]
          [[53.0 76.0] [60.0 88.0] [67.0 86.0]]
          [[60.0 88.0] [67.0 86.0] [69.0 94.0]]
          [[40.0 10.0] [50.0 2.0] [54.0 9.0]]
          [[50.0 2.0] [54.0 9.0] [61.0 2.0]]
          [[54.0 9.0] [60.0 28.0] [63.0 28.0]]
          [[57.0 41.0] [60.0 28.0] [63.0 28.0]]
          [[48.0 19.0] [54.0 9.0] [60.0 28.0]]
          [[55.0 39.0] [57.0 41.0] [60.0 28.0]]
          [[49.0 29.0] [55.0 39.0] [60.0 28.0]]
          [[48.0 19.0] [49.0 29.0] [60.0 28.0]]
          [[70.0 66.0] [92.0 57.0] [94.0 79.0]]
          [[78.0 43.0] [88.0 36.0] [92.0 57.0]]
          [[88.0 36.0] [92.0 57.0] [99.0 48.0]]
          [[92.0 57.0] [94.0 79.0] [98.0 66.0]]
          [[92.0 57.0] [98.0 66.0] [99.0 48.0]]
          [[6.0 62.0] [8.0 60.0] [18.0 70.0]]
          [[6.0 62.0] [11.0 91.0] [18.0 70.0]]
          [[8.0 60.0] [18.0 70.0] [19.0 45.0]]
          [[11.0 91.0] [18.0 70.0] [25.0 97.0]]
          [[18.0 70.0] [38.0 78.0] [43.0 64.0]]
          [[25.0 97.0] [38.0 78.0] [60.0 88.0]]
          [[38.0 78.0] [43.0 64.0] [46.0 72.0]]
          [[18.0 70.0] [25.0 97.0] [38.0 78.0]]
          [[42.0 56.0] [43.0 64.0] [44.0 54.0]]
          [[19.0 45.0] [31.0 37.0] [42.0 56.0]]
          [[31.0 37.0] [42.0 56.0] [44.0 54.0]]
          [[18.0 70.0] [19.0 45.0] [42.0 56.0]]
          [[18.0 70.0] [42.0 56.0] [43.0 64.0]]
          [[65.0 48.0] [71.0 37.0] [74.0 45.0]]
          [[71.0 37.0] [74.0 45.0] [78.0 43.0]]
          [[65.0 48.0] [70.0 66.0] [74.0 45.0]]
          [[70.0 66.0] [74.0 45.0] [92.0 57.0]]
          [[74.0 45.0] [78.0 43.0] [92.0 57.0]]
          [[38.0 78.0] [51.0 78.0] [60.0 88.0]]
          [[51.0 78.0] [53.0 76.0] [60.0 88.0]]
          [[38.0 78.0] [46.0 72.0] [51.0 78.0]]
          [[46.0 72.0] [51.0 78.0] [53.0 76.0]]]
         :graph
         [[[6 0.04] [9 0.12] [20 0.07] [25 0.09] [38 0.2]]
          [[32 0.16] [33 0.16] [37 0.24]]
          [[9 0.25] [15 0.22] [23 0.14] [31 0.26] [39 0.28] [41 0.28] [45 0.14] [48 0.22]]
          [[5 0.14] [14 0.21] [17 0.12] [36 0.2] [40 0.08] [49 0.1]]
          [[8 0.09] [12 0.21] [21 0.04] [44 0.09] [46 0.22]]
          [[3 0.14] [17 0.12] [25 0.23] [38 0.32] [40 0.13]]
          [[0 0.04] [9 0.14] [19 0.21] [25 0.06] [39 0.22]]
          [[9 0.23] [23 0.07] [38 0.36] [45 0.06]]
          [[4 0.09] [12 0.19] [35 0.11] [42 0.12] [44 0.13]]
          [[0 0.12] [2 0.25] [6 0.14] [7 0.23] [20 0.07] [23 0.19] [38 0.22] [39 0.25]]
          [[27 0.18] [29 0.02] [49 0.26]]
          [[12 0.2] [24 0.17] [26 0.07] [33 0.12] [37 0.08]]
          [[4 0.21] [8 0.19] [11 0.2] [24 0.2] [32 0.27] [33 0.23] [42 0.23] [46 0.24]]
          [[18 0.05] [21 0.12] [27 0.16] [28 0.07] [44 0.14]]
          [[3 0.21] [28 0.18] [29 0.26] [35 0.14] [36 0.03] [44 0.12] [49 0.26]]
          [[2 0.22] [16 0.1] [26 0.24] [31 0.15] [41 0.23] [43 0.13]]
          [[15 0.1] [24 0.08] [31 0.09] [43 0.08]]
          [[3 0.12] [5 0.12] [22 0.1] [25 0.18] [36 0.15]]
          [[13 0.05] [21 0.12] [27 0.15] [46 0.21] [47 0.16]]
          [[6 0.21] [25 0.24] [30 0.19] [31 0.1] [39 0.03] [42 0.09]]
          [[0 0.07] [9 0.07] [38 0.17]]
          [[4 0.04] [13 0.12] [18 0.12] [44 0.09] [46 0.2]]
          [[17 0.1] [25 0.14] [30 0.12] [36 0.11]]
          [[2 0.14] [7 0.07] [9 0.19] [45 0.03]]
          [[11 0.17] [12 0.2] [16 0.08] [26 0.14] [31 0.16] [42 0.25] [43 0.03]]
          [[0 0.09] [5 0.23] [6 0.06] [17 0.18] [19 0.24] [22 0.14] [30 0.21] [38 0.25]]
          [[11 0.07] [15 0.24] [24 0.14] [37 0.11] [41 0.36] [43 0.13]]
          [[10 0.18] [13 0.16] [18 0.15] [28 0.16] [29 0.18] [47 0.24]]
          [[13 0.07] [14 0.18] [27 0.16] [29 0.15] [44 0.14]]
          [[10 0.02] [14 0.26] [27 0.18] [28 0.15] [49 0.24]]
          [[19 0.19] [22 0.12] [25 0.21] [35 0.03] [36 0.12] [42 0.12]]
          [[2 0.26] [15 0.15] [16 0.09] [19 0.1] [24 0.16] [39 0.08] [42 0.16]]
          [[1 0.16] [12 0.27] [33 0.17] [34 0.14] [46 0.22]]
          [[1 0.16] [11 0.12] [12 0.23] [32 0.17] [37 0.12]]
          [[32 0.14] [46 0.11] [47 0.18]]
          [[8 0.11] [14 0.14] [30 0.03] [36 0.13] [42 0.11] [44 0.15]]
          [[3 0.2] [14 0.03] [17 0.15] [22 0.11] [30 0.12] [35 0.13]]
          [[1 0.24] [11 0.08] [26 0.11] [33 0.12] [41 0.44]]
          [[0 0.2] [5 0.32] [7 0.36] [9 0.22] [20 0.17] [25 0.25]]
          [[2 0.28] [6 0.22] [9 0.25] [19 0.03] [31 0.08]]
          [[3 0.08] [5 0.13] [49 0.11]]
          [[2 0.28] [15 0.23] [26 0.36] [37 0.44] [48 0.15]]
          [[8 0.12] [12 0.23] [19 0.09] [24 0.25] [30 0.12] [31 0.16] [35 0.11]]
          [[15 0.13] [16 0.08] [24 0.03] [26 0.13]]
          [[4 0.09] [8 0.13] [13 0.14] [14 0.12] [21 0.09] [28 0.14] [35 0.15]]
          [[2 0.14] [7 0.06] [23 0.03] [48 0.29]]
          [[4 0.22] [12 0.24] [18 0.21] [21 0.2] [32 0.22] [34 0.11] [47 0.11]]
          [[18 0.16] [27 0.24] [34 0.18] [46 0.11]]
          [[2 0.22] [41 0.15] [45 0.29]]
          [[3 0.1] [10 0.26] [14 0.26] [29 0.24] [40 0.11]]]
         :s 1 :t 25}

   :50b {:tri
         [[[81.0 82.0] [88.0 99.0] [89.0 97.0]]
          [[50.0 7.0] [61.0 18.0] [69.0 6.0]]
          [[65.0 55.0] [75.0 49.0] [80.0 54.0]]
          [[61.0 18.0] [69.0 6.0] [79.0 10.0]]
          [[80.0 54.0] [89.0 53.0] [91.0 56.0]]
          [[89.0 53.0] [91.0 56.0] [94.0 12.0]]
          [[7.0 3.0] [8.0 0.0] [16.0 5.0]]
          [[65.0 55.0] [73.0 45.0] [75.0 49.0]]
          [[29.0 59.0] [45.0 35.0] [48.0 63.0]]
          [[65.0 55.0] [75.0 67.0] [80.0 54.0]]
          [[75.0 67.0] [80.0 54.0] [91.0 56.0]]
          [[26.0 74.0] [26.0 98.0] [35.0 83.0]]
          [[52.0 83.0] [53.0 96.0] [55.0 94.0]]
          [[35.0 83.0] [52.0 83.0] [53.0 96.0]]
          [[8.0 0.0] [16.0 5.0] [33.0 5.0]]
          [[52.0 83.0] [61.0 88.0] [75.0 67.0]]
          [[52.0 83.0] [55.0 94.0] [61.0 88.0]]
          [[69.0 6.0] [73.0 5.0] [79.0 10.0]]
          [[33.0 5.0] [50.0 7.0] [73.0 5.0]]
          [[50.0 7.0] [69.0 6.0] [73.0 5.0]]
          [[53.0 96.0] [55.0 94.0] [66.0 90.0]]
          [[66.0 90.0] [81.0 82.0] [88.0 99.0]]
          [[53.0 96.0] [66.0 90.0] [88.0 99.0]]
          [[55.0 94.0] [61.0 88.0] [66.0 90.0]]
          [[45.0 35.0] [48.0 63.0] [56.0 39.0]]
          [[48.0 63.0] [56.0 39.0] [65.0 55.0]]
          [[56.0 39.0] [65.0 55.0] [73.0 45.0]]
          [[25.0 67.0] [26.0 74.0] [41.0 65.0]]
          [[25.0 67.0] [29.0 59.0] [41.0 65.0]]
          [[29.0 59.0] [41.0 65.0] [48.0 63.0]]
          [[26.0 74.0] [35.0 83.0] [41.0 65.0]]
          [[48.0 63.0] [48.0 69.0] [65.0 55.0]]
          [[48.0 69.0] [52.0 83.0] [75.0 67.0]]
          [[41.0 65.0] [48.0 63.0] [48.0 69.0]]
          [[35.0 83.0] [48.0 69.0] [52.0 83.0]]
          [[35.0 83.0] [41.0 65.0] [48.0 69.0]]
          [[48.0 69.0] [65.0 55.0] [75.0 67.0]]
          [[79.0 10.0] [80.0 39.0] [94.0 12.0]]
          [[80.0 39.0] [89.0 53.0] [94.0 12.0]]
          [[8.0 42.0] [29.0 59.0] [36.0 35.0]]
          [[29.0 59.0] [36.0 35.0] [45.0 35.0]]
          [[75.0 49.0] [80.0 54.0] [83.0 48.0]]
          [[80.0 39.0] [83.0 48.0] [89.0 53.0]]
          [[80.0 54.0] [83.0 48.0] [89.0 53.0]]
          [[73.0 45.0] [75.0 49.0] [83.0 48.0]]
          [[73.0 45.0] [80.0 39.0] [83.0 48.0]]
          [[45.0 23.0] [45.0 35.0] [56.0 39.0]]
          [[36.0 35.0] [37.0 21.0] [45.0 23.0]]
          [[36.0 35.0] [45.0 23.0] [45.0 35.0]]
          [[45.0 23.0] [50.0 7.0] [61.0 18.0]]
          [[45.0 23.0] [56.0 39.0] [64.0 34.0]]
          [[61.0 18.0] [64.0 34.0] [79.0 10.0]]
          [[64.0 34.0] [79.0 10.0] [80.0 39.0]]
          [[56.0 39.0] [64.0 34.0] [73.0 45.0]]
          [[45.0 23.0] [61.0 18.0] [64.0 34.0]]
          [[64.0 34.0] [73.0 45.0] [80.0 39.0]]
          [[4.0 1.0] [7.0 3.0] [8.0 0.0]]
          [[75.0 67.0] [79.0 78.0] [91.0 56.0]]
          [[79.0 78.0] [81.0 82.0] [91.0 56.0]]
          [[66.0 90.0] [79.0 78.0] [81.0 82.0]]
          [[61.0 88.0] [66.0 90.0] [79.0 78.0]]
          [[61.0 88.0] [75.0 67.0] [79.0 78.0]]
          [[33.0 5.0] [37.0 21.0] [40.0 7.0]]
          [[33.0 5.0] [40.0 7.0] [50.0 7.0]]
          [[37.0 21.0] [40.0 7.0] [46.0 8.0]]
          [[37.0 21.0] [45.0 23.0] [46.0 8.0]]
          [[40.0 7.0] [46.0 8.0] [50.0 7.0]]
          [[45.0 23.0] [46.0 8.0] [50.0 7.0]]
          [[26.0 98.0] [31.0 99.0] [35.0 83.0]]
          [[26.0 98.0] [29.0 99.0] [31.0 99.0]]
          [[31.0 99.0] [35.0 83.0] [53.0 96.0]]
          [[31.0 99.0] [53.0 96.0] [88.0 99.0]]
          [[7.0 3.0] [8.0 42.0] [20.0 26.0]]
          [[8.0 42.0] [20.0 26.0] [36.0 35.0]]
          [[20.0 26.0] [33.0 5.0] [37.0 21.0]]
          [[20.0 26.0] [36.0 35.0] [37.0 21.0]]
          [[7.0 3.0] [16.0 5.0] [20.0 26.0]]
          [[16.0 5.0] [20.0 26.0] [33.0 5.0]]
          [[0.0 55.0] [25.0 67.0] [26.0 74.0]]
          [[0.0 55.0] [25.0 67.0] [29.0 59.0]]
          [[0.0 55.0] [8.0 42.0] [29.0 59.0]]]
         :graph
         [[[23 0.24] [34 0.03] [45 0.17] [46 0.05]]
          [[7 0.09] [12 0.14] [24 0.1] [35 0.13] [40 0.18] [43 0.04]]
          [[9 0.4] [32 0.23] [42 0.08] [47 0.04]]
          [[8 0.12] [19 0.03] [25 0.11] [44 0.08]]
          [[18 0.25] [22 0.27] [29 0.09] [31 0.19] [37 0.29] [41 0.13] [48 0.29]]
          [[9 0.16] [15 0.18] [18 0.14] [28 0.08] [33 0.14] [36 0.16]]
          [[16 0.11] [24 0.07] [26 0.14] [35 0.15] [38 0.09] [43 0.07]]
          [[1 0.09] [12 0.17] [21 0.3] [24 0.09] [38 0.17] [42 0.29]]
          [[3 0.12] [11 0.24] [14 0.18] [19 0.14] [30 0.17] [44 0.05]]
          [[2 0.4] [5 0.16] [15 0.25] [17 0.17] [27 0.25] [32 0.17] [33 0.07]]
          [[27 0.04] [39 0.04]]
          [[8 0.24] [13 0.02] [19 0.35] [30 0.18] [46 0.57]]
          [[1 0.14] [7 0.17] [28 0.22] [40 0.09] [42 0.28] [49 0.16]]
          [[11 0.02] [30 0.17]]
          [[8 0.18] [16 0.25] [26 0.12] [30 0.04] [44 0.21]]
          [[5 0.18] [9 0.25] [17 0.21] [18 0.18] [22 0.2] [39 0.26]]
          [[6 0.11] [14 0.25] [21 0.44] [26 0.19] [30 0.28] [38 0.04]]
          [[9 0.17] [15 0.21] [27 0.09] [39 0.09]]
          [[4 0.25] [5 0.14] [15 0.18] [22 0.29] [28 0.15] [48 0.09]]
          [[3 0.03] [8 0.14] [11 0.35] [25 0.13] [45 0.22] [46 0.22]]
          [[25 0.15] [26 0.27] [31 0.06] [35 0.22] [41 0.08] [45 0.19]]
          [[7 0.3] [16 0.44] [38 0.41] [42 0.15]]
          [[4 0.27] [15 0.2] [18 0.29] [37 0.15] [39 0.39]]
          [[0 0.24] [29 0.07] [37 0.32] [41 0.17] [45 0.13]]
          [[1 0.1] [6 0.07] [7 0.09] [38 0.08] [43 0.08]]
          [[3 0.11] [19 0.13] [20 0.15] [26 0.28] [44 0.1] [45 0.17]]
          [[6 0.14] [14 0.12] [16 0.19] [20 0.27] [25 0.28] [35 0.16] [44 0.25]]
          [[9 0.25] [10 0.04] [17 0.09] [39 0.03]]
          [[5 0.08] [12 0.22] [18 0.15] [32 0.17] [36 0.15] [40 0.19] [48 0.12] [49 0.17]]
          [[4 0.09] [23 0.07] [37 0.28] [41 0.16]]
          [[8 0.17] [11 0.18] [13 0.17] [14 0.04] [16 0.28]]
          [[4 0.19] [20 0.06] [35 0.19] [40 0.25] [41 0.07] [48 0.28]]
          [[2 0.23] [9 0.17] [28 0.17] [33 0.1] [36 0.04] [47 0.19] [49 0.16]]
          [[5 0.14] [9 0.07] [32 0.1] [36 0.06]]
          [[0 0.03] [46 0.02]]
          [[1 0.13] [6 0.15] [20 0.22] [26 0.16] [31 0.19] [40 0.18] [43 0.12]]
          [[5 0.16] [28 0.15] [32 0.04] [33 0.06]]
          [[4 0.29] [22 0.15] [23 0.32] [29 0.28]]
          [[6 0.09] [7 0.17] [16 0.04] [21 0.41] [24 0.08]]
          [[10 0.04] [15 0.26] [17 0.09] [22 0.39] [27 0.03]]
          [[1 0.18] [12 0.09] [28 0.19] [31 0.25] [35 0.18] [48 0.12]]
          [[4 0.13] [20 0.08] [23 0.17] [29 0.16] [31 0.07] [45 0.19]]
          [[2 0.08] [7 0.29] [12 0.28] [21 0.15] [47 0.11] [49 0.2]]
          [[1 0.04] [6 0.07] [24 0.08] [35 0.12]]
          [[3 0.08] [8 0.05] [14 0.21] [25 0.1] [26 0.25]]
          [[0 0.17] [19 0.22] [20 0.19] [23 0.13] [25 0.17] [41 0.19] [46 0.16]]
          [[0 0.05] [11 0.57] [19 0.22] [34 0.02] [45 0.16]]
          [[2 0.04] [32 0.19] [42 0.11] [49 0.14]]
          [[4 0.29] [18 0.09] [28 0.12] [31 0.28] [40 0.12]]
          [[12 0.16] [28 0.17] [32 0.16] [42 0.2] [47 0.14]]]
         :s 0
         :t 40}})
