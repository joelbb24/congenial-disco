package two_pointers.fast_slow_pointers;



public class MiddleOfLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        System.out.println("Middle node: "+ MiddleOfLinkedList.findMiddle(head).val);
        head.next.next.next.next.next = new ListNode(6);
        System.out.println("Middle node: "+ MiddleOfLinkedList.findMiddle(head).val);
        head.next.next.next.next.next.next = new ListNode(7);
        System.out.println("Middle node: "+ MiddleOfLinkedList.findMiddle(head).val);
    }

    private static ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }


        return slow;
    }
}
