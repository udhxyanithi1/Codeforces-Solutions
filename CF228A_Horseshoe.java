import java.util.*;

public class CF228A_Horseshoe {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Set<Integer> colors = new HashSet<>();

    for (int i = 0; i < 4; i++) {
      colors.add(sc.nextInt());
    }

    int answer = 4 - colors.size();

    System.out.println(answer);

    sc.close();
  }
}