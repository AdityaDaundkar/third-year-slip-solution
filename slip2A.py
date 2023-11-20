def countcase(str):
    upper,lower=0,0
    for i in str:
        if(i.isupper()==True):
            upper+=1
        elif(i.islower()==True):
            lower+=1
    print(" No. of Upper case characters: ",upper)
    print(" No. of Lower case characters: ",lower)
#Tgts
str=input("Enter string: ")
countcase(str)
