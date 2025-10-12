public class CircularLinkedList {
    Node head;
    Node tail;

    CircularLinkedList() {
        head = null;
        tail = null;
    }

    void insert(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = tail = node;
            node.next = head;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    void display() {
        Node pointer = head;
        do {
            System.out.print(pointer.val + "->");
            pointer = pointer.next;
        } while (pointer != head);
        System.out.println("head");

    }

    int deleteHead() {
        if (head == null)
            return -1;
        int val = head.val;

        if (head == tail) {
            head = tail = null;
        } else {
            tail.next = head.next;
            head = head.next;
        }
        return val;
    }

    int deleteTail() {
        if (head == tail) {
            int temp = head.val;
            head = tail = null;
            return temp;
        }
        // if (head.next == tail) {
        // int temp = tail.val;
        // head = tail.next;
        // return temp;
        // }

        Node ptr = head;
        int temp = tail.val;
        do {
            ptr = ptr.next;
        } while (ptr.next.next != head);
        ptr.next = head;
        tail = ptr;
        return temp;

    }

}