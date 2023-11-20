class Circle():
    def __init__(self, r):
        self.radius = r
    def area(self):
        return self.radius**2*3.14
    
    def circumference(self):
        return 2*self.radius*3.14
radius=int(input("Enter radius of circle: "))
NewCircle = Circle(radius)
print(NewCircle.area())
print(NewCircle.circumference())
