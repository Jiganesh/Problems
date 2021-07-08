# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def deleteDuplicates(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        self.current = head 
        while(self.current and self.current.next):
            if(self.current.val == self.current.next.val):
                self.current.next = self.current.next.next;
            else:
                self.current = self.current.next;
        return head