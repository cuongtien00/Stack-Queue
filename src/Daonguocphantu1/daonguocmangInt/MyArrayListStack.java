package Daonguocphantu1.daonguocmangInt;

public class MyArrayListStack {
    private int index = 0;
    public int size;
    public int[] arr;

    public MyArrayListStack(int size) {
        this.size = size;
        arr = new int[size];
    }
    public void push(int e){
        if(isFull()){
            System.out.println("Stack da day");
        }
        arr[index] = e;
        index++;
        disPlay();
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Mang trong");
            return Integer.MIN_VALUE;
        }
       int result = arr[--index];
        arr[index] = 0;
        return  result;
    }
    public boolean isFull(){
        return index == size;
    }
    public boolean isEmpty(){
        return index==0;
    }
    public void disPlay(){
        for (int a :arr
             ) {
            System.out.println(a + " ");
        }
        System.out.println("---");
    }

}
