package practice;

public interface MyList {
  /**
   * Check if the list is empty
   * @return true if empty
   */
  boolean isEmpty();

  /**
   * Get the size of the list
   * @return the size of the list
   */
  int size();

  /**
   * Append value to the end of the list
   * @param value to append
   * @return true if successfully added
   */
  boolean add(int value);

  /**
   * Get the element at target position
   * @param index of the target element
   * @return null if target element does not exist, otherwise return the actual element
   */
  Integer get(int index);

  /**
   * Remove the element at target position
   * @param index of the target element
   * @return true if successfully remove the element, otherwise false
   */
  boolean remove(int index);
}
