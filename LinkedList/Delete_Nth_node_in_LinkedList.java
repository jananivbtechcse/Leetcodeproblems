import java.util.*;
class Node {
    int data; 
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node temp = head;
        System.out.print("Original List: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        deletenode(head);
        temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.print("Reversed List: ");
}
    public static Node deletenode(Node head){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Node temp=head;
        for(int i=0;i<k-2;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
  
}
