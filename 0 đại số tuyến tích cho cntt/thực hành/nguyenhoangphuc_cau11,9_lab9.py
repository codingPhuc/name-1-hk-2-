import numpy as np 
import matplotlib.pyplot as plt 
x = np.array([-1,-0.5,-0.5,0,0 ,1,1,1.5,1,0.8,0.8,0.5,0.5,-1,-1.5,-1,-2])
y = np.array([0,0,0.8,0.8,0,0,1,1,2,2,2.5,2.5,2,2,1,1,0])
N=np.array([x,y])
T= np.array([[2],[4]])
plt.plot(x, y , '-ro')
TN = N+ T 
plt.plot(TN[0, : ], TN[1,:], 'bo-')
plt.grid()
plt.show()
#cau 11 
pts = np.array([[2.5,5,1],
                [-2.5,5,1],
                [-2.5,-5,1]])
pts2 = np.array([[2.5,5,1],
                [-2.5,5,1],
                [-2.5,0,1],
                [0,0,1]])
T1 = np.array([[-1,0,0],
      [0,-1,0],
      [0,0,-1]])
tran_pts1 = np.matmul(pts, T1)
tran_pts2 = np.matmul(pts2, T1)
plt.plot(pts[0, : ], pts[1,:], 'bo-')
plt.plot(pts2[0, : ], pts2[1,:], 'bo-')
plt.plot(tran_pts1[0, : ], tran_pts1[1,:], '-ro')
plt.plot(tran_pts2[0, : ], tran_pts2[1,:], '-ro')
plt.show()
#cau 11b
T= np.array([[1,0,2],
      [0,-2,1],
      [9,0,1]])
tran_pts = np.matmul(T,T1)
plt.plot(T[0, : ], T[:,1], 'bo-')
plt.plot(tran_pts[0, : ], tran_pts[:,1], 're-')
plt.show()



