package two_pointers.fast_slow_pointers;


public class LinkedListCycle {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        System.out.println("The linked list till 6 has cycle or no cycle: "+hasCycle(head));
        head.next.next.next.next.next.next = head.next.next;
        System.out.println("The linked list till 7 has cycle or no cycle: "+hasCycle(head));
        head.next.next.next.next.next.next.next = head.next.next.next;
        System.out.println("The linked list till 8 has cycle or no cycle: "+hasCycle(head));
    }

    public static boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast) {
                return true;
            }
        }

        return false;
    }
}
