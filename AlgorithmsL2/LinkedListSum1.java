// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class LinkedListSum1 {
    public static void main(String[] args) {
        // Example 1: (2 -> 4 -> 3) + (5 -> 6 -> 4)
        // Represents 342 + 465 = 807
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode result = addTwoNumbers(l1, l2);
        printList(result); // Expected output: 7 -> 0 -> 8

        // Example 2: (0) + (0)
        ListNode l3 = new ListNode(0);
        ListNode l4 = new ListNode(0);
        result = addTwoNumbers(l3, l4);
        printList(result); // Expected output: 0

        // Example 3: (9 -> 9 -> 9 -> 9 -> 9 -> 9 -> 9) + (9 -> 9 -> 9 -> 9)
        // Represents 9999999 + 9999 = 10009998
        ListNode l5 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode l6 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        result = addTwoNumbers(l5, l6);
        printList(result); // Expected output: 8 -> 9 -> 9 -> 9 -> 0 -> 0 -> 0 -> 1
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode current = head;
        int carry = 0;
        while(l1 != null || l2 !=null || carry != 0) {
            int x = l1 != null ? l1.val : 0;
            int y = l2 != null ? l2.val : 0;

            int sum = x + y + carry;
            carry = sum/10;

            current.next = new ListNode(sum % 10);
            current = current.next;

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        return head.next;
    }

    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null) {
                System.out.print(" -> ");
            }
            node = node.next;
        }
        System.out.println();
    }
}
