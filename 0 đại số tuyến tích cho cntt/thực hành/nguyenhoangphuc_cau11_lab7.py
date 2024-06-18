import numpy as np 
U= np.array([3,0 ,0], [1,3,4])
U1 = np.array([[1,0,1]])
def checkclome(U1):
    U1_T= U1.T
    res = np.dot(U1_T,U1)
    print(res)
    I= np.eye(len(res),len(res[1]), dtype= np.int32)
    print(I)
    if np.array_equal(res, I):
        print("matric has orthonormal colums")
    else :
        print("matrix has the other colume")
checkclome(U)
checkclome(U1)
        
    