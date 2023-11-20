import math

class Circle:
    def __init__(self, radius):
        self.radius = radius

    def __add__(self, other):
        if isinstance(other, Circle):
            return Circle(self.radius + other.radius)
        else:
            raise ValueError("Invalid operand. You can only add Circle objects.")

    def area(self):
        return math.pi * (self.radius ** 2)

    def __str__(self):
        return f"Circle with radius {self.radius}"

# Input the radii of two circles
radius1 = float(input("Enter the radius of the first circle: "))
radius2 = float(input("Enter the radius of the second circle: "))

# Create two Circle objects
circle1 = Circle(radius1)
circle2 = Circle(radius2)

# Add the radii of the two circles using operator overloading
result_circle = circle1 + circle2

# Display the area of the result circle
print(f"The area of the result circle is {result_circle.area():.2f}")
