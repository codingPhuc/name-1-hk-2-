from cgi import print_directory
import numpy as np 
A = np.arange(1,10).reshape(3,3)
print(A)
print("\n")
print(np.flip(A,axis= 1))
print(np.flip(A,axis= 0))

      

