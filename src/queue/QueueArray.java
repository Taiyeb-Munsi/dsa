package queue;

import java.util.Queue;
import java.util.Scanner;

public class QueueArray {
    private int[] mainArr;
    private int front, rear, size;

    public static void main(String[] args) {
        QueueArray queue = new QueueArray(5);
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while(running) {
            System.out.print("Enter your choice :\n 1. Enqueue\n 2. Dequeue\n 3. Peek\n 4. Show all\n 5. Exit\nEnter your choice : ");
            int ch =  sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter the element to insert : ");
                    int temp = sc.nextInt();
                    queue.enqueue(temp);
                    break;

                case 2:
                    int popped = queue.dequeue();
                    if (popped != -1) {System.out.println("The popped element is : " + popped);}
                    break;

                case 3:
                    int peeked = queue.peek();
                    if (peeked != -1) {System.out.println("The element at top : " + peeked);}
                    break;

                case 4:
                    System.out.println("The elements in the queue are : ");
                    queue.showAll();
                    break;

                case 5:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }

    public QueueArray(int n) {
        mainArr = new int[n];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int element) {
        if(size == mainArr.length) {
            System.out.println("Queue overflow");
            return;
        }

        ++rear;
        mainArr[rear] = element;
        ++size;
    }

    public int dequeue() {
        if(size == 0) {
            System.out.println("Queue underflow");
            return -1;
        }

        int value =  mainArr[front];
        ++front;
        --size;

        if(size == 0) {
            front = 0;
            rear = -1;
        }

        return value;
    }

    public int peek() {
        if(size == 0) {
            System.out.println("No elements to peek");
            return -1;
        }
        return mainArr[front];
    }

    public void showAll() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;    
        }

        for(int i=front;i<=rear;++i) {
            System.out.print(mainArr[i] + " ");
        }
        System.out.println();
    }
}
