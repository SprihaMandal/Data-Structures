public class LinkedList {
    Node head;
    Node tail;
    int size;

    LinkedList() {
        size = 0;
    }

    public void insertFirst(int num) {
        Node n = new Node(num);

        if (tail == null) {
            head = tail = n;
            size += 1;
            return;
        }
        n.next = head;
        head = n;
        size += 1;
    }

    public void insertEnd(int num) {
        Node n = new Node(num);
        if (head == null) {
            insertFirst(num);
            return;
        }

        tail.next = n;
        tail = n;
        size += 1;

    }

    public void displayLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.print("END\n");
    }

    public int getSize() {
        /*
         * while (temp != null) {
         * s++;
         * temp = temp.next;
         * }
         * return s;
         */
        return this.size;
    }

    public int deleteFirst() {
        Node temp = head;
        head = head.next;
        size--;
        return temp.val;
    }

    public int deleteLast() {
        // if tail not maintained
        Node ptr = head;
        while (ptr.next.next != null) {
            ptr = ptr.next;
        }
        Node temp = ptr.next;
        ptr.next = null;
        tail = ptr;
        size--;
        return temp.val;
    }

    public int deleteAtIndex(int index) {
        Node pointer = head;
        if (index < 0 || index > size - 1) {
            return -1;
        }
        if (index == 0) {
            deleteFirst();
        }
        if (index == size - 1) {
            deleteLast();
        }

        for (int i = 0; i < size; i++) {
            if (i == index - 1) {
                Node temp = pointer.next;
                pointer.next = pointer.next.next;
                size--;
                return temp.val;

            }
            pointer = pointer.next;
        }
        return -1; // not found

    }

    public void insertAtIndex(int index, int num) {
        Node node = new Node(num);
        Node pointer = head;
        if (index < 0) {
            System.out.println("index cannot be negative");
            return;
        }
        if (index == 0) {
            insertFirst(num);
            return;
        }
        if (index >= size - 1) {
            insertEnd(num);
            return;
        }

        for (int i = 0; i < size; i++) {
            if (i == index - 1) {
                node.next = pointer.next;
                pointer.next = node;
                size++;
                return;
            }
            pointer = pointer.next;
        }
    }

}
