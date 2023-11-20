def count(str):
    uppercase=0
    lowercase=0
    for i in str:
        if i==" " or i==".":
            continue
        elif i.isupper():
            uppercase+=1
        elif i.islower():
            lowercase+=1
    return uppercase,lowercase

str="The quick Brow Fox"
result=count(str)
print("No. of Upper case characters : ",result[0])
print("No. of Lower case Characters : ",result[1])
