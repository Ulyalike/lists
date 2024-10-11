/**
 * example for our costumArrayList 
 */ 
package example;
public class Main {
  public static void main(String[] args) {
    realise<String> Alist = new customarraylist<>(5);
    Alist.add("first");
    Alist.add("second");
    Alist.add("third");
    System.out.println(Alist.get(0)); 
    System.out.println(Alist.get(1)); 
    Alist.remove(1);
    System.out.println(Alist.get(0)); 
    System.out.println(Alist.get(1)); 
  }
}
/**
 * output:
 * first second
 * first third
 */
