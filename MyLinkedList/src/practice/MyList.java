package practice;

public interface MyList {
  boolean isEmpty();
  int size();
  boolean add(int value);
  ListNode get(int index);
  boolean remove(int value);
}
