import tkinter as tk

def add_item():
    item = entry.get()
    if item:
        listbox.insert(tk.END, item)
        entry.delete(0, tk.END)

def print_items():
    selected_items = listbox.curselection()
    for index in selected_items:
        print(listbox.get(index))

def delete_items():
    selected_items = listbox.curselection()
    for index in selected_items:
        listbox.delete(index)

# Create the main window
root = tk.Tk()
root.title("Listbox Example")

# Create an entry field for adding items
entry = tk.Entry(root)
entry.pack()

# Create a Listbox widget to display the items
listbox = tk.Listbox(root, selectmode=tk.MULTIPLE)
listbox.pack()

# Create buttons to add, print, and delete items
add_button = tk.Button(root, text="Add", command=add_item)
print_button = tk.Button(root, text="Print", command=print_items)
delete_button = tk.Button(root, text="Delete", command=delete_items)

add_button.pack(pady=5)
print_button.pack(pady=5)
delete_button.pack(pady=5)

root.mainloop()
