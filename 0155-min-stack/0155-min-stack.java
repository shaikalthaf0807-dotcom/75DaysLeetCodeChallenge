class MinStack {
    public Deque<Integer> stak;
    public Deque<Integer> minStak;

    public MinStack() {
        stak = new ArrayDeque<>();
        minStak = new ArrayDeque<>();
    }
    
    public void push(int val) {
        stak.push(val);

        if(minStak.isEmpty() || val <= minStak.peek()){
            minStak.push(val);
        }
    }
    
    public void pop() {
        int x= stak.pop();

        if(x== minStak.peek()){
            minStak.pop();
        }
    }
    
    public int top() {
        return stak.peek();
    }
    
    public int getMin() {
        return minStak.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */