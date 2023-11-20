import math

# Function to calculate the area of a cube
def cube_area(side_length):
    return 6 * side_length ** 2

# Function to calculate the volume of a cube
def cube_volume(side_length):
    return side_length ** 3

# Function to calculate the surface area of a sphere
def sphere_area(radius):
    return 4 * math.pi * radius ** 2

# Function to calculate the volume of a sphere
def sphere_volume(radius):
    return (4/3) * math.pi * radius ** 3

# Input for cube and sphere dimensions
side_length_cube = float(input("Enter the side length of the cube: "))
radius_sphere = float(input("Enter the radius of the sphere: "))

# Calculate and display cube area and volume
cube_area_result = cube_area(side_length_cube)
cube_volume_result = cube_volume(side_length_cube)

print(f"Cube Area: {cube_area_result:.2f}")
print(f"Cube Volume: {cube_volume_result:.2f}")

# Calculate and display sphere area and volume
sphere_area_result = sphere_area(radius_sphere)
sphere_volume_result = sphere_volume(radius_sphere)

print(f"Sphere Surface Area: {sphere_area_result:.2f}")
print(f"Sphere Volume: {sphere_volume_result:.2f}")
