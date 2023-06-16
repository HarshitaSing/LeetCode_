# using one pass Hash method 
# where we store the list value as keys in the hashmap.
#O(n)

def twoSum(self, nums: List[int], target: int) -> List[int]:
        hash_map = {}
        for i in range(len(nums)):
            #print(i)
            val_index = target - nums[i]
            if val_index in hash_map:
                return [hash_map[val_index], i]
            hash_map[nums[i]] = i 

        return []