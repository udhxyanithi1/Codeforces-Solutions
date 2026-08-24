import java.util.*;

public class CF110A_Nearlyluckynumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String n = sc.next();
    int luckyCount = 0;

    for (int i = 0; i < n.length(); i++) {
      if (n.charAt(i) == '4' || n.charAt(i) == '7') {
        luckyCount++;
      }
    }

    if (luckyCount == 4 || luckyCount == 7) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }

    sc.close();
  }
}