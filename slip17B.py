class date:
    def acceptdate(self):
        self.day=int(input("Enter Day: "))
        self.month=int(input("Enter Month: "))
        self.year=int(input("Enter Year: "))
    def printdate(self):
        try:
            if(self.day>31):
                raise Exception("Day value is greater than 31")
            if(self.month>12):
                raise Exception("Month value is greater than 12")
            
            if(self.year<0):
                raise Exception("Year value should not be negative")
            print("Date: ",self.day,"-",self.month,"-",self.year)
        except Exception as e:
            print(e)
objdate=date()
objdate.acceptdate()
objdate.printdate()
