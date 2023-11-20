import tkinter as tk

def count_occurrences():
    input_string = string_entry.get()
    char_to_count = char_entry.get()
    if len(char_to_count) == 1:
        count = input_string.count(char_to_count)
        result_label.config(text=f"'{char_to_count}' appears {count} times in the string.")
    else:
        result_label.config(text="Please enter a single character to count.")

# Create the main window
root = tk.Tk()
root.title("Character Occurrence Counter")

# Create an entry field to input the string
string_label = tk.Label(root, text="Enter a string:")
string_label.pack(pady=10)
string_entry = tk.Entry(root)
string_entry.pack()

# Create an entry field to input the character to count
char_label = tk.Label(root, text="Enter a character:")
char_label.pack()
char_entry = tk.Entry(root)
char_entry.pack()

# Create a button to count the occurrences
count_button = tk.Button(root, text="Count Occurrences", command=count_occurrences)
count_button.pack(pady=10)

# Create a label to display the count result
result_label = tk.Label(root, text="")
result_label.pack()

root.mainloop()
