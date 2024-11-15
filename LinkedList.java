import java.util.Scanner;

public class LinkedList {
    Node head;

    class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    public void append(int data) {
        if (head == null) head = new Node(data);
        else {
            Node temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = new Node(data);
        }
    }

    public void printList() {
        for (Node temp = head; temp != null; temp = temp.next)
            System.out.print(temp.data + " ");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) list.append(scanner.nextInt());
        System.out.println("Linked List:");
        list.printList();
        scanner.close();
    }
}
