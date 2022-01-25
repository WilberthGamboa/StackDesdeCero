class Stack {
    private int maxSize;
    private int top;
    private long[] stackArray;
     
    public Stack(int s) {
        this.maxSize=s;
        this.stackArray =  new long [s]; 
        this.top=-1;
    }

    public void push(long j) {
        stackArray[++top] = j;
    }
    
    public long pop()  {
        return stackArray[top--]; 
    }
     
    public long peek() {
        return stackArray[top]; 
    }
    
    public boolean isEmpty() {
        return (top == -1); 
    }
     
    public boolean isFull() {
        return (top == maxSize-1); 
    }
}

