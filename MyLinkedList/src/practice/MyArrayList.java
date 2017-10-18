package practice;

/**
 * Using array to implement list
 */
public class MyArrayList implements MyList {
  int[] elements;
  int capacity;
  int size;

  public MyArrayList() {
    capacity = 4;
    size = 0;
    elements = new int[capacity];
  }

  @Override
  public boolean add(int value) {
    if (size == capacity) {
      return false;
    }
    elements[size++] = value;
    return true;
  }

  @Override
  public boolean remove(int index) {
    if (index >= size) {
      return false;
    }
    size--;
    for (int i = index; i < size; ++i) {
      elements[i] = elements[i + 1];
    }
    return true;
  }

  @Override
  public Integer get(int index) {
    if (index >= size) {
      return null;
    }
    return elements[index];
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < size; ++i) {
      builder.append(elements[i]);
      builder.append(' ');
    }
    return builder.toString();
  }
}
