
import java.util.*;

public class AdiEndTerm {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] names = sc.nextLine().split(" ");
    int roll = sc.nextInt();
    Hashtable<Integer, String> ht = new Hashtable<>();
    for (int i = 0; i < names.length; i++) {
      ht.put(i + 1, names[i]);
    }
    List<Map.Entry<Integer, String>> list = new LinkedList<Map.Entry<Integer, String>>(ht.entrySet());
    Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
      public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
        return (o2.getKey()).compareTo(o1.getKey());
      }
    });
    for (Map.Entry<Integer, String> aa : list) {
      System.out.println(aa.getKey() + " " + aa.getValue());
    }
    if (ht.containsKey(roll)) {
      System.out.println("present");
    } else {
      System.out.println("not present");
    }
  }
}