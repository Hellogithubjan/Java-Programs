package ZohoSet2;

// 3.Sort the indexes of the array as per the elements of the array:
//        Input Array: [5, 6, 1, 2, 8, 4, 3, 0]
//        Sorted indices as per input array: [7, 2, 3, 6, 5, 0, 1, 4]
//        Input Array: [4, 3, 2, 1]
//        Sorted indices: [3, 2, 1, 0]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class IndexSorting {
    public static void sort(int a[],int low,int high){
        if(low>=high)
            return;
        int s = low;
        int e = high;
        int m = s + (e - s)/2;
        int pivot = a[m];
        while(s<=e){
            while (a[s]<pivot)
                s++;
            while (a[e]>pivot)
                e--;
            if (s<=e){
                int temp = a[s];
                a[s] = a[e];
                a[e] = temp;
                s++;
                e--;
            }
        }
        sort(a,low,e);
        sort(a,s,high);

    }
    public static void main(String[] args) {
        int a[] = {5, 6, 1, 2, 8, 4 , 3, 4, 0};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<a.length;i++){
            map.put(i,a[i]);
        }
        System.out.println("Input Array: "+Arrays.toString(a));
        sort(a,0,a.length-1);
        System.out.println("Output Array: ");
        for(int ele : a){
            int value = ele;
            for(int key : map.keySet()){
                if(map.get(key)==value){
                    System.out.print(key+" ");
                    map.put(key,0);
                    break;
                }
            }
        }
    }
}
