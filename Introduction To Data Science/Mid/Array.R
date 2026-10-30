arr1 = array(1:18, dim = c(3,3,2)) # row, column, layer

arr1

arr2 = array(1:100000, dim = c(7,11,13))

arr2[3,1,c(1,2,3)]

arr2[3,,1] #only row

arr2[,3,1] #only column
