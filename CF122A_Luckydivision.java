import java.util.*;

public class CF122A_Luckydivision {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    boolean almostLucky = false;

    for (int i = 1; i <= n; i++) {
      if (isLucky(i) && n % i == 0) {
        almostLucky = true;
        break;
      }
    }

    if (almostLucky) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }

    sc.close();
  }

  static boolean isLucky(int number) {
    while (number > 0) {
      int digit = number % 10;

      if (digit != 4 && digit != 7) {
        return false;
      }

      number /= 10;
    }

    return true;
  }
}