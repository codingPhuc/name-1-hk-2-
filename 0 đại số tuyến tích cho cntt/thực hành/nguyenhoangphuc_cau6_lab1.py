from re import X
import numpy as np 

x=np.array([0,2,4,6,8,10,12,14,16,18,20])
print(x[0:6])
print(x[-5:len(x)])
c=x[ [0,3,len(x)-1] ]
print(c)
print(x[ [0,2,4] ])
print(x[0:len(x):2])
print(x[1:len(x):2])