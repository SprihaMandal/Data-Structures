public class DNode {
    int val;
    DNode next;
    DNode prev;

    DNode(int value) {
        this.val = value;
    }
    // ..

    DNode(int value, DNode nextValue, DNode prevValue) {
        this.val = value;
        this.next = nextValue;
        this.prev = prevValue;
    }
}
