# Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
# You may assume that each input would have exactly one solution, and you may not use the same element twice.
# You can return the answer in any order.

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        count = 0

        if (len(nums) >= 2 and len(nums) <= 10000):
            for i in range(len(nums)):
                for j in range(i + 1, len(nums)):
                    if (nums[i] + nums[j] == target):
                        index1 = i 
                        index2 = j
                        count += 1

            if (count == 1):
                return [index1, index2]