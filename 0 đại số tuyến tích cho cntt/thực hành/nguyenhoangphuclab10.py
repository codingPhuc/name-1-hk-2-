import numpy as np
import matplotlib.pyplot as plt


pts = np.array(
    [ [1,1], #Canh doc phai
      [1,4], #Canh doc phai   
      [2.5,4.5], #noc
      [4,4], #canh doc trai
      [1,4], #Mai
      [4,4], #mai 
      [4,1], #canh doc trai
      [3,1], #Cua 
      [3,2],  #Cua
      [2,2],  #cua
      [2,1],  #Cua    
      [1,1] ])
dx = 3;
dy = 2;
transM = [dx,dy]
trans_pts =[]

for i in range(pts.shape[0]):
  trans_pts.append(pts[i] + transM )

trans_pts = np.array(trans_pts)
plt.plot(pts[:,0], pts[:, 1], 'b*-');
plt.show()