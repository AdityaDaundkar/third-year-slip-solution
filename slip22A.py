class StringRepeater:
    def __init__(self, input_string):
        self.input_string = input_string

    def __mul__(self, n):
        if isinstance(n, int):
            return self.input_string * n
        else:
            raise TypeError("Invalid type for repetition count. Please provide an integer.")

# Input from the user
input_string = input("Enter a string: ")
repetition_count = int(input("Enter the number of repetitions: "))

# Create an instance of the StringRepeater class
repeater = StringRepeater(input_string)

# Use the overloaded * operator to display n repetitions
result = repeater * repetition_count
print(f"{repetition_count} repetitions of '{input_string}':")
print(result)
