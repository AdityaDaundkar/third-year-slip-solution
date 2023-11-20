areaSquare=lambda length : length * length
areaRect=lambda length,width : length * width

l=int(input("Enter Length of Square: "))
print("Area of Square:",areaSquare(l))

l=int(input("\nEnter Length of Rectangle:"))
w=int(input("Enter Width of Rectangle: "))
print("Area of Rectangle:",areaRect(l,w))
