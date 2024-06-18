import numpy as np 
import matplotlib.pyplot as plt
A= np.array([[1,0,0,0],[1,1,1,1],[1,2,4,8], [1,3,9,27]])#tao  matrix chua gia tri cac bien so x 
B= np.array([1,510,2546,4582])# tạo array chứa kết quả fx 
X= np.linalg.solve(A, B)# dùng hàm ligsolve giải hệ phương trình 
print("c1 = ", X[0])
print("c2 = ", X[1])
print("c3 = ",X[2])
print("c4 = ", X[3])