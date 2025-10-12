public class Node {
    int val;
    Node next;

    Node(int value) {
        this.val = value;
    }

    Node(int value, Node nextValue) {
        this.val = value;
        this.next = nextValue;
    }
}
