import tkinter as tk

# Function to convert a digit to its word representation
def digit_to_word(digit):
    words = ["Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"]
    return words[digit]

# Function to display each digit of the number in words
def display_digits_in_words():
    try:
        number = int(entry.get())
        digits_in_words = [digit_to_word(int(digit)) for digit in str(number)]
        result_label.config(text=", ".join(digits_in_words))
    except ValueError:
        result_label.config(text="Invalid input. Please enter a valid number.")

# Create the main window
root = tk.Tk()
root.title("Number Digits in Words")

# Create an entry field to input the number
entry_label = tk.Label(root, text="Enter a number:")
entry_label.pack(pady=10)
entry = tk.Entry(root)
entry.pack()

# Create a button to display the digits in words
display_button = tk.Button(root, text="Display Digits in Words", command=display_digits_in_words)
display_button.pack(pady=10)

# Create a label to display the digits in words
result_label = tk.Label(root, text="")
result_label.pack()

root.mainloop()
