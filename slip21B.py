mytuple=(('333','33'),('1416','55'))
mylist=list()
mylist.append(list(mytuple[0]))
mylist.append(list(mytuple[1]))
list2=list()
for i in range(len(mylist)):
    list3=list()
    for j in range(len(mylist)):
        list3.append(int(mylist[i][j]))
    list2.append(tuple(list3))
print(f"Original Tuple: {mytuple}")
print(f"Modified Tuple: {list2}")
