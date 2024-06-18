import numpy as np
import sympy as sp

C = np.array(
[ [1, 0, 2, 3],
[4, -1, 0, 2],
[0, -1, -8, -10] ] )
res = sp.Matrix(C).rref()
print(res)
# A basis for the column space of a matrix A is the columns of A correspon ding to
# columns of rref (A) that contain leading ones
basisC = C[:, list(res[1]) ]
print(basisC)
print(2*basisC[:, 0] + 8*basisC[:, 1])