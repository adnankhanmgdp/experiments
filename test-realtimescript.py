# import realtimestt
import os

ch = 'y'
while ch == 'y':
    os.system("python3 realtimestt.py")
    with open('query.txt','r') as f:
        content = f.read()
        f.close()
    print(f"user-said: {content}")
    ch = input("Do you want do it again? (y/n): ")
