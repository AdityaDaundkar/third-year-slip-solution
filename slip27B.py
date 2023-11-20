import tkinter as tk

def convert_and_display():
    decimal_number = entry.get()
    try:
        decimal_number = int(decimal_number)
        binary_number = bin(decimal_number).replace("0b", "")
        octal_number = oct(decimal_number).replace("0o", "")
        hex_number = hex(decimal_number).replace("0x", "").upper()

        binary_label.config(text="Binary: " + binary_number)
        octal_label.config(text="Octal: " + octal_number)
        hex_label.config(text="Hexadecimal: 0x" + hex_number)
    except ValueError:
        binary_label.config(text="Invalid input")
        octal_label.config(text="Invalid input")
        hex_label.config(text="Invalid input")

# Create the main window
root = tk.Tk()
root.title("Number Base Converter")

# Create an entry field to input the decimal number
entry_label = tk.Label(root, text="Enter a decimal number:")
entry_label.pack(pady=10)
entry = tk.Entry(root)
entry.pack()

# Create a button to convert and display the numbers
convert_button = tk.Button(root, text="Convert and Display", command=convert_and_display)
convert_button.pack(pady=10)

# Create labels to display the converted numbers
binary_label = tk.Label(root, text="Binary:")
binary_label.pack()
octal_label = tk.Label(root, text="Octal:")
octal_label.pack()
hex_label = tk.Label(root, text="Hexadecimal:")
hex_label.pack()

root.mainloop()
