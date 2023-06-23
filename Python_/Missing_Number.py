class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        nums.sort()
        for i in range(len(nums)):
            print(i)
            if i != nums[i]:
                return i #if the number is present somewhere in the middle of the list

        return nums[-1]+1 #if the number is present at the end
                