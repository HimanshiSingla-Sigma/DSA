class StockSpanner {

    static class Pair{
        int element;
        int span;
        Pair(int element, int span){
            this.element = element;
            this.span = span;
        }
    }

    Stack<Pair> stack;
    ArrayList<Integer> arr;

    public StockSpanner() {
        stack = new Stack<>();
        arr = new ArrayList<>();
    }
    
    public int next(int price) {
        arr.add(price);
        int stock_span = 1;
        while( !stack.isEmpty() && stack.peek().element <= price){
            stock_span += stack.peek().span;
            stack.pop();
        }

        stack.push(new Pair(price, stock_span));

        return stock_span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */