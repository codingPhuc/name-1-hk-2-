#cau 2a
import numpy as np 
n=5 
b=[12+ i*2 for i in np.arange(0,n)]
b= np.arange(12,12+n*2,2);
print('b= ', b );
# cau2 g 
d=[1,1];
for i in range(2,n):
    d.append(d[i-1]+d[i-2])
print(d)
d_final = [1.0/d[i] for i in range (len(d))]
print('d=',d_final)
#cau 2b
n=5 
b=[31+ i*2 for i in np.arange(0,n)]
b= np.arange(31,31+n*2,2);
print('c= ', b );
#cau2 e
import numpy as np 
f=14
z=[10- i*2 for i in np.arange(0,f)]
print('b= ', z );