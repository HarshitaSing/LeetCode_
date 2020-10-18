class MinStack {
    
    Stack<Integer> stk;
    Stack<Integer> stk1; 

    /** initialize your data structure here. */
    public MinStack() {
         stk = new Stack<>();
         stk1 = new Stack<>();
    }
    
    public void push(int x) 
    {
        stk.push(x);
        
        if(stk1.isEmpty() || stk.peek() <= stk1.peek())
            stk1.push(x);
    }
    
    public void pop() 
    {
           if(stk.peek().equals(stk1.peek()))
               stk1.pop();
         stk.pop();
        
    }
    
    public int top() 
    {
        
          return stk.peek();
    }
    
    public int getMin()
    {
         
         return stk1.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */