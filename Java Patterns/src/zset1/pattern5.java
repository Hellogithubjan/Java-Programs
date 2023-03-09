package zset1;

import java.util.*;
//1   3   6   10  15
//2   5   9   14  19
//4   8   13  18  22
//7   12  17  21  24
//11  16  20  23  25

public class pattern5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println();
        int r, c, i, j = 1;
        int a[][] = new int[n][n];
        for (i = 0; i < n; i++) {
            for (r = i, c = 0; r >= 0; r--, c++) {
                a[r][c] = j++;
            }
        }
        for (i = 1; i < n; i++) {
            for (r = n - 1, c = i; r >= i; r--, c++) {
                a[r][c] = j++;
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
