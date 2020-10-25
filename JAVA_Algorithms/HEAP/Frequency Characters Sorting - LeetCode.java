class Solution {
    
    public String frequencySort(String s) 
    {
      HashMap<Character,Integer> map = new HashMap<>();
        
      PriorityQueue<Map.Entry<Character,Integer>> max_heap = new PriorityQueue<>((a,b)->(a.getValue() == b.getValue()?a.getKey().compareTo(b.getKey()) : b.getValue() - a.getValue()));
        
      
        for(int i=0;i<s.length();i++)
        {
            char ch= s.charAt(i);
            if(map.containsKey(ch))
            {
                map.put(ch, map.getOrDefault(ch , 0) + 1);
            }
            else
                map.put(ch,1);
        }
        
        
        for(Map.Entry<Character,Integer> e :map.entrySet())
        {
                max_heap.add(e);
        }
        
        
        StringBuilder sb = new StringBuilder();
        
       while(!max_heap.isEmpty()){
           char c = (char) max_heap.peek().getKey();
           int count = (int) max_heap.peek().getValue();
           while(count>0){
               sb.append(c);
               count--;
           }
           max_heap.poll();
       }
       return sb.toString();
    }
}