class Solution{
	
	public int MinimumCosttoConnectRopes(int arr[])
	{
		PriorityQueue<Integer> min_heap = new PriorityQueue<>();
		int cost = 0;

		for(int i=0;i<arr.length;i++)
		{
			min_heap.add(arr[i]);
		}

		while(min_heap.size>=2)
		{
			int first = min_heap.poll();
			int second = min_heap.poll();

			cost += first + second;
			min_heap.add(first + second);

		}

		int res = min_heap.remove();

		return res;
	}
}
