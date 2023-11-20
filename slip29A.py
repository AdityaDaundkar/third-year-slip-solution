import tkinter as tk
import math

def calculate_volume():
    try:
        radius = float(radius_entry.get())
        volume = (4/3) * math.pi * (radius ** 3)
        result_label.config(text=f"Volume of Sphere: {volume:.2f} cubic units")
    except ValueError:
        result_label.config(text="Invalid input. Please enter a valid number.")

# Create the main window
root = tk.Tk()
root.title("Sphere Volume Calculator")

# Create an entry field to input the radius
radius_label = tk.Label(root, text="Enter the radius:")
radius_label.pack(pady=10)
radius_entry = tk.Entry(root)
radius_entry.pack()

# Create a button to calculate the volume
calculate_button = tk.Button(root, text="Calculate Volume", command=calculate_volume)
calculate_button.pack(pady=10)

# Create a label to display the calculated volume
result_label = tk.Label(root, text="")
result_label.pack()

root.mainloop()
