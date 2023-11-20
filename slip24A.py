def Prime(num):
    flag=0
    for i in range(2,num):
        if num%i==0 :
            flag=1
            break
    if flag==0:
        print("Number is Prime")
    else:
        print("Number is Not Prime")
def Fact(num):
    f=1
    for i in range(1,num+1):
        f=f*i
    print("Factorial of Given number is:",f)
#main body
n=int(input("Enter any number to Check:"))
Prime(n)
Fact(n)
