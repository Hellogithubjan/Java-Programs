package zset1;

import java.util.*;
//1 2 3 4 5
//2 3 4 5 1
//3 4 5 1 2
//4 5 1 2 3
//5 1 2 3 4

public class pattern4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println();
        int j = 1, k = 1;
        for (int i = 1; i <= n;) {
            if (j <= (n - i) + 1) {
                System.out.print(k + " ");
                j++;
                k++;
            } else if (j > (n - i) + 1 && j <= n) {
                System.out.print((k - n) + " ");
                j++;
                k++;
            } else {
                System.out.println();
                i++;
                k = i;
                j = 1;
            }
        }
    }
}
