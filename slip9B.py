import tkinter as tk
from tkinter import messagebox

def is_prime(n):
    if n <= 1:
        return False
    if n <= 3:
        return True
    if n % 2 == 0 or n % 3 == 0:
        return False
    i = 5
    while i * i <= n:
        if n % i == 0 or n % (i + 2) == 0:
            return False
        i += 6
    return True

def is_perfect(n):
    if n <= 1:
        return False
    divisors = [1]
    for i in range(2, n):
        if n % i == 0:
            divisors.append(i)
    return sum(divisors) == n

def is_armstrong(n):
    num_str = str(n)
    power = len(num_str)
    num_sum = sum(int(digit) ** power for digit in num_str)
    return num_sum == n

def check_number():
    number = int(entry.get())
    result = ""
    
    if prime_var.get() and is_prime(number):
        result += "Prime, "
    
    if perfect_var.get() and is_perfect(number):
        result += "Perfect, "
    
    if armstrong_var.get() and is_armstrong(number):
        result += "Armstrong, "
    
    if result:
        messagebox.showinfo("Result", f"The number {number} is {result[:-2]}.")
    else:
        messagebox.showinfo("Result", f"The number {number} is not any of the selected types.")

# Create the main window
root = tk.Tk()
root.title("Number Checker")

# Create an entry field for the number
entry_label = tk.Label(root, text="Enter a number:")
entry_label.pack(pady=10)
entry = tk.Entry(root)
entry.pack()

# Create radio buttons for selection
prime_var = tk.BooleanVar()
perfect_var = tk.BooleanVar()
armstrong_var = tk.BooleanVar()

prime_check = tk.Checkbutton(root, text="Prime", variable=prime_var)
perfect_check = tk.Checkbutton(root, text="Perfect", variable=perfect_var)
armstrong_check = tk.Checkbutton(root, text="Armstrong", variable=armstrong_var)

prime_check.pack()
perfect_check.pack()
armstrong_check.pack()

# Create a button to check the number
check_button = tk.Button(root, text="Check Number", command=check_number)
check_button.pack(pady=10)

root.mainloop()
