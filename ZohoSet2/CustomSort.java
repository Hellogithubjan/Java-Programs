package ZohoSet2;

import java.util.Arrays;

//2.Custom Sort:
//        For a given array, print the following:
//        [ Largest Number , Smallest Number , Second Largest Number ,Second Smallest Number, … ]
//        Input : 1 8 3 6 4
//        Output : 8 1 6 3 4
public class CustomSort {
    public static void sort(int a[],int low,int high){
        if(low >= high){
            return;
        }
        int s = low;
        int e = high;
        int m = s + (e - s)/2;
        int pivot = a[m];
        while(s <= e){
            while(a[s]<pivot)
                s++;
            while(a[e]>pivot)
                e--;
            if(s<=e){
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
        int a[] = {1,8,3,6,4};
        sort(a,0,a.length-1);
        int arr[] = new int[a.length];
        int i=0, j = a.length-1,ind = 0;
        while(i<j){
            arr[ind++] = a[j--];
            arr[ind++] = a[i++];
        }
        if(a.length % 2 == 0)
            System.out.println(Arrays.toString(arr));
        else{
            arr[ind] = a[i];
            System.out.println(Arrays.toString(arr));
        }

    }

}
