import imp
import numpy as np 
import sympy as sp
A = np.array([
    [0.25,0.15,0.1],
    [0.4,0.15,0.2],
    [0.15 , 0.2 , 0.2], 
])
d= np.array([
    [100,100,100],
])
p = (A*np.eye(3,3))-d 
print(p)
#bai 11
x1, x2, x3 , x4 = sp.symbols('x1, x2, x3,x4')
a=sp.linsolve([3*x1 -x3, 8*x1-2*x4 , x2 -2*x3 -x4], (x1, x2, x3,x4))
print(a)