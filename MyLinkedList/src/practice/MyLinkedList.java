package practice;

public class MyLinkedList implements MyList {
  ListNode head;

  public MyLinkedList() {
    head = null;
  }

  @Override
  public ListNode get(int index) {
    return null;
  }

  @Override
  public ListNode add(int value) {
    return null;
  }

  @Override
  public int size() {
    ListNode node = head;
    int size = 0;
    while (node != null) {
      node = node.next;
      size++;
    }
    return size;
  }

  @Override
  public boolean isEmpty() {
    return head == null;
  }
}
