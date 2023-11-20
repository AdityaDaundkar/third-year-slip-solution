import tkinter as tk
import math

def calculate_surface_area_and_volume():
    try:
        radius = float(radius_entry.get())
        height = float(height_entry.get())

        surface_area = 2 * math.pi * radius * (radius + height)
        volume = math.pi * radius**2 * height

        surface_area_result.config(text=f"Surface Area: {surface_area:.2f}")
        volume_result.config(text=f"Volume: {volume:.2f}")
    except ValueError:
        surface_area_result.config(text="Invalid input")
        volume_result.config(text="Invalid input")

# Create the main window
root = tk.Tk()
root.title("Cylinder Calculator")

# Create labels and entry fields for radius and height
radius_label = tk.Label(root, text="Radius:")
radius_label.pack(pady=10)
radius_entry = tk.Entry(root)
radius_entry.pack()

height_label = tk.Label(root, text="Height:")
height_label.pack()
height_entry = tk.Entry(root)
height_entry.pack()

# Create a button to calculate the surface area and volume
calculate_button = tk.Button(root, text="Calculate", command=calculate_surface_area_and_volume)
calculate_button.pack(pady=10)

# Create labels to display the surface area and volume
surface_area_result = tk.Label(root, text="")
surface_area_result.pack()
volume_result = tk.Label(root, text="")
volume_result.pack()

root.mainloop()
