package implementsQueue2;

import org.w3c.dom.Node;

import java.util.Queue;

public class Solution {

    static class Node{
        private int data;
        private Node link;
    }
    static class Queue{
        private Node front;
        private Node rear;
    }
    public static void enQueue(Queue q, int value){
        Node temp = new Node();
        temp.data = value;
        if(q.front ==null){
            q.front = temp;
        }
        else
            q.rear.link = temp;

        q.rear = temp;
        q.rear.link =q.front;
    }
    static int deQueue(Queue q){
        if(q.front == null){
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        int value;
        if(q.front == q.rear){
            value = q.front.data;
            q.front = null;
            q.rear = null;
        }
        else{
            Node temp = q.front;
            value = temp.data;
            q.front =q.front.link;
            q.rear.link = q.front;
        }
        return value;
    }
    public static void displayQueue(Queue q){
        Node temp = q.front;
        while (temp.link != q.front){
            System.out.println(temp.data);
            temp =temp.link;
        }
        System.out.println(temp.data);
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.front = q.rear = null;

        enQueue(q,1);
        enQueue(q,3);
        enQueue(q,5);

//        displayQueue(q);

        System.out.println(deQueue(q));
        System.out.println(deQueue(q));
        System.out.println("-");
        displayQueue(q);
    }
}
