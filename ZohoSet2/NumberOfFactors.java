package ZohoSet2;

//    9. Sort the given array on the basis of number of factors each array element has. No
//            new array should be created. Only the original array have to be modified.
//            Input: [8,15,25,36,42]
//            Output: [25,15,8,42,36]
//            Explanation:
//            Array Element    Number of Factors
//                8                     4
//                15                    4
//                25                    3
//                36                    9
//                42                    8

import java.util.Arrays;
import java.util.HashMap;

public class NumberOfFactors {
    public static int countFactor(int ele){
        int f = 2;
        for(int i=2;i<=ele/2;i++){
            if(ele % i == 0)
                f++;
        }
        return f;
    }


    public static void main(String[] args) {
        int a[] = {8, 15, 25, 36, 42};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int ele : a) {
            map.put(ele, countFactor(ele));
        }
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                int v1 = map.get(a[j]);
                int v2 = map.get(a[j+1]);
                if(v1>v2){
                    int temp = a[j];
                    a[j]= a[j+1];
                    a[j+1]=temp;
                }

            }
        }
        System.out.println(Arrays.toString(a));
    }
}
