import numpy as np 
E= np.array([
    [80 ,98, 99, 85, 106, 94],
    [71 ,92 ,76 ,95 ,100 ,92],
    [124 ,163, 140, 160, 176, 161]
])
A= np.array([
    [1, 2, 3],
    [2, 1 ,2],
    [3, 2 ,4]
])
inver_A = np.linalg.inv(A)
D = np.matmul(np.linalg.inv(A),E);
for i in range(D.shape[0]):
    for j in range(D.shape[1]):
        print(chr(int(D[i][j])+64))
S = 'ATTACK'
f= np.array([ord(c) for c in S])
newarr = f.reshape(3, 2)
Final = np.matmul(A,newarr);
print(Final) 
S = ' LINEAR ALGEBRA LABORATORY '
f= np.array([ord(c) for c in S])
newarr = f.reshape(3, 9) 
Final = np.matmul(A,newarr);
print(Final)
        
        

