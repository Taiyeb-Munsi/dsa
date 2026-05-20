package stack;

import java.util.Scanner;

public class StackArray {
    private int[] mainArr;
    private int top;

    public StackArray(int n) {
        mainArr = new int[n];
        top = -1;
    }

    public void push(int element) {
        if(top < mainArr.length - 1) {
            mainArr[++top] = element;
        } else {
            System.out.println("Stack overflow");
        }
    }

    public int pop() {
        if(top > -1) {
            return mainArr[top--];
        } else {
            System.out.println("Stack underflow");
            return -1;
        }
    }

    public int peek() {
        if(top != -1) {
            return mainArr[top];
        } else {
            System.out.println("No elements to peek");
            return -1;
        }
    }

    public void showAll() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;    
        }

        for(int i=0;i<=top;++i) {
            System.out.print(mainArr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackArray stack = new StackArray(5);
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while(running) {
            System.out.print("Enter your choice :\n 1. Push\n 2. Pop\n 3. Peek\n 4. Show all\n 5. Exit\nEnter your choice : ");
            int ch =  sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter the element to insert : ");
                    int temp = sc.nextInt();
                    stack.push(temp);
                    break;

                case 2:
                    int popped = stack.pop();
                    if (popped != -1) {System.out.println("The popped element is : " + popped);}
                    break;

                case 3:
                    int peeked = stack.peek();
                    if (peeked != -1) {System.out.println("The element at top : " + peeked);}
                    break;

                case 4:
                    System.out.println("The elements in the stack are : ");
                    stack.showAll();
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
}
