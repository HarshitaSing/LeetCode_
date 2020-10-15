class Solution {
    
    class pair
    {
        int val,index;
        pair(int a ,int b)
        {
            val = a;
            index = b;
        }
    }
    
    public int largestRectangleArea(int[] heights) 
    {
        
        int n = heights.length;
        int temp_index = n ;
        Stack<pair> stk = new Stack<>();
        int left[] = new int[n];
        int right[] = new int[n];
        int w[] = new int[n];
        
       // <!-  Nearest Smaller Element to Right       
        for(int i= n-1 ; i>=0;i--)
        {
            if(stk.size() == 0)
                right[i] = temp_index;
        
            else if(!stk.isEmpty() && stk.peek().val >= heights[i])
            {
                while(!stk.isEmpty() && stk.peek().val >= heights[i])
                    stk.pop();
                if(stk.size() == 0)
                    right[i] = temp_index;
                else
                    right[i] = stk.peek().index;
            }
            else
                right[i] = stk.peek().index;
            
            stk.add(new pair(heights[i],i));
        }
        stk.clear(); 
    
        // Nearest Smaller Element to Left
        for(int i=0; i < n; i++)
        {
            if(stk.size() == 0)
                left[i] = -1;
            else if(!stk.isEmpty() && stk.peek().val >= heights[i])
            {
                while(!stk.isEmpty() && stk.peek().val >= heights[i])
                    stk.pop();
                if(stk.size() == 0)
                    left[i] = -1;
                else
                    left[i] = stk.peek().index;
            }
            else
                left[i] = stk.peek().index;
            stk.add(new pair(heights[i],i));
        }
         
        int max = 0;
        for(int i=0;i<n;i++)
        {            
            w[i] = Math.abs(right[i]-left[i])-1;
            max = Math.max((w[i]*heights[i]),max);
        }
        
        return max;
        
    }
}
