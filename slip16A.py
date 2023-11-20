class rectangle:
    def __init__(self,length,width):
        self.length=length
        self.width=width
    def area(self):
        return self.length*self.width
    
    def perimeter(self):
        return 2*(self.length+self.width)
length=int(input("Enter length: "))
width=int(input("Enter Width: "))
obj1=rectangle(length,width)
print("Area: ",obj1.area())
print("Perimeter: ",obj1.perimeter())

