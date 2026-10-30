# Sequence and Repetetion in Vectors

seq_vec <- c(1, 2, 3, 4, 5, 6, 7, 8, 9, 10) # Sequence from 1 to 10

seq(1, 10, by = 2) # Sequence from 1 to 10 with step of 2

print(seq_vec) # Print the sequence

seq(19,28,3)
seq(30,54,2)

c(seq(19,28,3), seq(30,54,2))

#repeatiton

rep_vec <- rep(c(1,2,3), 3)

print(rep_vec) # Print the repeated sequence

print(rep(1:4, 1:4)) # Print repeated values of 1 # nolint

#matrix

matrix_vec <- matrix(1:12, nrow = 3, ncol = 4, byrow = TRUE, dimnames = list(c("Row1", "Row2", "Row3"), c("Col1", "Col2", "Col3", "Col4"))) # Create a 3x4 matrix
print(matrix_vec) # Print the matrix