class Person:
    def __init__(self, name, address):
        self.name = name
        self.address = address

class Employee(Person):
    def __init__(self, name, address, staffed_salary):
        super().__init__(name, address)
        self.staffed_salary = staffed_salary

# Function to create 'n' Employee objects and display their details
def create_and_display_employees(n):
    employees = []
    for i in range(n):
        name = input(f"Enter name of Employee {i + 1}: ")
        address = input(f"Enter address of Employee {i + 1}: ")
        staffed_salary = float(input(f"Enter staffed salary of Employee {i + 1}: "))
        employee = Employee(name, address, staffed_salary)
        employees.append(employee)
    
    print("\nEmployee Details:")
    for i, employee in enumerate(employees):
        print(f"\nEmployee {i + 1}:")
        print(f"Name: {employee.name}")
        print(f"Address: {employee.address}")
        print(f"Staffed Salary: {employee.staffed_salary}")

# Input for the number of employees
n = int(input("Enter the number of employees: "))
create_and_display_employees(n)
