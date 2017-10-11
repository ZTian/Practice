package practice;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class MyLinkedListTest {
  @Test
  public void testEmptyList() {
    MyLinkedList list = new MyLinkedList();
    assertTrue(list.isEmpty());
    assertTrue(list.size() == 0);
  }

  @Test
  public void testListAdd() {
    MyLinkedList list = new MyLinkedList();
    assertTrue(list.add(0));
    assertTrue(list.add(1));
    assertTrue(list.add(2));
    assertFalse(list.isEmpty());
    assertTrue(list.size() == 3);
  }

  @Test
  public void testListGet() {
    MyLinkedList list = new MyLinkedList();
    assertTrue(list.add(0));
    assertTrue(list.get(0).value == 0);
    assertTrue(list.get(1) == null);
  }

  @Test
  public void testListRemoveHead() {
    MyLinkedList list = new MyLinkedList();
    assertTrue(list.add(0));
    assertTrue(list.remove(0));
    assertTrue(list.isEmpty());
  }

  @Test
  public void testRemoveEmptyList() {
    MyLinkedList list = new MyLinkedList();
    assertFalse(list.remove(0));
    assertTrue(list.isEmpty());
  }

  @Test
  public void testListRemoveMiddle() {
    MyLinkedList list = new MyLinkedList();
    assertTrue(list.add(0));
    assertTrue(list.add(1));
    assertTrue(list.add(2));
    assertTrue(list.remove(1));
    System.out.println(list);
  }

  @Test
  public void testListRemoveEnd() {
    MyLinkedList list = new MyLinkedList();
    assertTrue(list.add(0));
    assertTrue(list.add(1));
    assertTrue(list.add(2));
    assertTrue(list.remove(2));
    System.out.println(list);
  }
}
