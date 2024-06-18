import numpy as np 
import matplotlib.pyplot as plt
A = np.array([[2,1,3,1],
              [1,-3,2,1],
              [3,2,509,6],
              [1,1,6,1]])

A_NEW = A[0:1, 0:4]
A_NEWs = A[3:4,0:4]
#cau d
B= np.concatenate((A_NEW, A_NEWs))# công hai ma trận vừa tạo ra từ A và làm ma trận B chứa hàng đâu và cuối ma trận A
# cau e
A_vector =A.reshape(1,-1)  # hàm reshape tạo ra vector với ma trân 1 hàng và  nhiều cột  
A_vector =np.sort(A_vector) # hàm sort từ bé đến lớn 
A_vector =np.flip(A_vector)# hàm flip đảo ngược hành lớn tới bé 

# cau f
def counteven():# method dùng dể đếm số chẵn trong ma trận A
    even = 0 
    for i in range(len(A)): 
        for j in range(len(A[i])): # tạo hàm loop ma trận j đối với i 
            if(A[i][j]%2==0): #nếu só A[i][j] trong ma trận  chia cho 2 công 1 even 
                even +=1
    print(even)
# cau g
def reverstfirstandlast(): # method dùng thay thế  số chẵn trong ma trận A
    A_flip1=np.flip(A[0,:])
    A_flip2=np.flip(A[3,:])
    A_flip= np.concatenate((A_flip1, A[1,:],A[2,:],A_flip2))
    A_flip=A_flip.reshape(4,4)
    print(A_flip)

# cau h 
def replaceeven():# method dùng thay thế  số chẵn trong ma trận A
    even = 0 
    for i in range(len(A)): 
        for j in range(len(A[i])): # tạo hàm loop ma trận  
            if(A[i][j]%2==0): ##nếu só A[i][j] trong ma trận  chia cho 2 thay số đó bằng anpha hay 509 
                A[i][j]=509
    print(A)
# cau i
C = np.concatenate((A[:,2], A[:,1],A[:,0],A[:,3]))
C=C.reshape(4,4) 
C= C.T

# cau j 
sum =A[:,0].sum() +A[:,3].sum()+A[0,:].sum() +A[3,:].sum()- A[0,0] - A[0,3] - A[3,0] -A[3,3] #dùng hàm sum cộng lại từng cộng với nhau xong cộng tất cả  kết quả các cột
print("cau a,b,c")
print ("Is A matrix square or not?",A.shape[0]==A.shape[1])# kiểm tra xem có phải là ma trận vuông hay k  bằng cách dùng hàm shape
print ("Is A matrix symmetric or not?",np.array_equal(A.T,A))# kiểm tra có là ma trận đối xứng bằng cách nghịch dảo ma trận A và so hai cái bằng nhau hay k 
print ("Is A matrix skew-symmetric or not?",np.array_equal(-A.T,A))# kiểm tra có là ma trận skew-symmetric bằng cách nghịch dảo ma trận -A và so hai cái bằng nhau hay k 
print("cau d")
print("ma trận B tao ra từ hàng đầu hàng cuối của ma trận A ")
print(B)
print("cau j")
print("tổng các số trên biên của ma trận : ", sum)
print("cau f")
print("các số chẵn trong ma trận: ")
counteven()
print("cau e")
print("vector dc tạo từ ma trận A và sắp xếp thứ tự từ lớn tới bé : ", A_vector)
print("cau i")

print("ma trận hoán vị cột thứ nhất và thứ 3 : ")
print(C)
print("cau g")
reverstfirstandlast()
print("cau h")
replaceeven()