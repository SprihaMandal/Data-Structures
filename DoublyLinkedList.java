public class DoublyLinkedList {
    DNode head;
    int size;

    DoublyLinkedList() {
        size = 0;
    }

    void insertFirst(int val) {
        DNode node = new DNode(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
        size++;
    }

    void displayDLL() {
        DNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + "--");
            temp = temp.next;
        }
        System.out.print("END\n");
    }

    DNode getTail() {
        if (head == null) {
            return null;
        }
        DNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        return temp;
    }

    void insertLast(int val) {
        DNode node = new DNode(val);
        if (head == null) {
            insertFirst(val);
            return;
        }
        DNode ptr = getTail();
        if (ptr != null) {
            ptr.next = node;
            node.prev = ptr;
            node.next = null;
            size++;
        }
    }

    public void insertAtIndex(int index, int num) {
        DNode node = new DNode(num);
        DNode pointer = head;
        if (index < 0) {
            System.out.println("index cannot be negative");
            return;
        }
        if (index == 0) {
            insertFirst(num);
            return;
        }
        if (index >= size - 1) {
            insertLast(num);
            return;
        }

        for (int i = 0; i < size; i++) {
            if (i == index - 1) {
                node.next = pointer.next;
                pointer.next = node;
                node.prev = pointer;
                node.next.prev = node;
                size++;
                return;
            }
            pointer = pointer.next;
        }
    }

    public int deleteFirst() {
        if (head == null) {
            return -1;
        }
        if (head.next == null) {
            DNode temp = head;
            head = null;
            size--;
            return temp.val;
        }
        if (head != null && head.next != null) {
            DNode temp = head;
            head = head.next;
            head.next.prev = null;
            size--;
            return temp.val;
        }
        return -1;
    }

    public int deleteLast() {
        if (head == null) {
            return -1;
        }
        if (head.next == null) {
            DNode temp = head;
            head = null;
            size--;
            return temp.val;
        }
        DNode tail = getTail();
        if (tail != null) {
            DNode temp = tail;
            tail.prev.next = null;
            tail = tail.prev;
            size--;
            return temp.val;

        }
        return -1;
    }

    int deleteAtIndex(int index) {

        if (head == null || index > size - 1 || index < 0) {
            return -1;
        }
        if (index == 0 || head.next == null) {
            int val = deleteFirst();
            return val;
        }
        if (index == size - 1) {
            int val = deleteLast();
            return val;
        }
        DNode ptr = head;
        for (int i = 0; i < index - 1; i++) {
            ptr = ptr.next;
        }
        DNode temDNode = ptr.next;
        ptr.next.next.prev = ptr;
        ptr.next = ptr.next.next;
        size--;
        return temDNode.val;
    }

}
