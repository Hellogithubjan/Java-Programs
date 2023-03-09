//        1
//      2 1
//    3 2 1
//  4 3 2 1
//5 4 3 2 1
package zset1;

import java.util.*;

public class pattern2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println();
        int j = 1;
        for (int i = n; i >= 1;) {
            if (j < i) {
                System.out.print("  ");
                j++;
            } else if (j >= i && j <= n) {
                System.out.print(((n - j) + 1) + " ");
                j++;
            } else {
                System.out.println();
                i--;
                j = 1;
            }
        }
    }

}
