class Staff:
    def printName(self):
        print("teena")

class Mathematician:
    def printQualification(self):
        print("MSc. Maths")

class MathStaff(Staff, Mathematician):
    pass

mathStaff = MathStaff()
mathStaff.printName()
mathStaff.printQualification()