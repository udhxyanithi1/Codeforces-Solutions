import java.util.Scanner;

public class CF546A_Soldierandbananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        long n = sc.nextLong();
        int w = sc.nextInt();

        long totalCost = 0;

        for (int i = 1; i <= w; i++) {
            totalCost += (long) i * k;
        }

        if (totalCost > n) {
            System.out.println(totalCost - n);
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}