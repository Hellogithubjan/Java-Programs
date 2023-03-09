//1          5
//   2    4
//      3
//   2    4
//1          5
package zset1;

import java.util.*;

public class pattern3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println();
        int j = 1;
        for (int i = 1; i <= n;) {
            if (j <= n) {
                if (i == j || (i + j) == n + 1) {
                    System.out.print(j + " ");
                    j++;
                } else {
                    System.out.print("  ");
                    j++;
                }
            } else {
                System.out.println();
                i++;
                j = 1;
            }
        }
    }
}
