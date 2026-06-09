# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution(object):
    def mergeTwoLists(self, list1, list2):
        # Step 1: Create a dummy node to act as the starting anchor
        dummy = ListNode(0)
        # 'tail' will keep track of the last node in our new merged list
        tail = dummy
        
        # Step 2: Loop while BOTH lists still have nodes left to look at
        while list1 is not None and list2 is not None:
            if list1.val <= list2.val:
                tail.next = list1  # Connect the smaller node to our merged list
                list1 = list1.next # Move forward in list1
            else:
                tail.next = list2  # Connect the smaller node to our merged list
                list2 = list2.next # Move forward in list2
                
            tail = tail.next # Move our merged list pointer forward
            
        # Step 3: If one list runs out of nodes, simply attach the rest of the other list
        if list1 is not None:
            tail.next = list1
        else:
            tail.next = list2
            
        # Step 4: Return the head of the merged list (skipping the dummy node)
        return dummy.next