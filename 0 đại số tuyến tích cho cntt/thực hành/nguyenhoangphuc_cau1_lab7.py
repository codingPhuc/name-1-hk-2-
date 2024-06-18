import numpy as np
v1 = [1, 2, 3, 4]
v2 = [-1, 0, 1, 3]
v3 = [0, 5, -6, 8]
w = [3, -6, 17, 11]
# w is a linear combination of the vectors v1 and v2 if exists two numbersa, b:
# a * v1 + b * v2 = w
# 1*a + 0*b = 2
# 2*a - 1*b = 7
# 0*a + 2*b = -6
# so if the above linear systems has solutions => w is a linear combination of v1 and v2
A = np.transpose( [v1, v2,v3] )
print(A)
B = np.column_stack( (A, w) )
print(B)
if np.linalg.matrix_rank(B) == np.linalg.matrix_rank(A):
    print("w is a linear combination of v1 and v2and v3")
else:
    print("w is NOT a linear combination of v1 and v2 and v3")
v1 = [1, 1, 2, 2]
v2 = [2, 3, 5, 6]
v3 = [2, 1, 3, 6]
w = [0, 5, 3, 0]
# w is a linear combination of the vectors v1 and v2 if exists two numbersa, b:
# a * v1 + b * v2 = w
# 1*a + 0*b = 2
# 2*a - 1*b = 7
# 0*a + 2*b = -6
# so if the above linear systems has solutions => w is a linear combination of v1 and v2
A = np.transpose( [v1, v2,v3] )
print(A)
B = np.column_stack( (A, w) )
print(B)
if np.linalg.matrix_rank(B) == np.linalg.matrix_rank(A):
    print("w is a linear combination of v1 and v2 and v3")
else:
    print("w is NOT a linear combination of v1 and v2and v3")