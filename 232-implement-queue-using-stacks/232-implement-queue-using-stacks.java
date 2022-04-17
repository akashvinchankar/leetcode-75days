class MyQueue {

    Stack<Integer> stack;
    public MyQueue() {
        stack=new Stack<>();
    }
    
    public void push(int x) {
        stack.push(x);
    }
    
    public int pop() {
        Stack<Integer> s=new Stack<>();
        int n=stack.size();
        for(int i=0;i<n;i++){
            s.push(stack.pop());
        }
        
        int m=s.pop();
        int nn=s.size();
        for(int i=0;i<nn;i++){
            stack.push(s.pop());
        }
        return m;
        
    }
    
    public int peek() {
        Stack<Integer> s=new Stack<>();
        int n=stack.size();
        for(int i=0;i<n;i++){
            s.add(stack.pop());
        }
        int a=s.peek();
        int nn=s.size();
        for(int i=0;i<nn;i++){
            stack.push(s.pop());
        }
        return a;
    }
    
    public boolean empty() {
        return stack.size()<=0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */