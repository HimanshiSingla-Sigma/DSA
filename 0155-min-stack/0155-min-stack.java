class MinStack {

    Stack<Integer> normal;
    Stack<Integer> min;

    public MinStack() {
        normal = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int value) {
        normal.push(value);
        if( min.isEmpty()){
            min.push(value);
        }else{
            min.push(Math.min(value, min.peek()));
        }
    }
    
    public void pop() {
        if( !normal.isEmpty()){
            normal.pop();
            min.pop();
        } 
    }
    
    public int top() {
        if( !normal.isEmpty()){
            return normal.peek();
        }
        return -1;
    }
    
    public int getMin() {
        if( !min.isEmpty()){
            return min.peek();
        }
        return -1;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */