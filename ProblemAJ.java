// https://leetcode.com/problems/add-two-numbers/
public class ProblemAJ{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        

        int carry =0;
        
        ListNode dummy = new ListNode (0);
        ListNode temp = dummy;
        
        while (l1!= null || l2 != null ||carry ==1){
            int l1_value = (l1 != null)?l1.val:0;
            int l2_value = (l2 != null)?l2.val:0;
            int sum = l1_value+l2_value + carry;
            carry = sum/10;
            ListNode newNode = new ListNode (sum%10);
            temp.next = newNode;
            temp = temp.next;            
            if (l1 != null){l1 = l1.next;}
            if (l2 != null){l2 = l2.next;}
        }
        
        return dummy.next;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}