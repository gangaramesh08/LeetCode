package programs.addtwonumbers;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode curr = null;
        ListNode start = null;
        while(l1!=null && l2!=null ){
            int sum = l1.val + l2.val + carry;
            if(sum>9){
                carry = sum/10;
                sum = sum%10;
            } else{
                carry = 0;
            }
            if(start!=null){
                ListNode nextNode = new ListNode(sum);
                curr.next = nextNode;
                curr = nextNode;
            } else{
                start = new ListNode(sum);
                curr = start;
            }
            l1=l1.next;
            l2=l2.next;

        }

        //Remaining elements of l1
        while(l1!=null){
            int sum = l1.val + carry;
            if(sum>9){
                carry = sum/10;
                sum = sum%10;
            } else{
                carry = 0;
            }
            ListNode nextNode = new ListNode(sum);
            curr.next = nextNode;
            curr = nextNode;
            l1 = l1.next;
        }

        //Remaining elements of l2
        while(l2!=null){
            int sum = l2.val + carry;
            if(sum>9){
                carry = sum/10;
                sum = sum%10;
            } else{
                carry = 0;
            }
            ListNode nextNode = new ListNode(sum);
            curr.next = nextNode;
            curr = nextNode;
            l2 = l2.next;
        }
        if(carry!=0){
            ListNode nextNode = new ListNode(carry);
            curr.next = nextNode;
        }
        return start;
    }
}
