class BracketValidator:
    def __init__(self):
        self.opening_brackets = "({["
        self.closing_brackets = ")}]"
        self.stack = []

    def is_valid(self, s):
        for bracket in s:
            if bracket in self.opening_brackets:
                self.stack.append(bracket)
            elif bracket in self.closing_brackets:
                if not self.stack:
                    return False  # No corresponding opening bracket found
                top = self.stack.pop()
                if not self.is_matching(top, bracket):
                    return False  # Mismatched opening and closing brackets
        return not self.stack  # Stack should be empty at the end

    def is_matching(self, open_bracket, close_bracket):
        return self.opening_brackets.index(open_bracket) == self.closing_brackets.index(close_bracket)

# Example usage
validator = BracketValidator()

# Test cases
valid_cases = ["()", "()[]{}", "{[()]}", "({[{}]})"]
invalid_cases = ["[)", "({[)]", "{{{"]
for case in valid_cases:
    print(f'"{case}" is valid: {validator.is_valid(case)}')

for case in invalid_cases:
    print(f'"{case}" is valid: {validator.is_valid(case)}')
