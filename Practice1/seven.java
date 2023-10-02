package Practice1;

import java.util.*;

//1) Given an array, find the minimum of all the greater numbers for each element in the
//        array.
//
//        Sample:
//        Array : {2, 3, 7, 1, 8, 5, 11}
//
//        Output:
//        {2>3, 3>5, 7>8, 1>2, 8>11, 5>7, 11>}

public class seven {
    public static void main(String[] args) {
        int i, n = 35, s1 = 0, s2 = 0;
        for (i = n; i >= 0; i--) {
            if (i % 3 == 0)
                s1 += i;

            else if (i % 2 == 0)
                s2 += i;

            else if (i % 5 == 0)

                s1 -= i;
            else
                s2 -= i;
        }
        System.out.println("S1 = " + s1);
        System.out.println("S2 = " + s2);
    }
}
