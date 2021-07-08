public class ProblemZR{
    public static void main(String[] args) {

        System.out.println("This is leetcode Problem");
        
    }
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode  current = head;
        while ( current!= null && current.next != null ){
            if (current.val == current.next.val){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        
        }
        return head;
        
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}