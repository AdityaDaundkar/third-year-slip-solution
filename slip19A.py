import tkinter as tk

def display_multiplication_table():
    try:
        number = int(entry.get())
        table_text.delete(1.0, tk.END)  # Clear the existing text
        for i in range(1, 11):
            result = f"{number} x {i} = {number * i}\n"
            table_text.insert(tk.END, result)
    except ValueError:
        table_text.delete(1.0, tk.END)
        table_text.insert(tk.END, "Invalid input. Please enter a number.")

# Create the main window
root = tk.Tk()
root.title("Multiplication Table")

# Create an entry field to input the number
entry_label = tk.Label(root, text="Enter a number:")
entry_label.pack(pady=10)
entry = tk.Entry(root)
entry.pack()

# Create a button to display the multiplication table
calculate_button = tk.Button(root, text="Display Table", command=display_multiplication_table)
calculate_button.pack(pady=10)

# Create a text widget to display the multiplication table
table_text = tk.Text(root, width=30, height=10)
table_text.pack()

root.mainloop()
