package zset1;

import java.util.*;
//4 4 4 4 4 4 4
//4 3 3 3 3 3 4
//4 3 2 2 2 3 4
//4 3 2 1 2 3 4
//4 3 2 2 2 3 4
//4 3 3 3 3 3 4
//4 4 4 4 4 4 4

public class pattern10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println();
        int size = 2 * n - 1;
        int start = 0, end = size - 1;
        int a[][] = new int[size][size];
        while (n != 0) {
            for (int i = start; i <= end; i++) {
                for (int j = start; j <= end; j++) {
                    if (i == start || i == end || j == start || j == end) {
                        a[i][j] = n;
                    }
                }
            }
            ++start;
            --end;
            --n;
        }
        for (int i = 0; i < size; i++) {
            for (int k = 0; k < size; k++) {
                System.out.print(a[i][k] + " ");
            }
            System.out.println();
        }
    }
}
