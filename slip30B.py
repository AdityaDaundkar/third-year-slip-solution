class Country:
    def __init__(self, nationality):
        self.nationality = nationality

    def print_nationality(self):
        print("Nationality:", self.nationality)

class State(Country):
    def __init__(self, nationality, state_name):
        super().__init__(nationality)
        self.state_name = state_name

    def print_state(self):
        print("State:", self.state_name)

    def print_state_country_nationality(self):
        print("State:", self.state_name)
        self.print_nationality()

# Create an instance of the State class
state_info = State("Indian", "California")

# Call methods to print state, country, and nationality
state_info.print_state_country_nationality()
