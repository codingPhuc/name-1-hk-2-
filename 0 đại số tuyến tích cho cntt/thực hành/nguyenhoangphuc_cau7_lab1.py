from statistics import median
import numpy as np 
x =np.array([3,11,-9,-131,-1,1,12])
#a 
maxValue =np.max(x)
print(maxValue)
#b 
minValue = np.min(x)
print(minValue)
#c 
print("c=",np.where(x>10))
print(x[x>10])
#d
x= np.flipud(x)
print(x)
#e
x=np.sort(x)
print(x)
#f
x=np.sort(x)[::-1]
print(x)
#h
(unique, counts) = np.unique(x, return_counts=True)

frequencies = np.asarray((unique, counts)).T

print(frequencies)
#n 
b =abs(x)
print(b)
#l 
c= np.median(x)
print(c);
#k
x=np.delete(x,x<0)
print(x);
#m 
n=5 
b=[12+ i*2 for i in np.arange(0,n)]
b= np.arange(12,12+n*2,2);
