package ZohoSet2;
//    7.Given 2 lists find the union, intersection, and except of the 2 lists, where except
//            contains numbers from first list if it is even and numbers from second list if it is odd
//            Input:
//            l1 = [1,2,5,3,8,9]
//            l2 = [1,7,5,8,8]
//            Output:
//            union [1, 2, 5, 3, 8, 9, 7]
//            except [2, 8, 1, 7, 5]
//            intersect [1, 5, 8]

import java.util.*;

public class UnionIntersectionExcept {
    public static void findUnion(int[] l1, int[]l2){
        LinkedHashSet<Integer> s = new LinkedHashSet<>();
        for (int i=0;i<l1.length;i++){
            s.add(l1[i]);
        }
        for (int i=0;i<l2.length;i++){
            s.add(l2[i]);
        }
        System.out.println(s.toString());
    }

    public static void main(String[] args) {
        int l1[] = {1,2,5,3,8,9};
        int l2[] = {1,7,5,8,8};
        findUnion(l1,l2);
    }
}
