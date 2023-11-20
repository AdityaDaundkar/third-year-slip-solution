import tkinter as tk
import random
import string

def generate_password():
    password_length = int(length_entry.get())
    characters = string.ascii_letters
    password = ''.join(random.choice(characters) for _ in range(password_length))
    password_result.config(text=password)

# Create the main window
root = tk.Tk()
root.title("Random Password Generator")

# Create and place a label
label = tk.Label(root, text="Password Length:")
label.pack(pady=10)

# Create an entry field for password length
length_entry = tk.Entry(root)
length_entry.pack()

# Create a button to generate a password
generate_button = tk.Button(root, text="Generate Password", command=generate_password)
generate_button.pack(pady=10)

# Create a label to display the generated password
password_result = tk.Label(root, text="", font=("Arial", 12))
password_result.pack()

root.mainloop()
