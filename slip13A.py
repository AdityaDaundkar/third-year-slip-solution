try:
    num=int(input("Enter a positive number: "))
    if num<0:
        raise Exception
    print(f"{num} is a positive number.")
    
except ValueError:
    print ("Invalid Input")
except Exception:
    print("You entered Negative number. Try again...")
