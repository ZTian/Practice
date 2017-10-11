package practice;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MyLinkedListTest {
  @Test
  public void testEmptyList() {
    MyLinkedList list = new MyLinkedList();
    assertTrue(list.isEmpty());
    assertTrue(list.size() == 0);
  }
}
