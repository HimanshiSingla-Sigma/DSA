class MyQueue {

    Stack<Integer> in ;
    Stack<Integer> out;

    public MyQueue() {
        in = new Stack<>();
        out = new Stack<>();
    }

    public void transfer(){
        if(out.isEmpty()){
            // transfer all the elements of in stack to out stack
            while( !in.isEmpty()){
                out.push(in.pop());
            }
        }
    }
    
    public void push(int x) {
        in.push(x);
    }
    
    public int pop() {
        transfer();
        return !out.isEmpty() ? out.pop() : -1;
    }
    
    public int peek() {
        transfer();
        return !out.isEmpty() ? out.peek() : -1;
    }
    
    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
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