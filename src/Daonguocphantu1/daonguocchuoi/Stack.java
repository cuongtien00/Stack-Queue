package Daonguocphantu1.daonguocchuoi;

public class Stack {
    public char[] arr;
    public int size;
    public int top = 0;

    public Stack(int size) {
        this.size = size;
        arr = new char[size];
    }
    public void push(char a){
        if(isFull()) System.out.println("Mang da day");
        arr[top] = a;
        top++;
    }
    public char pop(){
        return arr[--top];
    }
    public boolean isFull(){
        return top == size;
    }
    public boolean isEmpty(){
        return top == 0 ;
    }

}
