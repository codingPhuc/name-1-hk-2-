import numpy as np 
#A
x= np.arange(1,6)
A1 = np.tile(x,(5,1))
print("A1= ",A1)
print("A1= ",A1.T)
#B
x= np.arange(1,7)
A1 = np.tile(x,(6,1))
print("A1= ",A1)
#C
C= np.arange(1,31)
C1= np.reshape(C ,(6,5))
print("C1= ", C1.T)
#D
C= np.arange(1,26)
C1= np.reshape(C ,(5,5))
print("C1= ", C1)


