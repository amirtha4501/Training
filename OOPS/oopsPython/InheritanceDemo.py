class Staff:

    def __init__(self):
        # self.year = 2001
        self.role = "Staff - general"

    def printRole(self):
        print(self.role)
        # print(self.year)

class ScienceStaff(Staff):

    def __init__(self):
        # Staff.__init__(self)
        self.role = "Staff - science"

class MathStaff(Staff):
    # pass

    def __init__(self):
        # super().__init__()
        self.role = "Staff - math"

staff = Staff()
scienceStaff = ScienceStaff()
mathStaff = MathStaff()

staff.printRole()
scienceStaff.printRole()
mathStaff.printRole()
