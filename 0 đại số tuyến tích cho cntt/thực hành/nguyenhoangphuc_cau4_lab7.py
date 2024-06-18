#cau4
# null space of any matrix A consists of all the vectors B
# such that AB = 0 and B is not zero
import numpy as np
import sympy as sp
C = np.array(
[ [1, 0, 2, 3],
[4, -1, 0, 2],
[0, -1, -8, -10] ] )
res = sp.Matrix(C).nullspace()
print( res )
nullC = np.array(res[0])
for i in range(1, len(res)):
    nullC  = np.hstack(( nullC, np.array(res[i]) ))
print( nullC )