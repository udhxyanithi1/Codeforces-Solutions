import java.util.Scanner;

public class CF339A_Helpfulmaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count1++;
            } else if (s.charAt(i) == '2') {
                count2++;
            } else if (s.charAt(i) == '3') {
                count3++;
            }
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < count1; i++) {
            if (result.length() > 0) {
                result.append("+");
            }
            result.append("1");
        }

        for (int i = 0; i < count2; i++) {
            if (result.length() > 0) {
                result.append("+");
            }
            result.append("2");
        }

        for (int i = 0; i < count3; i++) {
            if (result.length() > 0) {
                result.append("+");
            }
            result.append("3");
        }

        System.out.println(result);

        sc.close();
    }
}