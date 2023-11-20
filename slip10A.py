import tkinter.messagebox

def onClick():
    tkinter.messagebox.showinfo("Title goes here","Message goes here")

root = tkinter.Tk()
button = tkinter.Button(root,text = "Click Me", command = onClick)

button.pack()
root.mainloop()
