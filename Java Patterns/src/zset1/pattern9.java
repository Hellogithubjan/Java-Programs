package zset1;

import java.util.*;
//1
//2 4
//3 5 7
//6 8 10 12
//9 11 13 15 17

public class pattern9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println();
        int odd = 1, even = 2, j = 1;
        for (int i = 1; i <= n;) {
            if (i % 2 != 0 && j <= i) {
                System.out.print(odd + " ");
                odd += 2;
                j++;
            } else if (i % 2 == 0 && j <= i) {
                System.out.print(even + " ");
                even += 2;
                j++;
            } else {
                System.out.println();
                j = 1;
                i++;
            }
        }
    }
}
