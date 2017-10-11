package practice;

public class MyLinkedList implements MyList {
  ListNode head;

  public MyLinkedList() {
    head = null;
  }

  @Override
  public boolean remove(int value) {
    if (head == null) {
      return false;
    } else if (head.value == value) {
      head = head.next;
      return true;
    }
    ListNode curr = head;
    while (curr.next != null && curr.next.value != value) {
      curr = curr.next;
    }
    if (curr.next == null) {
      return false;
    }
    curr.next = curr.next.next;
    return true;
  }

  @Override
  public ListNode get(int index) {
    ListNode curr = head;
    while (index > 0 && curr.next != null) {
      curr = curr.next;
      index--;
    }
    return index == 0 ? curr : null;
  }

  @Override
  public boolean add(int value) {
    ListNode node = new ListNode(value);
    if (head == null) {
      head = node;
      return true;
    }
    ListNode curr = head;
    while (curr.next != null) {
      curr = curr.next;
    }
    curr.next = node;
    return true;
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

  @Override
  public String toString() {
    ListNode curr = head;
    StringBuilder builder = new StringBuilder();
    while (curr != null) {
      builder.append(curr.value);
      builder.append(' ');
      curr = curr.next;
    }
    return builder.toString();
  }
}
