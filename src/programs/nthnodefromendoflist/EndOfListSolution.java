package programs.nthnodefromendoflist;

class ListNode {
      int val;
      ListNode next;
      ListNode(int val) { this.val = val; }
  }
public class EndOfListSolution {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode temp = head;
        int counter = 2;
        while (counter!=6){
            temp.next=new ListNode(counter);
            temp = temp.next;
            counter++;
        }
        ListNode node = removeNthFromEnd(head,5);
        while (node!=null){
            System.out.println(node.val);
            node = node.next;
        }
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode head2 = head;
        int counter = 0;
        while(head!=null){
            counter++;
            head = head.next;
        }
        int node_pos = counter-n;
        if(node_pos==0){
            return head2.next;
        }
        counter = 1;
        ListNode prev = head2;
        head = head2;
        head2 = head2.next;
        while(head2!=null){
            if(node_pos==counter){
                prev.next= head2.next;
                break;
            }
            counter++;
            prev = head2;
            head2=head2.next;
        }
        return head;

    }
}
