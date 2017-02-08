package dataStructure.search;

/*public class BinarySearch {

}*/

import java.util.Arrays;
import java.util.Collections;

class BinarySearch 
{
  public static void main(String args[])
  {
    char characters[] = { 'a', 'b', 'c', 'd', 'e' };
 
    System.out.println(Arrays.binarySearch(characters, 'a'));
    System.out.println(Arrays.binarySearch(characters, 'p'));
  }
}
