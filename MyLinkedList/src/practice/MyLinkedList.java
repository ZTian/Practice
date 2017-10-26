package practice;

public class MyLinkedList implements MyList {
  private ListNode head;
  private ListNode tail;
  private int size;

  public MyLinkedList() {
    head = null;
    tail = null;
    size = 0;
  }

  @Override
  public boolean remove(int index) {
    if (index >= size) {
      return false;
    }
    if (index == 0) {
      head = head.next;
      size--;
      if (size == 0) {
        tail = null;
      }
      return true;
    }
    ListNode prev = head;
    index--;
    while (index > 0) {
      prev = prev.next;
      index--;
    }
    if (prev.next == tail) {
      tail = prev;
    }
    prev.next = prev.next.next;
    size--;
    return true;
  }

  @Override
  public Integer get(int index) {
    ListNode curr = head;
    while (index > 0 && curr.next != null) {
      curr = curr.next;
      index--;
    }
    return index == 0 ? curr.value : null;
  }

  @Override
  public boolean add(int value) {
    linkLast(value);
    return true;
  }

  private void linkLast(int value) {
    ListNode node = new ListNode(value);
    if (head == null) {
      head = node;
      tail = node;
      size++;
      return;
    }
    tail.next = node;
    tail = tail.next;
    size++;
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
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
