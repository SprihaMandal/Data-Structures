// import java.util.Arrays;

public class Starter {
    public static void main(String[] args) {
        // BinarySearch bs = new BinarySearch();
        // int[] arr = {2,6,8,10,17,32,54};
        // int target = 54;
        // int pos = bs.binarySearch(arr, target);
        // System.out.println("binary search pos: "+pos);

        // TwoSum ts = new TwoSum();
        // int[] nums = { 2, 7, 11, 15, 8, 8 };
        // int target = 9;
        // int[] result = ts.twoSum(nums, target);
        // System.out.println(Arrays.toString(result));

        // LinkedList ll = new LinkedList();
        // ll.insertFirst(4);
        // ll.insertFirst(5);
        // ll.insertFirst(15);
        // ll.insertFirst(19);
        // ll.insertFirst(22);
        // ll.insertFirst(43);
        // // ll.displayLL();

        // // ll.insertEnd(10);
        // // ll.insertEnd(22);
        // ll.insertAtIndex(3, 99);
        // // ll.displayLL();

        // ll.insertAtIndex(0, 89);
        // // ll.displayLL();

        // ll.insertAtIndex(100, 78);
        // // ll.displayLL();
        // // ll.insertAtIndex(-1, 78);
        // ll.displayLL();

        // System.out.println(ll.deleteFirst());
        // ll.displayLL();

        // System.out.println(ll.deleteLast());
        // ll.displayLL();

        // System.out.println(ll.deleteAtIndex(4));
        // ll.displayLL();
        // System.out.println(ll.deleteAtIndex(1000));
        // ll.displayLL();

        // DoublyLinkedList dl = new DoublyLinkedList();
        // dl.insertFirst(20);
        // // dl.insertFirst(40);
        // // dl.insertLast(50);
        // // dl.insertLast(90);
        // // dl.insertLast(89);

        // // dl.insertAtIndex(2, 100);
        // dl.displayDLL();

        // System.out.println(dl.deleteAtIndex(-1));

        CircularLinkedList cl = new CircularLinkedList();
        cl.insert(78);
        cl.insert(60);
        cl.insert(49);

        cl.display();
        System.out.println(cl.deleteTail());
        cl.display();

    }

}
