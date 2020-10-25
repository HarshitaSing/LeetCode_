class Solution
{
  class Pair implements Comparable<Pair>
  {
    int first;
    int second;

    Pair(int first,int second)
    {
     this.first = first;
     this.second = second;
    }

    public int compareTo(Pair o)
    {
    	return this.first - o.first;
    }
  }	

  public int[] topKfrequent(int[] nums,int k)
  {
  	HashMap<Integer,Integer> map = new HashMap<>();
  	PriorityQueue<Pair> max_heap = new PriorityQueue<>();

  	for(int i=0; i < nums.length; i++)
  	{
  		map.put(nums[i],map.getorDefault(nums[i],0) + 1);	
  	}

  	for(Map.Entry<Integer,Integer> e:map.entrySet())
  	{
  		max_heap.add(new Pair(e.getValue(),e.getKey()));
  	}

  	while(max_heap.size() > k)
  	{
  		max_heap.remove();
  	}

  	int res[] = new int[k];
  	//int i=0;

  	while(!max_heap.isEmpty())
  	{
  		int freq = max_heap.poll().first;
  		int element = max_heap.poll().second;
  		for(int i=0;i<freq;i++)
  			res[i] = element;
  		max_heap.remove();
  	}

  	return res;

  }
}
