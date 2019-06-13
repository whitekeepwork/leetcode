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
    def addTwoNumbers(self, l1: ListNode, l2: ListNode, carry = 0) -> ListNode:
        sum = l1.val + l2.val+ carry
        carry = sum // 10
        dit = ListNode(sum % 10)

        if (l1.next != None or l2.next != None or carry != 0):
            if l1.next == None:
                l1.next = ListNode(0)
            if l2.next == None:
                l2.next = ListNode(0)
            dit.next = self.addTwoNumbers(l1.next,l2.next,carry)        
        #base case is l1l2.next - none and carry = 0
        return dit
        
        
    



