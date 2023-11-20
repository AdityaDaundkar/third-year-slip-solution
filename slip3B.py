class Student:
    def __init__(self):
        pass
    def GetStudent(self):
        self.Name=input("Enter Student Name: ")
        self.RollNo=int(input("Enter Student Roll No: "))
        self.Age=int(input("Enter Student Age: "))
        self.Gender=input("Enter Student Gender: ")
    def PutStudent(self):
        print("Student Name:",self.Name)
        print("Student Roll No:",self.RollNo)
        print("Student Age:",self.Age)
        print("Student Gender:",self.Gender)
 
class Test(Student):
    def __init__(self):
        pass
        Student.__init__(self)
    def GetMarks(self):
        self.MarkPy=int(input("Enter Marks of Python Subject: "))
        self.MarkJava=int(input("Enter Marks of Java Subject: "))
        self.MarkCS=int(input("Enter Marks of Cyber Security Subject: "))
    def PutMarks(self):
        print("Python Marks:", self.MarkPy)
        print("Java Marks:", self.MarkJava)
        print("Cyber Security Marks:", self.MarkCS)
        print("Total Marks:",self.MarkPy+self.MarkJava+self.MarkCS)
 
n=int(input("Enter Number of Students: "))
lst=[]
for i in range(n):
    print("\nEnter Details of Student",i+1)
    obj=f"Student{i}"
    lst.append(obj)
    lst[i]=Test()
    lst[i].GetStudent()
    lst[i].GetMarks()
for j in range(n):
    print("\nDisplay Details of Student",j+1)
    lst[j].PutStudent()
    lst[j].PutMarks()
