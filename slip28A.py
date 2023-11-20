from tkinter import *

top = Tk()

listbox = Listbox(top, height = 10,
				width = 15,
				bg = "white",
				activestyle = 'dotbox',
				font = "Helvetica",
				fg = "black")


top.geometry("300x250")

label = Label(top, text = " Computer Science Courses")

listbox.insert(1, "Core Java")
listbox.insert(2, "Python")
listbox.insert(3, "C++")
listbox.insert(4, "Javascript")
listbox.insert(5, "C Language")

label.pack()
listbox.pack()

top.mainloop()
