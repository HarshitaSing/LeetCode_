#using Hashmap
# runtime- 547ms
class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        hash_map = {}
        for i in nums:
            if i not in hash_map:
                hash_map[i] = 1
            else:
                hash_map[i] += 1
                if hash_map[i] == 2:
                    return True
            
        return False