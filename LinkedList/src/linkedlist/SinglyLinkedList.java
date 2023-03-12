//1. Creating head node of Singly linked list
//2. Creating the nodes of Singly linked list
//3. Inserting elements into Singly linked list
//4. Deleting elements from Singly Linked List
//5. Searching element from Singly Linked List

package linkedlist;

import java.util.*;

public class SinglyLinkedList {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        SinglyLinkedList ob = new SinglyLinkedList();
        Node head = ob.createLL();
        displayLL(head);
        ob.Insert_Node_Beginning(head);
        ob.Insert_Node_Middle_using_value(head);
        ob.Insert_Node_Middle_using_Position(head);
        ob.Inser_Node_At_End(head);
        ob.Delete_Node(head);
        ob.SearchLL(head);
    }

    public void Insert_Node_Beginning(Node head) {
        System.out.println("\nOperation : Insertion of Node at Beginning ");
        System.out.println("Enter the data for the node:");
        int d;
        d = sc.nextInt();
        Node t = new Node(d);
        t.next = head;
        head = t;
        displayLL(head);
    }

    public void Insert_Node_Middle_using_value(Node head) {
        System.out.println("\nOperation : Insertion of Node at Middle using value: ");
        System.out.println("Enter the data for the node:");
        int d, x;
        d = sc.nextInt();
        Node n = new Node(d);
        System.out.println("Enter the value of the node after which new node has to be inserted : ");
        x = sc.nextInt();
        Node tmp = head;
        while (tmp.data != x) {
            tmp = tmp.next;
        }
        n.next = tmp.next;
        tmp.next = n;
        displayLL(head);
    }

    public void Insert_Node_Middle_using_Position(Node head) {
        System.out.println("\nOperation : Insertion of Node at Middle using Position: ");
        System.out.println("Enter the data for the node:");
        int d, pos;
        d = sc.nextInt();
        Node n = new Node(d);
        System.out.println("Enter the position of the node after which new node has to be inserted : ");
        pos = sc.nextInt();
        Node tmp = head;
        for (int i = 1; i < pos; i++) {
            tmp = tmp.next;
        }
        n.next = tmp.next;
        tmp.next = n;
        displayLL(head);
    }

    public void Inser_Node_At_End(Node head) {
        System.out.println("\nOperation : Insertion of Node at the end");
        System.out.println("Enter the data for the node:");
        int d;
        d = sc.nextInt();
        Node n = new Node(d);
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        n.next = null;
        tmp.next = n;
        displayLL(head);

    }

    public void Delete_Node(Node head) {
        System.out.println("\nOperation : Deleting Node from Linked List");
        System.out.println("\nChoices:\n1.Delete Beginning\n2.Delete Middle\n3.Delete End\n4.Exit");
        int choice;
        do {
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            if (choice == 4) {
                break;
            }
            switch (choice) {
                case 1 -> {
                    Node tmp = head.next;
                    head.next = null;
                    head = tmp;
                    System.out.println("Head Node deleted successfully");
                    displayLL(head);
                }
                case 2 -> {
                    System.out.println("Enter the position of the node to be deleted:");
                    int pos = sc.nextInt();
                    Node tmp = head;
                    for (int i = 1; i < pos - 1; i++) {
                        tmp = tmp.next;
                    }
                    tmp.next = tmp.next.next;
                    System.out.println("Node deleted successfully");
                    displayLL(head);
                }
                case 3 -> {
                    Node tmp = head;
                    while (tmp.next.next != null) {
                        tmp = tmp.next;
                    }
                    tmp.next = null;
                    System.out.println("Last node deleted Successfully");
                    displayLL(head);
                }
            }

        } while (choice != 4);

    }

    public void SearchLL(Node head) {
        System.out.println("\nOperation : Searching");
        System.out.println("\nEnter the element to be searched:");
        int Search_Element = sc.nextInt();
        int flag = 0;
        int pos = 0;
        int i = 1;
        Node tmp = head;
        while (tmp != null) {
            if (tmp.data == Search_Element) {
                flag = 1;
                pos = i;
                break;
            }
            tmp = tmp.next;
            i++;
        }
        if (flag == 1) {
            System.out.println("Element found at position " + pos);
        } else {
            System.out.println("Element Not Found");
        }
    }

    public Node createLL() {
        System.out.println("Operation : Creating a Singly Linked List ");
        Node head, tmp, t;
        int x;
        System.out.println("\nEnter the element for head Node:");
        x = sc.nextInt();
        head = new Node(x);
        t = head;
        do {
            System.out.println("Enter data for node (-1 to stop):");
            x = sc.nextInt();
            if (x == -1) {
                break;
            }
            tmp = new Node(x);
            t.next = tmp;
            tmp.next = null;
            t = t.next;
        } while (x != -1);
        return head;
    }

    public static void displayLL(Node head) {
        System.out.println("\nThe Elements of Linked List:");
        Node tmp = head;
        while (tmp.next != null) {
            System.out.print(tmp.data + " -> ");
            tmp = tmp.next;
        }
        System.out.println(tmp.data);
    }
}
