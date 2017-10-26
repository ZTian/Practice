package practice;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class MyLinkedListTest {
  @Test
  public void testEmptyList() {
    MyList list = new MyLinkedList();
    assertTrue(list.isEmpty());
    assertTrue(list.size() == 0);
  }

  @Test
  public void testListAdd() {
    MyList list = new MyLinkedList();
    assertTrue(list.add(0));
    assertTrue(list.add(1));
    assertTrue(list.add(2));
    assertFalse(list.isEmpty());
    assertTrue(list.size() == 3);
    System.out.println(list);
  }

  @Test
  public void testListGet() {
    MyList list = new MyLinkedList();
    assertTrue(list.add(0));
    assertTrue(list.get(0) == 0);
    assertTrue(list.get(1) == null);
  }

  @Test
  public void testListRemoveHead() {
    MyList list = new MyLinkedList();
    assertTrue(list.add(0));
    assertTrue(list.remove(0));
    assertTrue(list.isEmpty());
  }

  @Test
  public void testRemoveEmptyList() {
    MyList list = new MyLinkedList();
    assertFalse(list.remove(0));
    assertTrue(list.isEmpty());
  }

  @Test
  public void testListRemoveMiddle() {
    MyList list = new MyLinkedList();
    assertTrue(list.add(0));
    assertTrue(list.add(1));
    assertTrue(list.add(2));
    assertTrue(list.remove(1));
    System.out.println(list);
  }

  @Test
  public void testListRemoveEnd() {
    MyList list = new MyLinkedList();
    assertTrue(list.add(0));
    assertTrue(list.add(1));
    assertTrue(list.add(2));
    assertTrue(list.remove(2));
    System.out.println(list);
  }
}
