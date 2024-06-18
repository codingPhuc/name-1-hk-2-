import numpy as np

# w is a linear combination of the vectors v1 and v2 if exists two numbersa, b:
# a * v1 + b * v2 = w
# 1*a + 0*b = 2
# 2*a - 1*b = 7
# 0*a + 2*b = -6
# so if the above linear systems has solutions => w is a linear combination of v1 and v2
A= np.array([
    [7 ,6, -4, 1],
    [-5 ,-1 ,0 ,-2],
    [9 ,-11, 7 ,-3],
    [19 ,-9 ,7 ,1],
])
w= np.array([
    [1],
    [1],
    [-1],
    [-3],
])
print(A)
B = np.column_stack( (A, w) )
print(B)
if np.linalg.matrix_rank(B) == np.linalg.matrix_rank(A):
    print("w is a linear combination of A")
else:
    print("w is NOT a linear combination pf A")

A= np.array([
    [-8,5, -2, 0],
    [-5 ,2 ,1 ,-2],
    [10 ,-8, 6 ,-3],
    [3 ,-2 ,1 ,0],
])
w= np.array([
    [1],
    [2],
    [1],
    [0],
])
print(A)
B = np.column_stack( (A, w) )
print(B)
if np.linalg.matrix_rank(B) == np.linalg.matrix_rank(A):
    print("w is a linear combination of A")
else:
    print("w is NOT a linear combination pf A")