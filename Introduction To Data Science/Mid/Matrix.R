mat = matrix(1:9,3,3)

mat2 = matrix(9:17,3,3)

mat2

mat[1,2]

mat[1,] #row only

mat[,3] #column only

mat[3,c(1,2)] # 2 values

mat[,] #all

sum_mat = mat + mat2

sum_mat

multiplication_mat = mat * mat2

multiplication_mat

multiplication_mat2 = mat2 %*% mat #dot product

multiplication_mat2

t(mat2) #transpose matrix

solve(multiplication_mat) #inverse matrix

Student = matrix(c(90,85,80,85,95,94,65,85,80), nrow = 3)

Student

Avg_Student1 = mean(Student[1,])

Avg_Student1

Avg_Student2 = mean(Student[2,])

Avg_Student2

Avg_Student3 = mean(Student[3,])

Avg_Student3

apply(Student, MARGIN = 1, FUN = mean) #apply function
