import java.util.*;

public class CF492A_Vanyaandcubes {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int height = 0;
    int level = 1;

    while (n >= level * (level + 1) / 2) {
      n -= level * (level + 1) / 2;
      height++;
      level++;
    }

    System.out.println(height);

    sc.close();
  }
}