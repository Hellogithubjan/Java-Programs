package zset1;
import java.util.*;
//    **********
//    ****  ****
//    ***    ***
//    **      **
//    *        *
//    *        *
//    **      **
//    ***    ***
//    ****  ****
//    **********

public class pattern12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println();
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= 2 * n; j++) {
                if (j <= n - i + 1 || (j >= n + i && j <= 2 * n)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= 2 * n; j++) {
                if (j <= i || ((j >= ((2 * n - i) + 1) && j <= 2 * n))) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
