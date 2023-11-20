def count_char(str):
    mylist=list()
    for i in str:
        mylist.append(i)
    for j in mylist:
        count=mylist.count(j)
        if count>1:
            print(j," - ",count)
            while count>1:
                mylist.remove(j)
                count=mylist.count(j)
str="thequickbrownfoxjumpsoverthelazydog"
count_char(str)
