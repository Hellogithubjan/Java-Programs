package zset1;

import java.util.*;
//        0 
//      1 0 1 
//    2 1 0 1 2 
//  3 2 1 0 1 2 3 
//4 3 2 1 0 1 2 3 4

public class pattern7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (2 * n) - 1; j++) {
                if (j < (n - i) - 1) {
                    System.out.print("  ");
                } else if (j >= (n - i - 1) && j <= (n - 1)) {
                    System.out.print((n - j - 1) + " ");
                } else if (j > (n - 1) && j <= (n + i - 1)) {
                    System.out.print((j - n + 1) + " ");
                }
            }
            System.out.println();
        }
    }
}
