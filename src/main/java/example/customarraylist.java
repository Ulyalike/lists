/**
 * create realization of our customArrayList and add some elements "под капод"
 */
package example;
public class customarraylist<A> implements realise<A> {
  private Object[] array;
  private int size;
/**
 * dinamic data structure extension to not exceed the size
 */
  public customarraylist(int Capacity) {
    array = new Object[Capacity];
    size = 0;
  }
/**
 * add elements to the end of the list and check to not add null
 */
  @Override
  public void add(A element) {
    if (element == null) {
      throw new IllegalArgumentException("Element not null");
    }
    if (size == array.length) {
      resize();
    }
    array[size++] = element;
  }
/**
 * return element by index and check to get the index which we have had
 */
  @Override
  public A get(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("Index out of bounds");
    }
    return (A) array[index];
  }
/**
 * remove element by index and check to get the index which we have had
 */
  @Override
  public void remove(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("Index out of bounds");
    }
    for (int i = index; i < size - 1; i++) {
      array[i] = array[i + 1];
    }
    size--;
  }
/**
 * change the size of the list
 */
  private void resize() {
    Object[] newArraylist = new Object[array.length * 2];
    System.arraycopy(array, 0, newArraylist, 0, array.length);
    array = newArraylist;
  }
}
