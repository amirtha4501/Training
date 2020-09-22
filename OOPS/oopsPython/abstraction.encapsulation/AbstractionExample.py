from abc import ABC, abstractmethod

class Shape(ABC):

    def __init__(self, color):
        self.color = color
        
    @abstractmethod
    def getArea(self, number1, number2):
        pass

    def getColor(self):
        return self.color
    

class Triangle(Shape):

    def getArea(self, number1, number2):
        return 0.5 * number1 * number2


class Rectangle(Shape):

    def getArea(self, number1, number2):
        return number1 * number2


triangle = Triangle("black")
rectangle = Rectangle("blue")

print(triangle.getArea(2, 5))
print(rectangle.getArea(5, 7))

print(triangle.getColor())
print(rectangle.getColor())
