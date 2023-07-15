 class Node{
    public Object item;
    public Node next;
}
public class StackImpUsingLinkedList  {
    private int size;
    private Node head;
    private int top = -1;
    public StackImpUsingLinkedList(int size) {
        this.head = null;
        this.size = size;
    }
    public void push(int i) {
        if(top == size - 1) {
            System.out.println("Stack is full");
        }else{
            top++;
            Node n = new Node();
            n.item = i;
            n.next = this.head;
            this.head = n;
        }
    }
    public void pop() {
        if(top == -1) {
            System.out.println("Stack is empty");
        }else{
            top--;
            System.out.println("The element popped is " + this.head.item);
            this.head = this.head.next;
        }
    }
    public void display() {
        if(top == -1) {
            System.out.println("Stack is empty");
        }else{
            Node current = this.head;
            System.out.print("The elemets of the stack are : ");
            for(int i = 0;i <= top; i++) {
                System.out.print(current.item + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        StackImpUsingLinkedList l1 = new StackImpUsingLinkedList(5);
        l1.push(2);
        l1.push(4);
        l1.push(6);
        l1.push(8);
        l1.push(10);   
        l1.display();
        l1.pop();
        l1.display();
     }
}