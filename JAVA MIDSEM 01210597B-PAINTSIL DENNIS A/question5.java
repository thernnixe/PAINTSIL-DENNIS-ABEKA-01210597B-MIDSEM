//. Design a Java interface for ADT Stack. Implement this interface using array. Provide necessary exception handling in both the implementations. 


// Interface for ADT Stack
interface StackADT<T> {
 void push(T element) throws StackOverflowException; 
 T pop() throws StackUnderflowException; 
 T peek() throws StackUnderflowException; 
 boolean isEmpty(); 
 boolean isFull(); 
}

// Custom Exception for Stack Overflow
class StackOverflowException extends Exception {
 public StackOverflowException(String message) {
     super(message);
 }
}

// Custom Exception for Stack Underflow
class StackUnderflowException extends Exception {
 public StackUnderflowException(String message) {
     super(message);
 }
}

// Implementation of StackADT using Array
class ArrayStack<T> implements StackADT<T> {
 private T[] stack;
 private int top;
 private int capacity;

 // Constructor to initialize the stack with a given capacity
 @SuppressWarnings("unchecked")
 public ArrayStack(int capacity) {
     this.capacity = capacity;
     stack = (T[]) new Object[capacity];
     top = -1; // Stack is initially empty
 }

 // Push method to add an element to the stack
 @Override
 public void push(T element) throws StackOverflowException {
     if (isFull()) {
         throw new StackOverflowException("Stack Overflow: Cannot push " + element + ", the stack is full.");
     }
     stack[++top] = element;
 }

 // Pop method to remove and return the top element
 @Override
 public T pop() throws StackUnderflowException {
     if (isEmpty()) {
         throw new StackUnderflowException("Stack Underflow: Cannot pop, the stack is empty.");
     }
     return stack[top--];
 }

 // Peek method to return the top element without removing it
 @Override
 public T peek() throws StackUnderflowException {
     if (isEmpty()) {
         throw new StackUnderflowException("Stack Underflow: Cannot peek, the stack is empty.");
     }
     return stack[top];
 }

 // Check if the stack is empty
 @Override
 public boolean isEmpty() {
     return top == -1;
 }

 // Check if the stack is full
 @Override
 public boolean isFull() {
     return top == capacity - 1;
 }
}

// Main class to test the ArrayStack implementation
public class question5 {
 public static void main(String[] args) {
     try {
         StackADT<Integer> stack = new ArrayStack<>(5); // Stack with capacity 5

         // Push elements into the stack
         stack.push(10);
         stack.push(20);
         stack.push(30);

         System.out.println("Top element (peek): " + stack.peek()); // Should print 30

         // Pop elements from the stack
         System.out.println("Popped element: " + stack.pop()); // Should print 30
         System.out.println("Popped element: " + stack.pop()); // Should print 20

         // Check if the stack is empty
         System.out.println("Is stack empty? " + stack.isEmpty()); 

         // Push more elements
         stack.push(40);
         stack.push(50);
         stack.push(60);
         stack.push(70);

         // Attempt to push into a full stack
         stack.push(80); 

     } catch (StackOverflowException | StackUnderflowException e) {
         System.err.println(e.getMessage());
     }
 }
}



