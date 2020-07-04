package algorithms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 反转链表
 * <p>
 * https://leetcode-cn.com/problems/reverse-linked-list/
 */
public class ReverseLinkedList {
    
    public ListNode reverseList(ListNode head) {
        /*ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;*/
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
    
    public static void main(String[] args) {
        ReverseLinkedList sol = new ReverseLinkedList();
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(3);
        list1.next.next.next = new ListNode(4);
        list1.next.next.next.next = new ListNode(5);
        System.out.println(sol.reverseList(list1));
    }
}
