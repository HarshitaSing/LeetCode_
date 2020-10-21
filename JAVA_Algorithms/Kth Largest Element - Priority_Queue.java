class Solution {
    public int findKthLargest(int[] nums, int k)
    {
        PriorityQueue<Integer> min_Heap = new PriorityQueue<Integer>(); 
        
        for(int i=0;i<nums.length;i++)
        {
            min_Heap.add(nums[i]);
            if(min_Heap.size() > k)
            {
                min_Heap.remove();
            }
        }
        return min_Heap.peek();
    }
}
