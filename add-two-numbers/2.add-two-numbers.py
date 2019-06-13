#
# @lc app=leetcode id=2 lang=python3
#
# [2] Add Two Numbers with nomral while loop
#
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        #initial the head
        head = ListNode(0)
        pre = head
        carry  = 0 
        while l1 != None or l2 != None or carry != 0:
            sum = 0
            if l1 != None:
                sum += l1.val
            if l2 != None:
                sum += l2.val
            sum += carry
            val = sum % 10
            carry = sum // 10
            pre.next = ListNode(val)
            pre = pre.next
            if l1 != None:
                l1 = l1.next
            if l2 != None:
                l2 = l2.next
  
        return head.next



