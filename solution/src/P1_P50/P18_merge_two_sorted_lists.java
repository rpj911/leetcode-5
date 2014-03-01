package P1_P50;

public class P18_merge_two_sorted_lists {

	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) {
	        val = x;
	        next = null;
	    }
	}
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null){
            return l2;
        }
        if (l2 == null){
            return l1;
        }
        ListNode head = null;
        ListNode temp = null;
        if(l1.val<l2.val){
            head = temp = l1;
            l1 = l1.next;
        }
        else {
            head = temp = l2;
            l2 = l2.next;
        }
        while (l1 != null&&l2 != null){
            if(l1.val<l2.val){
                temp.next = l1;
                l1 = l1.next;
            }
            else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        if (l1 != null){
            temp.next = l1;
        }
        if (l2 != null){
            temp.next = l2;
        }
        return head;
    }
}