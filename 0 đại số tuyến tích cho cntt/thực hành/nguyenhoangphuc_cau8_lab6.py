from array import array
from multiprocessing.dummy import Array
import numpy as np 
T1= [0 ,4 ,0 ,0 ,0 ,2 ,1 ,3]
T2= [3 ,1 ,4 ,3 ,1 ,2 ,0 ,1]
T3= [3 ,0 ,0 ,0 ,3 ,0 ,3 ,0]
T4= [0 ,1 ,0 ,3 ,0 ,0 ,2 ,0]
T5= [2 ,2 ,2 ,3 ,1 ,4 ,0 ,2]
array = np.array([T1,T2,T3,T4 ,T5])
for i in range(array.shape[0]): 
    for j in range(array.shape[0]): 
        if(i==j):
            continue 
        A=np.dot(array[i], array[j])
        B= np.linalg.norm( array[i],2)
        C= np.linalg.norm( array[j],2)
        answer= A/(B*C) 
        print(answer)
def cosine_similarity(list_1, list_2):
    cos_sim = np.dot(list_1, list_2) / (np.linalg.norm(list_1) * np.linalg.norm(list_2))
    return cos_sim    
   
T1= [1.0 ,0.5 ,0.3, 0 ,0 ,0]
T2= [0.5 ,1.0, 0, 0, 0, 0]
T3= [0 ,1.0 ,0.8 ,0.7 ,0 ,0]
T4= [0 ,0.9 ,1.0 ,0.5 ,0, 0]
T5= [0 ,0 ,0 ,1.0 ,0, 1.0]
T6= [0 ,0, 0, 0 ,0.7, 0]
T7= [0.5, 0, 0.7 ,0 ,0 ,0.9]
T8= [0, 0.6 ,0 ,1.0 ,0.3 ,0.2]
array = np.array([T1,T2,T3,T4 ,T5,T6,T7 ,T8])
p=np.array([0, 0, 0.7, 0.5, 0 ,0.3])
F= np.array([])
M=0
for i in array: 
    if(cosine_similarity(p,i )>M):
       F= i
print("this is the Cosine Similarity")     
print(F)

        
  

