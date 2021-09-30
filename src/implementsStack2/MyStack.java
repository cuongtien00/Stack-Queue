package implementsStack2;

public class MyStack {
    private int[] arr;
    private int size ;
    private int index = 0;

    public MyStack(int size) {
        this.size = size;
        arr = new int[size];
    }

    public int getIndex() {
        return index;
    }

    public void push(int e){
        if(isFull()){
            throw new StackOverflowError("Stack is full");
        }
        arr[index] = e;
        index++;
    }
    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is null");
        }
        return arr[--index];
    }
    public int size(){
        return index;
    }

    public boolean isEmpty() {
        if(index == 0)
            return true;
        return false;
    }

    public boolean isFull(){
        boolean status = false;
        if(index == size){
            status = true;
        }
        return status;
    }
}
