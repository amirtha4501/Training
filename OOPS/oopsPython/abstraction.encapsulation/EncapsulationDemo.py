# ACCESS MODIFIERS
# __name - private
# _name - protected
# name - public

class Profile:

    def __init__(self):
        self.__name = "krishna"
        self.roll = 5

    def getName(self):
        return self.__name

    def setName(self, name):
        self.__name = name

isAuthorized = True

profile = Profile()
print(profile.roll)
# print(profile.__name)
print(profile.getName())

if isAuthorized:
    profile.setName("kavi")
    print("Name is updated - ", profile.getName())
else:
    print("You're unauthorized")
