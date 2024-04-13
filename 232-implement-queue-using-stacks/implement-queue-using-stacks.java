
class MyQueue {

    Stack<Integer> st;
    Stack<Integer> st2 = new Stack<>();
    public MyQueue() {
        st = new Stack<>();
    }
    
    public void push(int x) {
        st.push(x);
    }
    
    public int pop() {
        if(st2.empty()){
            while(!st.empty()){
                st2.push(st.pop());
            }
        }
        return st2.pop();      
    }
    
    public int peek() {
        if(st2.empty()){
            while(!st.empty()){
                st2.push(st.pop());
            }
        }
        return st2.peek();          
    }
    
    public boolean empty() {
        if(st.empty() && st2.empty()){
            return true;
        }
        return false;
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