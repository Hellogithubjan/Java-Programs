package zset1;

import java.util.*;
//1   2   6   7    15
//3   5   8   14   16
//4   9   13  17   22
//10  12  18  21   23
//11  19  20  24   25

public class pattern8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println();
        int r, c, i, j = 1;
        int a[][] = new int[n][n];
        for (i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (r = i, c = 0; r >= 0; r--, c++) {
                    a[r][c] = j++;
                }

            } else {
                for (r = 0, c = i; r <= i; r++, c--) {
                    a[r][c] = j++;
                }
            }
        }

        for (i = 1; i < n; i++) {
            if (i % 2 == 0) {
                for (r = n - 1, c = i; r >= i; r--, c++) {
                    a[r][c] = j++;
                }
            } else {
                for (r = i, c = n - 1; r <= n - 1; r++, c--) {
                    a[r][c] = j++;
                }
            }
        }
        for (i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                System.out.print(a[i][k] + " ");
            }
            System.out.println();
        }
    }

}
