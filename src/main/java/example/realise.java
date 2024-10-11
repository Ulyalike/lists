/**
 * create interface with different methods which is parameterized 
 */
package example;
public interface realise<A> {
/**
 * add elements to the end of the list
 */
  void add(A element);
/**
 * return element by index
 */
  A get(int index);
/**
 * remove element by index
 */
  void remove(int index);
}
