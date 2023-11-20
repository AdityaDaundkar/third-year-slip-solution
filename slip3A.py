dict = {'Mon':3,'Tue':5,'Wed':6,'Thu':9}
print("The given dictionary : ",dict)
check_key = input("Enter Key to check: ")
check_value = input("Enter Value: ")
if check_key in dict:
    print(check_key,"is Present.")
    dict.pop(check_key)
    dict[check_key]=check_value
    print("Updated dictionary : ",dict)
else:
    print(check_key, " is not Present.")
    dict[check_key]=check_value
    print("Updated dictionary : ",dict)
