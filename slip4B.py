class Employee:
    def AcceptEmp(self):
        self.Id=int(input("Enter emp id:"))
        self.Name=input("Enter emp name:")
        self.Dept=input("Enter emp Dept:")
        self.Sal=int(input("Enter emp Salary:"))
 
    def DisplayEmp(self):
        print("Emp id:",self.Id)
        print("Emp Name:",self.Name)
        print("Emp Dept:",self.Dept)
        print("Emp Salary:",self.Sal)
 
class Manager(Employee):
    def AcceptMgr(self):
        self.bonus=int(input("Enter Manager Bonus: "))
    def DisplayMgr(self):
        print("Manger Bonus is:",self.bonus)
        self.TotalSal=self.Sal+self.bonus
        print("Total Salary: ", self.TotalSal)
 
n=int(input("Enter Number of Manager: "))
lst=[]

for i in range(n):
    print("\nEnter Details of Manager ",i+1)
    obj=f"manager{i}"
    lst.append(obj)
    lst[i]=Manager()
    lst[i].AcceptEmp()
    lst[i].AcceptMgr()

for j in range(n):
    print("\nDisplay Details of Manager",j+1)
    lst[j].DisplayEmp()
    lst[j].DisplayMgr()
 
#maximum logic
maxTotalSal= lst[0].TotalSal
maxIndex=0
for j in range(n):
    if lst[j].TotalSal > maxTotalSal:
        maxTotalSal= lst[j].TotalSal
        maxIndex=j
print("\nDisplay Details of Manager Having Maximum Salary(Salary+Bonus)")
lst[maxIndex].DisplayEmp()
lst[maxIndex].DisplayMgr()
