def create_dict(n):
    mydict=dict()
    for i in range(1,n+1):
        mydict[i]=i*i
    return mydict
n=int(input("Enter size of dictionary: "))
dictionary=create_dict(n)
print(dictionary)
