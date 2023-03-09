//1
//2 6
//3 7 10
//4 8 11 13
//5 9 12 14 15
package zset1;

import java.util.*;

public class pattern1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println();
        int i, j = n - 1, k = 1, sum = 0;
        for (i = 1; i <= n;) {
            if (k == 1) {
                sum = i;
                System.out.print(sum + " ");
                k++;
            }
            if (k <= i) {
                sum += j;
                System.out.print(sum + " ");
                k++;
                j--;
            } else {
                System.out.println();
                k = 1;
                i++;
                j = n - 1;
                sum = 0;
            }
        }
    }

}
