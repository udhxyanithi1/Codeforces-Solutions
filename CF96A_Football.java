import java.util.*;

public class CF96A_Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                count = 1;
            }

            if (count >= 7) {
                System.out.println("YES");
                sc.close();
                return;
            }
        }

        System.out.println("NO");
        sc.close();
    }
}