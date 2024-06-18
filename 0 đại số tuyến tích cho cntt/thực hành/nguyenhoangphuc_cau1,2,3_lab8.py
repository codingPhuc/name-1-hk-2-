from telnetlib import TM
import numpy as np 
print("bai1")
A = np.array([[2,2],
             [2,3]])
b= np.array([4,6])
temp= np.linalg.inv(np.matmul(A.T,A))
temp = np.matmul(temp , A.T)
x= np.matmul(temp,b)
print("x[by formula] = ",x)
#cau 2 
print ("bai 2")
A= np.array([[0,0,1],
            [0,1,1],
            [1,2,1],
            [1,0,1],
            [4,1,1],
            [4,2,1],
])
b= np.array([[0,5],
             [1,6],
             [2,8],
             [0,8],
             [5,1],
             [5,9]
             ])
temp = np.linalg.inv(np.matmul(A.T ,A))
temp = np.matmul(temp,A.T)
x= np.matmul(temp,b)
print("c,d,e=",x)
print("A*x= ",np.matmul(A,x))

#cau 3
print("bai 3 a")
A = np.array([[0,1],
              [1,1],
              [2,2],
              [3,2],
              ])
b= np.array([[1],
            [1],
            [1],
            [1]])

temp = np.linalg.inv(np.matmul(A.T ,A))
temp = np.matmul(temp,A.T)
x= np.matmul(temp,b)
print("a0,a1=",x)
print("A*x= ",np.matmul(A,x))
#cau 3
print("bai 3 b")
A = np.array([[2,3],
              [3,2],
              [5,1],
              [0,6],
              ])
b= np.array([[1],
            [1],
            [1],
            [1]])

temp = np.linalg.inv(np.matmul(A.T ,A))
temp = np.matmul(temp,A.T)
x= np.matmul(temp,b)
print("a0,a1=",x)
print("A*x= ",np.matmul(A,x))


                     
