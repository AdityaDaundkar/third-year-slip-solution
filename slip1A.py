list1=[]
n=int(input("Enter number of elements of list:"))
print("Enter elements of list: ")
for i in range(n):
    num=int(input())
    list1.append(num)
set1=set(list1)
list1=list(set1)
#Tgts
print(list1)
