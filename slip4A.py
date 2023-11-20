#Import the required libraries
from tkinter import *
from random import shuffle
import time
#Create an instance of Tkinter frame
win = Tk()
win.geometry("700x250")
#Add fonts for all the widgets
win.option_add("*Font", "aerial")
# Define the backround color for all the widgets
def change_color():
   colors= ['#e9c46a','#e76f51','#264653','#2a9d8f','#e85d04','#a2d2ff','#06d6a0','#4d908e']
   while True:
      shuffle(colors)
      for i in range(0,len(colors)):
         win.config(background=colors[i])
         win.update()
         time.sleep(1)
#Display bunch of widgets
label=Label(win, text="Hello World", bg= 'white')
label.pack(pady= 40, padx= 30)
#Create a Button to change the background color of the widgets
btn=Button(win, text="Button", command= change_color)
btn.pack(pady= 10)
win.mainloop()
