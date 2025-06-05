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

        System.out.println("enter the k value:");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        head = group(head, k);
        printList(head);
    }

    public static Node group(Node head , int k){
        int cnt=0;
        Node cur=head;

        while(cnt<k && cur!=null){
            cur=cur.next;
            cnt++;
        }

        if(cnt<k){
            return head;
        }

        cnt=0;
        cur=head;
        Node prev=null , next=null;

        while(cnt < k && cur!=null){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
            cnt++;
        }
        if(next!=null){
            head.next=group(next,k);
        }

        return prev;
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data +"->");
            head = head.next;
        }
        System.out.print("NULL");
    }
}
