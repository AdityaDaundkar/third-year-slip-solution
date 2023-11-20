class complex:
	def __init__(self,real,imag):
		self.real=real
		self.imag=imag
	def __add__(self,other):
		real= self.real + other.real
		imag= self.imag + other.imag
		obj3=complex(real,imag)
		return obj3

obj1=complex(2,5)
obj2=complex(5,1)
obj3=obj1+obj2
print(f"{obj1.real} + {obj1.imag}i")
print(f"{obj2.real} + {obj2.imag}i")
print(f"Addition: {obj3.real} + {obj3.imag}i")
