package ZohoSet2;

//    8.Given a list find all the leaders in the list, a number is said to be a leader if it is
//            greater than all the elements to the right of it
//            Input: leaders([16,17,4,3,5,2])
//            Output: 17,5,2

import java.util.ArrayList;

public class LeaderElement {
    public static void main(String[] args) {
        int a[] = {16,17,4,3,5,2};
        ArrayList<Integer> l = new ArrayList<>();
        l.add(a[a.length-1]);
        int max = a[a.length-1];
        for(int i = a.length-2;i>=0;i--){
            if(a[i] > max){
                l.add(a[i]);
                max = a[i];
            }
        }
        System.out.println("Leader Elements: ");
        for(int i=l.size()-1;i>=0;i--){
            System.out.print(l.get(i)+" ");
        }
    }
}
