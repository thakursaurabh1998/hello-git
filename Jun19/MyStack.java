class Stack {
    private int length = 0;
    private int stackL = 0;
    private int stack[];

    Stack() {
        this.stackL = 6;
        this.stack = new int[this.stackL];
    }

    // Returns the 1-based position where an object is on this stack.
    // If the object o occurs as an item in this stack, this method returns
    // the distance from the top of the stack of the occurrence nearest the top of
    // the stack;
    // the topmost item on the stack is considered to be at distance 1.
    int search(int x) {
        int count = 1;
        for (int i = this.length - 1; i >= 0; i--) {
            if (x == this.stack[i])
                return count;
            count++;
        }
        return -1;
    }

    // Pushes an item onto the top of this stack.
    int push(int obj) {
        if (this.length >= this.stackL)
            this.increaseLength();
        this.stack[this.length] = obj;
        this.length++;
        return obj;
    }

    // Looks at the object at the top of this stack without removing it from the
    // stack.
    int peek() {
        return this.stack[this.length - 1];
    }

    // Removes the object at the top of this stack and returns that object as the
    // value of this function.
    int pop() {
        try {
            int obj = this.stack[this.length - 1];
            this.length--;
            this.decreaseLength();
            return obj;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The stack is empty, can't be popped");
            return -1;
        }
    }

    // Tests if this stack is empty.
    boolean empty() {
        if (this.length == 0)
            return true;
        else
            return false;
    }

    private void increaseLength() {
        this.stackL = this.stackL * 3 / 2;
        int temp[] = new int[this.stackL];
        int p = 0;
        for (int i : this.stack) {
            temp[p++] = i;
        }
        this.stack = temp;
    }

    private void decreaseLength() {
        if (this.stackL <= 6 || (this.stackL - this.length) < 6)
            return;
        this.stackL -= 6;
        int temp[] = new int[this.stackL];
        for (int i = 0; i < this.length; i++) {
            temp[i] = this.stack[i];
        }
        this.stack = temp;
    }
}

public class MyStack {
    public static void main(String[] args) {
        Stack myStack = new Stack();
        System.out.println("Is array empty? " + myStack.empty()); // demo of empty function
        System.out.println("Pushing: " + myStack.push(1)); // pushing to the top of the stack
        System.out.println("Is array empty? " + myStack.empty()); // demo of empty function
        System.out.println("Pushing: " + myStack.push(2));
        System.out.println("Pushing: " + myStack.push(3));
        System.out.println("Pushing: " + myStack.push(4));
        System.out.println("Pushing: " + myStack.push(5));
        System.out.println("Pushing: " + myStack.push(6));
        System.out.println("Pushing: " + myStack.push(7)); // going out of the given size of the stack demonstrating dynamic nature, demo of overflow handling
        System.out.println("Searching the stack (object not found): " + myStack.search(9)); //returns -1 if object is not in stack
        System.out.println("Searching the stack (object found): " + myStack.search(3)); //returns distance if object is in stack
        System.out.println("Peeking: "+ myStack.peek()); // returns top object in the stack without removing it
        System.out.println("Popping: " + myStack.pop()); // removing top object of the stack
        System.out.println("Popping: " + myStack.pop());
        System.out.println("Popping: " + myStack.pop());
        System.out.println("Popping: " + myStack.pop());
        System.out.println("Popping: " + myStack.pop());
        System.out.println("Popping: " + myStack.pop());
        System.out.println("Popping: " + myStack.pop());
        myStack.pop(); // popping when array is empty, demo of underflow exception handling
    }
}