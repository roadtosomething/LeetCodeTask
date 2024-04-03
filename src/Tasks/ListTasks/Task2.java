package Tasks.ListTasks;
import Tasks.classes.*;
import Tasks.Task;
import Tasks.classes.ListNode;

import java.util.List;


public class Task2 implements Task {

    private ListNode l1 =
                new ListNode (2,
                        new ListNode( 4,
                                new ListNode(9)));
    private ListNode l2= new ListNode(5,
            new ListNode(6,
                    new ListNode(4,
                            new ListNode(9))));

    public Task2(ListNode l1, ListNode l2){
        this.l1 = l1;
        this.l2 = l2;
    }

    @Override
    public void run() {
        System.out.println(showListNode(l1));
        System.out.println(showListNode(l2));
        System.out.println(
                showListNode(
                        addTwoNumbers(l1,l2)
                ));
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode current = new ListNode(0);
        ListNode result = null;
        while (current!=null){
            int sum = current.val + l1.val+ l2.val;
            current.val = sum%10;
            if (sum >9 | l1.next != null | l2.next != null)
            {
                current.next = new ListNode(Integer.valueOf(sum/10));
            }
            if (result == null) result = current;
            current = current.next;
            if (!(l1.next instanceof ListNode)) {
                l1.next = new ListNode(0);
            }
            if (!(l2.next instanceof ListNode)) {
                l2.next = new ListNode(0);
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        return result;
    }

    private String showListNode (ListNode listNode){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(listNode.val);
        while (listNode.next != null){
            listNode=listNode.next;
            stringBuilder.append("->" +listNode.val);
        }
        return stringBuilder.toString();
    }
}
