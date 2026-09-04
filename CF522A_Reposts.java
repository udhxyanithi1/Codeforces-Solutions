import java.util.*;

public class CF522A_Reposts {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    Map<String, Integer> chain = new HashMap<>();
    chain.put("polycarp", 1);

    int max = 1;

    for (int i = 0; i < n; i++) {
      String name1 = sc.next().toLowerCase();
      sc.next(); // reposted
      String name2 = sc.next().toLowerCase();

      int length = chain.get(name2) + 1;
      chain.put(name1, length);

      if (length > max) {
        max = length;
      }
    }

    System.out.println(max);

    sc.close();
  }
}