def Fibo(terms2):
    f1=0
    yield f1
    f2=1
    yield f2
    for i in range(0,terms2-2):
        f3=f1+f2
        yield f3
        f1=f2
        f2=f3
#mainbody
terms1=int(input("How many terms: "))
gen=Fibo(terms1)
while True:
    try:
        print(next(gen))
    except StopIteration:
        break
