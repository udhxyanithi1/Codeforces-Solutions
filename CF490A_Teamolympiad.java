import java.util.*;

public class CF490A_Teamolympiad {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    ArrayList<Integer> programming = new ArrayList<>();
    ArrayList<Integer> maths = new ArrayList<>();
    ArrayList<Integer> pe = new ArrayList<>();

    for (int i = 1; i <= n; i++) {
      int x = sc.nextInt();

      if (x == 1) {
          programming.add(i);
      } else if (x == 2) {
          maths.add(i);
      } else {
          pe.add(i);
      }
    }

    int teams = Math.min(programming.size(),
    Math.min(maths.size(), pe.size()));

    System.out.println(teams);

    for (int i = 0; i < teams; i++) {
      System.out.println(programming.get(i) + " "
      + maths.get(i) + " "
      + pe.get(i));
    }
  sc.close();
  }
}