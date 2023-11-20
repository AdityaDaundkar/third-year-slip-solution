import tkinter as tk

def alter_sentence():
    input_text = input_entry.get()
    altered_text = ""
    for char in input_text:
        if char.isspace():
            altered_text += "*"
        elif char.isalpha():
            if char.islower():
                altered_text += char.upper()
            else:
                altered_text += char.lower()
        elif char.isdigit():
            altered_text += "?"
        else:
            altered_text += char
    result_label.config(text=altered_text)

# Create the main window
root = tk.Tk()
root.title("Sentence Alteration")

# Create an entry field to input the sentence
entry_label = tk.Label(root, text="Enter a sentence:")
entry_label.pack(pady=10)
input_entry = tk.Entry(root)
input_entry.pack()

# Create a button to alter the sentence
alter_button = tk.Button(root, text="Alter Sentence", command=alter_sentence)
alter_button.pack(pady=10)

# Create a label to display the altered sentence
result_label = tk.Label(root, text="")
result_label.pack()

root.mainloop()
