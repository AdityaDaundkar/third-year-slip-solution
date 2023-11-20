import tkinter as tk

def convert_to_uppercase():
    input_text = input_entry.get()
    uppercase_text = input_text.upper()
    result_label.config(text=uppercase_text)

# Create the main window
root = tk.Tk()
root.title("Uppercase Converter")

# Create an entry field to input the text
input_label = tk.Label(root, text="Enter text:")
input_label.pack()
input_entry = tk.Entry(root)
input_entry.pack()

# Create a button to convert to uppercase
convert_button = tk.Button(root, text="Convert to Uppercase", command=convert_to_uppercase)
convert_button.pack(pady=10)

# Create a label to display the converted text
result_label = tk.Label(root, text="")
result_label.pack()

root.mainloop()
