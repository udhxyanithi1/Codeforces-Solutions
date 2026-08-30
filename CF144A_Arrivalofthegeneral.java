import java.util.*;

public class CF144A_Arrivalofthegeneral {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] heights = new int[n];

    for (int i = 0; i < n; i++) {
      heights[i] = sc.nextInt();
    }

    int maxIndex = 0;
    int minIndex = 0;

    for (int i = 0; i < n; i++) {
      if (heights[i] > heights[maxIndex]) {
        maxIndex = i;
      }

      if (heights[i] <= heights[minIndex]) {
        minIndex = i;
      }
    }

    int swaps = maxIndex + (n - 1 - minIndex);

    if (maxIndex > minIndex) {
      swaps--;
    }

    System.out.println(swaps);

    sc.close();
  }
}