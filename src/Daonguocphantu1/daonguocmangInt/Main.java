package Daonguocphantu1.daonguocmangInt;

public class Main {
    public static void main(String[] args) {
        MyArrayListStack myArrayListStack = new MyArrayListStack(5);

        myArrayListStack.push(1);
        myArrayListStack.push(2);
        myArrayListStack.push(3);
        myArrayListStack.push(4);
        myArrayListStack.push(5);

        MyArrayListStack myArrayListStack1 = new MyArrayListStack(5);

        for (int i = 0; i < myArrayListStack.arr.length; i++) {
            myArrayListStack1.push(myArrayListStack.pop());
        }
    }
}
