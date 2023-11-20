import tkinter as tk
from tkinter import font

def change_font_style():
    label_font = f"{font_name.get()} {font_size.get()} {'bold' if is_bold.get() else ''}"
    label.config(font=label_font)

# Create the main window
root = tk.Tk()
root.title("Label Font Style Changer")

# Create and place a label
label = tk.Label(root, text="Change Font Style", font=("Arial", 12))
label.pack(pady=10)

# Create font name dropdown
font_name = tk.StringVar()
font_name.set("Arial")
font_label = tk.Label(root, text="Font Name:")
font_label.pack()
font_dropdown = tk.OptionMenu(root, font_name, "Arial", "Helvetica", "Times", "Courier", "Verdana")
font_dropdown.pack()

# Create font size scale
font_size = tk.IntVar()
font_size.set(12)
size_label = tk.Label(root, text="Font Size:")
size_label.pack()
size_scale = tk.Scale(root, from_=8, to=24, orient="horizontal", variable=font_size)
size_scale.pack()

# Create a checkbox for bold font
is_bold = tk.BooleanVar()
bold_check = tk.Checkbutton(root, text="Bold", variable=is_bold, onvalue=True, offvalue=False)
bold_check.pack()

# Create a button to apply font style changes
apply_button = tk.Button(root, text="Apply", command=change_font_style)
apply_button.pack(pady=10)

root.mainloop()
