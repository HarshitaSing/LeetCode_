class Solution {
    
    static class Pair implements Comparable<Pair>
    {
        int first;
        int[] second;
        
        Pair(int first,int[] second)
        {
            this.first = first;
            this.second = second;
        }
        
        public int compareTo(Pair o)
        {
            return this.first - o.first;
        }
    }
    
    public int[][] kClosest(int[][] points, int K)
    {
        PriorityQueue<Pair> max_heap = new PriorityQueue<>(Collections.reverseOrder());
        int n = points.length;
        
        int dist[] = new int[n];
        for(int i=0; i<n ; i++)
            dist[i] = points[i][0] * points[i][0] + points[i][1] * points[i][1];
    
    
        for(int i=0; i<n ; i++)
        {
            max_heap.add(new Pair(dist[i], points[i]));
            
            while(max_heap.size() > K)
                max_heap.remove();
        }
        
        int ans[][] = new int[K][2];
        int i=0;
        
        while(!max_heap.isEmpty())
        {
            ans[i] = max_heap.remove().second;
            i++;
        }
        
        return ans;
    }
}
