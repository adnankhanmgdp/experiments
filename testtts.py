from gtts import gTTS
import os
import os.path
import time
import google.generativeai as genai
import re

genai.configure(api_key='AIzaSyBW_AY2BFoIQDbdMxqGdU-1M4hxh-ajdKs')
model = genai.GenerativeModel("gemini-1.5-flash")
def streamtext(query:str):
    try:
        response = model.generate_content(f"Don't give too large responses and also don't use any emoji in response. {query}", stream=True)
        for chunk in response:
            text = chunk.text
            if "*" in text or "#" in text or "-" in text:
                text = text.replace("*","")
                text = text.replace("#", "")
                text = text.replace("-", "")
            print(text)
            tts(text)
            print("_" * 80)
    except:
        print('couldn\'t generate response')



def tts(text:str):
    try:
        if bool(re.search(r'[A-Za-z]', text)) or bool(re.search(r'[\u0900-\u097F]', text)):
            text = text.strip()
            tts = gTTS(text)
            p = tts.stream()
            for s in p:
                f = open('ai.mp3', 'ab')
                f.write(s)
                f.close()
    except:
        print("couldn't convert text to speech")


if __name__=="__main__":
    try:
        while True:
            query = input("Ask something: ")
            streamtext(query)
    except KeyboardInterrupt:
        print("Bye Bye")
