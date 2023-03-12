//1. Creating head node of Circular Singly linked list
//2. Creating the nodes of Circular Singly linked list
//3. Inserting elements into Circular Singly linked list
//4. Deleting elements from Circular Singly Linked List
//5. Searching element from Circular Singly Linked List

package linkedlist;

import java.util.*;

public class CircularSinglyLinkedList {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        CircularSinglyLinkedList ob = new CircularSinglyLinkedList();
        Node head = ob.CreateCLL();
        displayCLL(head);
        ob.Insert_into_CLL(head);
        ob.Delete_from_CLL(head);
        ob.SearchCLL(head);
    }

    public Node CreateCLL() {
        System.out.println("\nCreating head node of Circular Singly linked list ");
        Node head, n, tmp, t;
        int data;
        System.out.println("Enter the data for Head Node:");
        data = sc.nextInt();
        head = new Node(data);
        tmp = head;
        do {
            System.out.println("Enter data for other nodes(-1 to stop):");
            data = sc.nextInt();
            if (data == -1) {
                break;
            }
            n = new Node(data);
            tmp.next = n;
            tmp = tmp.next;
            n.next = head;
        } while (data != -1);
        return head;
    }

    public static void displayCLL(Node head) {
        System.out.println("The Elements of Linked List:");
        Node tmp = head;
        while (tmp.next != head) {
            System.out.print(tmp.data + " -> ");
            tmp = tmp.next;
        }
        System.out.println(tmp.data);
    }

    public void Insert_into_CLL(Node head) {
        System.out.println("\nOperation : Inserting elements into Circular Singly Linked List");
        System.out.println("\nChoices:\n1.Insert Beginning\n2.Insert Middle using Node Value\n3.Insert Middle using Position\n4.Insert at end\n5.Exit");
        int choice, data, node_val, pos;
        Node n, tmp;
        do {
            System.out.println("\nEnter your choice");
            choice = sc.nextInt();
            if (choice == 5) {
                break;
            }
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter the data for the node:");
                    data = sc.nextInt();
                    n = new Node(data);
                    tmp = head;
                    while (tmp.next != head) {
                        tmp = tmp.next;
                    }
                    tmp.next = n;
                    n.next = head;
                    head = n;
                    displayCLL(head);
                }
                case 2 -> {
                    System.out.println("Enter the data for the node:");
                    data = sc.nextInt();
                    n = new Node(data);
                    tmp = head;
                    System.out.println("Enter after which node to be inserted:");
                    node_val = sc.nextInt();
                    while (tmp.data != node_val) {
                        tmp = tmp.next;
                    }
                    if (tmp.next == head) {
                        n.next = head;
                        tmp.next = n;
                    } else {
                        n.next = tmp.next;
                        tmp.next = n;
                    }
                    displayCLL(head);
                }
                case 3 -> {
                    System.out.println("Enter the data for the node:");
                    data = sc.nextInt();
                    n = new Node(data);
                    tmp = head;
                    System.out.println("Enter after which position node should be inserted:");
                    pos = sc.nextInt();
                    for (int i = 1; i < pos; i++) {
                        tmp = tmp.next;
                    }
                    if (tmp.next == head) {
                        n.next = head;
                        tmp.next = n;
                    } else {
                        n.next = tmp.next;
                        tmp.next = n;
                    }
                    displayCLL(head);
                }
                case 4 -> {
                    System.out.println("Enter the data for the node:");
                    data = sc.nextInt();
                    n = new Node(data);
                    tmp = head;
                    while (tmp.next != head) {
                        tmp = tmp.next;
                    }
                    n.next = head;
                    tmp.next = n;
                    displayCLL(head);
                }
            }
        } while (choice != 5);
    }

    public void Delete_from_CLL(Node head) {
        System.out.println("\nOperation : Deleting Node from Circular Linked List");
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
                    Node t = head.next;
                    Node tmp = head;
                    while (tmp.next != head) {
                        tmp = tmp.next;
                    }
                    tmp.next = t;
                    head = t;
                    System.out.println("Head Node deleted successfully");
                    displayCLL(head);
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
                    displayCLL(head);
                }
                case 3 -> {
                    Node tmp = head;
                    while (tmp.next.next != head) {
                        tmp = tmp.next;
                    }
                    tmp.next = head;
                    System.out.println("Last node deleted Successfully");
                    displayCLL(head);
                }
            }

        } while (choice != 4);

    }

    public void SearchCLL(Node head) {
        System.out.println("\nOperation : Searching");
        System.out.println("\nEnter the element to be searched:");
        int Search_Element = sc.nextInt();
        int flag = 0;
        int pos = 0;
        int i = 1;
        Node tmp = head;
        while (tmp.next != head) {
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
}
