package ZohoSet2;
// 1.Given an array . Create two arrays one for Odd Elements and other for Even
//        Elements.
//        Input: [10,3,5,12,17,22]
//        Output:
//        [10,12,22]
//        [3,5,7]
//        Explanation:
//        [10,12,22] - Even Array
//        [3,5,7] - Odd Array

import java.util.ArrayList;
import java.util.Collection;

public class OddEvenArray {
    public static void main(String[] args) {
        int arr[] = {10,3,5,12,17,22};
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        for(int ele : arr){
            if(ele % 2 == 0)
                even.add(ele);
            else
                odd.add(ele);
        }
        System.out.println("Even Array: "+ even.toString());
        System.out.println("Odd Array: "+odd.toString());

    }
}
