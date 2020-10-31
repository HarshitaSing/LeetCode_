class Solution{
	
	 int KthSmallestElement(int nums[] , int K)
	{
		PriorityQueue<Integer> max_heap = new PriorityQueue<>();

      for(int i=0;i<nums.length;i++)
      {
        max_heap.add(nums[i]);
        while(max_heap.size() > K)
          max_heap.remove();
      }

		return max_heap.poll();
	}


	public int smallestElements(int[] arr,int K1,int K2)
	{
		int num1 = KthSmallestElement(arr,K1);
		int num2 = KthSmallestElement(arr,K2);
		int sum = 0;

      for(int i=0;i<arr.length;i++)
      {
        if(arr[i] > num1 &&  arr[i] < num2)
          sum += arr[i];
      }

		return sum;
	}
}

