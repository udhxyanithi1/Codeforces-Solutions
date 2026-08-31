import java.util.*;

public class CF443A_Antonandletters {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.nextLine();

    Set<Character> letters = new HashSet<>();

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);

      if (c >= 'a' && c <= 'z') {
        letters.add(c);
      }
    }

    System.out.println(letters.size());

    sc.close();
  }
}