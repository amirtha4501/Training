
class ConstructorOverloadDemo:

    def __init__(self):
        self.name = "default"

    # def __init__(self, constructorType):
    #     self.name = constructorType

    def printValues(self):
        print(self.name)

demo1 = ConstructorOverloadDemo()
# demo2 = ConstructorOverloadDemo("parameterized with string")

demo1.printValues()
# demo2.printValues()
