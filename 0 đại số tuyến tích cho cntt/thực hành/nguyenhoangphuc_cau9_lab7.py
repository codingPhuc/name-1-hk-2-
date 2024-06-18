from pickle import TRUE
from sys import flags
import numpy as np 
u1= np.array([3,1,1]).T 
u2= np.array([-1,2,1]).T 
u3 = np.array([-1/2, 2, 7/2]).T 
U= (u1,u2,u3)
def chechset(U):
    for i in range(len(U)):
        for j in range (len(U)):
            if i !=j :
                ans = np.dot(U[i], U[j])
                if (float(ans)!= 0.0):
                    return False 
    return True 
print(chechset(U))