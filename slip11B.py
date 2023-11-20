import tkinter as tk

def change_background_color(color):
    root.configure(bg=color)

def create_color_menu():
    color_menu = tk.Menu(menu_bar, tearoff=0)
    color_menu.add_command(label="Red", command=lambda: change_background_color("red"))
    color_menu.add_command(label="Green", command=lambda: change_background_color("green"))
    color_menu.add_command(label="Blue", command=lambda: change_background_color("blue"))
    color_menu.add_command(label="Yellow", command=lambda: change_background_color("yellow"))
    return color_menu

# Create the main window
root = tk.Tk()
root.title("Change Background Color")

# Create the menu bar
menu_bar = tk.Menu(root)
root.config(menu=menu_bar)

# Create the "Color" menu with color options
color_menu = create_color_menu()
menu_bar.add_cascade(label="Color", menu=color_menu)

# Create a label to display the selected color
label = tk.Label(root, text="Background Color", width=20, height=10, relief=tk.RAISED)
label.pack(expand=True, fill=tk.BOTH)

root.mainloop()
