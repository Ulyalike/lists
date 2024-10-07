package example;
public class customarraylist<A> implements realise<A> {
  private Object[] array;
  private int size;
  public customarraylist(int Capacity) {
    array = new Object[Capacity];
    size = 0;
  }
  @Override
  public void add(A element) {
    if (element == null) {
      throw new IncorrectPointer("Element not null");
    }
    if (size == array.length) {
      resize();
    }
    array[size++] = element;
  }
  @Override
  public A get(int index) {
    if (index < 0 || index >= size) {
      throw new IncorrectIndex("Index out of bounds");
    }
    return (A) array[index];
  }
  @Override
  public void remove(int index) {
    if (index < 0 || index >= size) {
      throw new IncorrectIndex("Index out of bounds");
    }
    for (int i = index; i < size - 1; i++) {
      array[i] = array[i + 1];
    }
    size--;
  }
  private void resize() {
    Object[] newArraylist = new Object[array.length * 2];
    System.arraycopy(array, 0, newArraylist, 0, array.length);
    array = newArraylist;
  }
}
