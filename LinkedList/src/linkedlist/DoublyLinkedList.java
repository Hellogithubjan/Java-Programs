//1. Creating head node of Doubly linked list
//2. Creating the nodes of Doubly linked list
//3. Inserting elements into Doubly linked list
//4. Deleting elements from Doubly Linked List
//5. Searching element from Doubly Linked List
package linkedlist;

import java.util.*;

public class DoublyLinkedList {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        DoublyLinkedList ob = new DoublyLinkedList();
        Dnode head = ob.CreateDLL();
        displayDLL(head);
        ob.Insert_into_DLL(head);
        ob.Delete_from_DLL(head);
        ob.SearchDLL(head);
    }

    public Dnode CreateDLL() {
        System.out.println("\nCreating head node of Doubly linked list ");
        Dnode head, n, tmp;
        int data;
        System.out.println("Enter the data for Head Node:");
        data = sc.nextInt();
        head = new Dnode(data);
        tmp = head;
        do {
            System.out.println("Enter data for other nodes(-1 to stop):");
            data = sc.nextInt();
            if (data == -1) {
                break;
            }
            n = new Dnode(data);
            tmp.next = n;
            n.prev = tmp;
            tmp = tmp.next;
        } while (data != -1);
        return head;
    }

    public static void displayDLL(Dnode head) {
        System.out.println("The Elements of Linked List:");
        Dnode tmp = head;
        while (tmp.next != null) {
            System.out.print(tmp.data + " -><- ");
            tmp = tmp.next;
        }
        System.out.println(tmp.data);
    }

    public void Insert_into_DLL(Dnode head) {
        System.out.println("\nOperation : Inserting elements into Doubly Linked List");
        System.out.println("\nChoices:\n1.Insert Beginning\n2.Insert Middle using Node Value\n3.Insert Middle using Position\n4.Insert at end\n5.Exit");
        int choice, data, node_val, pos;
        Dnode n, tmp;
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
                    n = new Dnode(data);
                    n.next = head;
                    head.prev = n;
                    head = n;
                    displayDLL(head);
                }
                case 2 -> {
                    System.out.println("Enter the data for the node:");
                    data = sc.nextInt();
                    n = new Dnode(data);
                    tmp = head;
                    System.out.println("Enter after which node to be inserted:");
                    node_val = sc.nextInt();
                    while (tmp.data != node_val) {
                        tmp = tmp.next;
                    }
                    if (tmp.next == null) {
                        tmp.next = n;
                        n.prev = tmp;
                    } else {
                        n.next = tmp.next;
                        tmp.next.prev = n;
                        tmp.next = n;
                        n.prev = tmp;
                    }
                    displayDLL(head);
                }
                case 3 -> {
                    System.out.println("Enter the data for the node:");
                    data = sc.nextInt();
                    n = new Dnode(data);
                    tmp = head;
                    System.out.println("Enter after which position node should be inserted:");
                    pos = sc.nextInt();
                    for (int i = 1; i < pos - 1; i++) {
                        tmp = tmp.next;
                    }
                    if (tmp.next == null) {
                        tmp.next = n;
                        n.prev = tmp;
                    } else {
                        n.next = tmp.next;
                        tmp.next.prev = n;
                        tmp.next = n;
                        n.prev = tmp;
                    }
                    displayDLL(head);
                }
                case 4 -> {
                    System.out.println("Enter the data for the node:");
                    data = sc.nextInt();
                    n = new Dnode(data);
                    tmp = head;
                    while (tmp.next != null) {
                        tmp = tmp.next;
                    }
                    tmp.next = n;
                    n.prev = tmp;
                    displayDLL(head);
                }
            }
        } while (choice != 5);
    }

    public void Delete_from_DLL(Dnode head) {
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
                    Dnode t = head.next;
                    t.prev = null;
                    head.next = null;
                    head = t;
                    System.out.println("Head Node deleted successfully");
                    displayDLL(head);
                }
                case 2 -> {
                    System.out.println("Enter the position of the node to be deleted:");
                    int pos = sc.nextInt();
                    Dnode tmp = head;
                    for (int i = 1; i < pos - 1; i++) {
                        tmp = tmp.next;
                    }
                    tmp.next = tmp.next.next;
                    tmp.next.next.prev = tmp;
                    System.out.println("Node deleted successfully");
                    displayDLL(head);
                }
                case 3 -> {
                    Dnode tmp = head;
                    while (tmp.next.next != null) {
                        tmp = tmp.next;
                    }
                    tmp.next = null;
                    System.out.println("Last node deleted Successfully");
                    displayDLL(head);
                }
            }

        } while (choice != 4);

    }

    public void SearchDLL(Dnode head) {
        System.out.println("\nOperation : Searching");
        System.out.println("\nEnter the element to be searched:");
        int Search_Element = sc.nextInt();
        int flag = 0;
        int pos = 0;
        int i = 1;
        Dnode tmp = head;
        while (tmp.next != null) {
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
