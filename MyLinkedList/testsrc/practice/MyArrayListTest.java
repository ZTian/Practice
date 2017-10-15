package practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MyArrayListTest {
  @Test
  public void testMyArrayListAdd() {
    MyList list = new MyArrayList();
    for (int i = 0; i < 4; ++i) {
      assertTrue(list.add(i));
    }
    System.out.println(list);
    assertFalse(list.add(5));
  }

  @Test
  public void testMyArrayListAddAndGet() {
    MyList list = new MyArrayList();
    for (int i = 0; i < 3; ++i) {
      assertTrue(list.add(i));
    }
    assertEquals(list.get(3), null);
    assertTrue(list.get(1) == 1);
  }

  @Test
  public void testMyArrayListSizeAndIsEmpty() {
    MyList list = new MyArrayList();
    assertEquals(list.size(), 0);
    assertTrue(list.isEmpty());
    for (int i = 0; i < 3; ++i) {
      assertTrue(list.add(i));
    }
    assertEquals(list.size(), 3);
    assertFalse(list.isEmpty());
  }

  @Test
  public void testMyArrayListRemove() {
    MyList list = new MyArrayList();
    for (int i = 0; i < 3; ++i) {
      assertTrue(list.add(i));
    }
    assertTrue(list.remove(1));
    System.out.println(list);
  }

  @Test
  public void testMyArrayListRemoveEmpty() {
    MyList list = new MyArrayList();
    assertFalse(list.remove(1));
  }

  @Test
  public void testMyArrayListRemoveOutOfBound() {
    MyList list = new MyArrayList();
    for (int i = 0; i < 3; ++i) {
      assertTrue(list.add(i));
    }
    assertFalse(list.remove(4));
  }
}
