package PhenomPeople;

class Node {
    Node next;
    int data;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListDemo {
    static Node head;

    public static void main(String[] args) {

        insertNode(10);
        insertNode(20);
        insertNode(30);
        insertNode(40);
        insertNode(50);
        insertNode(60);
        insertNode(70);
        insertNode(80);

        Node temp = head;

        while (temp.next != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }


    private static void insertNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            temp.next = newNode;
        }
    }
}
