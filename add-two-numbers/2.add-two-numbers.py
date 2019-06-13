#
# @lc app=leetcode id=2 lang=python3
#
# [2] Add Two Numbers with nomral recursive
#
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode carry = 9) -> ListNode:
        sum = l1.val + l2.val+ carry
        carry = sum // 10
        dit = listNode(sum % 10)

        if (l1.next != None or l2.next != None or c != 0):
            if l1.next != None:
                l1 = l1.next
            if l2.next != None:
                l2 = l2.next
        dit.next = self.addTwoNumbers(l1,l2,carry)        
        
        #end case
        return dit
        
        
    



