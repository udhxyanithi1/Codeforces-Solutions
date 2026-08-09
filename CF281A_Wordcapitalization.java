import java.util.Scanner;

public class CF281A_Wordcapitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        char first = Character.toUpperCase(word.charAt(0));

        System.out.println(first + word.substring(1));

        sc.close();
    }
}