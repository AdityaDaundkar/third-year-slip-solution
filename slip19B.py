class Shape:
    pass
class Square(Shape):
    def __init__(self,l2):
        self.l=l2
    def SArea(self):
        a=self.l * self.l
        print("Area of Square:", a)
    def SPerimeter(self):
        p=4 * self.l
        print("Perimeter of Square:",p)
class Circle(Shape):
    def __init__(self,r2):
        self.r=r2
    def CArea(self):
        a=3.14 * self.r * self.r
        print("Area of Circle:", a)
    def SCircumference(self):
        c=2 * 3.14 * self.r
        print("Circumference of Circle:",c)
#main body
l1=int(input("Enter Length of Square: "))
obj=Square(l1)
obj.SArea()
obj.SPerimeter()
r1=int(input("Enter Radius of Circle: "))
obj=Circle(r1)
obj.CArea()
obj.SCircumference()
