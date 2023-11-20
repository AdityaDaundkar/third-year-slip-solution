lst=[12,10,17,9,1]
cnt=len(lst)
for i in range(0,cnt-1):
    for j in range(0,cnt-1):
        if lst[j]>lst[j+1]:
            temp=lst[j]
            lst[j]=lst[j+1]
            lst[j+1]=temp
print(lst)
