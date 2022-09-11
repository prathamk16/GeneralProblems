import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
public class LinkedListBasics {


    static ListNode push(ListNode head, int x){
        // Make a new Node and attach head to next of this node
        ListNode newHead = new ListNode(x,head);

        // Return newHead
        return newHead;
    }

    // Appending an element at the end of list
    static ListNode append(ListNode head, int x){
        // Make a new Node
        ListNode newLast = new ListNode(x,null);

        // If list is empty
        if(head==null){
            return newLast;
        }

        //Traverse to the end of the list and find last node
        ListNode temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        // Attach next of the last node to newLast
        temp.next = newLast;

        return head;
    }



    static void printList(ListNode node){
        while(node!=null){
            System.out.print(node.val+" ");
            node = node.next;
        }
        System.out.println("\n");
    }

    // 4 2 7 8
    static ListNode reverseList(ListNode head){
        ListNode prev = null, curr = head, nxt;

        while(curr!=null){
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }


    public static void main(String[] args) {

        LinkedListBasics obj = new LinkedListBasics();

        int n1,n2;
        Scanner in = new Scanner(System.in);
        n1 = in.nextInt();
        n2 = in.nextInt();

        ListNode list1 = null, list2 = null;

        // Input list1
        for(int i=0;i<n1;i++){
            int x = in.nextInt();
            list1 = append(list1,x);
        }
        printList(list1);


    }
}
