/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode pre = head;
        int carry = 0;
        // while loop through the three case to cauculate the sum, carry and val
        while (l1 != null || l2 != null || carry != 0 ) {
            int sum = ((l1 == null) ? 0 : l1.val) + ((l2 == null) ? 0 : l2.val) + carry;
            carry = sum / 10;
            int val = sum % 10;
            ListNode now = new ListNode(val);
            pre.next = now; 
            pre = now;

            //loop to the next
            l1 = (l1 == null) ? l1 : l1.next; 
            l2 = (l2 == null) ? l2 : l2.next;
    }
    return head.next;
}}
