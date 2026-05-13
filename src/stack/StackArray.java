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
            System.out.println(mainArr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackArray stack = new StackArray(5);
        
        stack.push(9);
        stack.push(11);
        stack.push(8);
        stack.push(4);

        stack.showAll();

        stack.pop();
        
        stack.showAll();

        System.out.println(stack.peek());
    }
}
