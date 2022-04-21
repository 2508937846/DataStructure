package 链表;

/**
 * @author wtx
 * @date 2022/2/1
 */
public class _237_删除链表中的节点 {


    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

}
