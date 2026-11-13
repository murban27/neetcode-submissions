class MinStack {
 private final Stack<Integer>stack;
    private final Stack<Integer>minStack;
    public MinStack() {
        this.stack=new Stack<>();
        this.minStack=new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if(minStack.size()>0&&stack.size()>0)
        {
            if(minStack.peek()>=val)
            {
                minStack.push(val);
            }
        }
        else {
            minStack.push(val);
        }
    }

    public void pop() {
        int value=stack.peek();
        stack.pop();
        if(minStack.peek()==value)
        {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        if(minStack.peek()==null)
        {
            return stack.peek();
        }
        else{
            return minStack.peek();
        }
    }
}

