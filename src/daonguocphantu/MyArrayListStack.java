package daonguocphantu;

public class MyArrayListStack<N> {
    private static final int SIZE = 10;
    private N[] elements ;
    private int count = 0;

    public MyArrayListStack() {
        elements = (N[])new Object[SIZE];
    }
    public void push(N e){
        ensureCapacity();
        elements[count++] = e;
    }
    private void ensureCapacity() {
        if(count >= elements.length){
            N[] newElements = (N[]) new Object[elements.length * 2 + 1];
            System.arraycopy(elements, 0, newElements, 0, count);
            elements = newElements;

        }
    }


    public static void main(String[] args) {
        MyArrayListStack<Integer> stack = new MyArrayListStack<>();
        stack.push(1);
    }
}
