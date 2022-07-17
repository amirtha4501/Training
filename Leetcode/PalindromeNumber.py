# Given an integer x, return true if x is palindrome integer.
# An integer is a palindrome when it reads the same backward as forward.
# For example, 121 is a palindrome while 123 is not.

class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x >= 0:
            original = str(x)
            reverse = original[::-1]
            return original == reverse
            
# class Solution:
#     def isPalindrome(self, x: int) -> bool:
#         if x >= 0:
#             return str(x) == str(x)[::-1]
 