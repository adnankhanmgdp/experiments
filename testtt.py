import os
import time
import os.path
import subprocess

def speak():
    while True:
        if os.path.exists('/home/lucifer/Desktop/tests/ai.mp3'):
            os.system('ffplay -v 0 -nodisp -autoexit ~/Desktop/tests/ai.mp3')
            time.sleep(2)
            os.system('rm ai.mp3')
        else:
            time.sleep(0.5)

speak()
