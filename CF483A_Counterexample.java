import java.util.*;

public class CF483A_Counterexample {
  static long gcd(long a, long b) {
    while (b != 0) {
      long temp = a % b;
      a = b;
      b = temp;
    }
    return a;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    long l = sc.nextLong();
    long r = sc.nextLong();

    for (long a = l; a <= r; a++) {
      for (long b = a + 1; b <= r; b++) {
        for (long c = b + 1; c <= r; c++) {

          if (gcd(a, b) == 1 &&
              gcd(b, c) == 1 &&
              gcd(a, c) != 1) {

            System.out.println(a + " " + b + " " + c);
            sc.close();
            return;
          }
        }
      }
    }

    System.out.println("-1");

    sc.close();
  }
}