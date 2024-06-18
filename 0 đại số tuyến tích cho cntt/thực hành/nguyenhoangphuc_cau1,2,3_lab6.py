import numpy as np 
#cau 1 
A1= np.array([
    [1,-7],
    [-2,3],
])
print("1-norm", np.linalg.norm(A1,1))
#cau 2 

print("infinity-norm", np.linalg.norm(A1,np.inf))
#cau 3
A1= np.array([
    [2,3],
    [1,-1],
])
print("Frobenius-norm", np.linalg.norm(A1,'fro'))
A=np.dot([1, 1], [0, 1])
B= np.linalg.norm( [0, 1],2)
C= np.linalg.norm( [1, 1],2)
answer= A/(B*C) 
print(answer)
answer =np.arccos(answer)
answer =np.degrees(answer)
print(answer)

