import java.util.*;

public class CF807A_Isitrated {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int[] a = new int[n];
    int[] b = new int[n];

    boolean changed = false;

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();

      if (a[i] != b[i]) {
        changed = true;
      }
    }

    if (changed) {
      System.out.println("rated");
    } 
    else {
      boolean wrongOrder = false;

      for (int i = 1; i < n; i++) {
        if (a[i] > a[i - 1]) {
          wrongOrder = true;
          break;
        }
      }

      if (wrongOrder) {
        System.out.println("unrated");
      } else {
        System.out.println("maybe");
      }
    }
    sc.close();
  }
}