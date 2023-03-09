package zset1;

import java.util.*;
//    *        *
//    **      **
//    ***    ***
//    ****  ****
//    **********
//    ****  ****
//    ***    ***
//    **      **
//    *        *

public class pattern11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println();
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= 2 * n; j++) {
                if (j <= i || ((j >= (2 * n - i) + 1) && j <= 2 * n)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (i = n + 1; i <= 2 * n - 1; i++) {
            for (j = 1; j <= 2 * n; j++) {
                if (j <= 2 * n - i || ((j > i && j <= 2 * n))) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
