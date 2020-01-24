
import java.util.Scanner;
public class LinkedList1 {
  
    static private Node head;
    class Node
    {
        private int value;
        private Node next;
    }
    public LinkedList1()
    {
//        head = new Node();
//        head.next = null;
    }
    public boolean insertBeg(int item)
    {
        Node n1 = new Node();
        n1.value = item;
        n1.next= head;
        head = n1;
        return true;
    }
    void display()
    {
        Node z = head;
        while(z!=null)
        {
            System.out.println(z.value);
            z=z.next;
        }
    }
    void reverse(Node z5)
    {
        if(z5!=null)
        {
            reverse(z5.next);
            System.out.println(z5.value);
        }
    }
    public static void main(String[] args) throws InstantiationException,IllegalAccessException {
          LinkedList1 obj1 = LinkedList1.class.newInstance();
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the number of elements you want to insert in linked list:");
            int size = input.nextInt();
           System.out.println("Enter the elements you want to insert in linked list:");
            for(int i=0;i<size;i++){
                int num = input.nextInt();
                obj1.insertBeg(num);      
    }
            System.out.println("Elements are:");
            obj1.display();
         System.out.println("Reverse:");
        obj1.reverse(head);
    }
}
