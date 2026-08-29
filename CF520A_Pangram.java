import java.util.*;

public class CF520A_Pangram {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    sc.nextInt();
    String s = sc.next();

    boolean[] letters = new boolean[26];

    for (int i = 0; i < s.length(); i++) {
      char c = Character.toLowerCase(s.charAt(i));
      letters[c - 'a'] = true;
    }

    for (int i = 0; i < 26; i++) {
      if (!letters[i]) {
        System.out.println("NO");
        sc.close();
        return;
      }
    }

    System.out.println("YES");

    sc.close();
  }
}