import numpy as np 
u= np.array([2,3])
unit_u= u / np.linalg.norm(u)
print(unit_u , np.linalg.norm(unit_u))

#cau 6 
s1=np.array([1,2,3])
s2=np.array([7,4,3])
s3=np.array([2,1,9])
dist = np.linalg.norm(s1-s2)
print(dist)
dist = np.linalg.norm(s1-s3)
print(dist)
dist = np.linalg.norm(s3-s2)
print(dist)