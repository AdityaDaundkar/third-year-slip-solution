n=int(input("Enter size of queue: "))
print("Enter elements of queue: ")
mylist=list()
for i in range(n):
    ele=input()
    mylist.append(ele)
print("Current queue:- ")
print(mylist)
print("\n")
for j in range(len(mylist)):
    print(mylist)
    pop_ele=mylist.pop(0)
    print(pop_ele)
