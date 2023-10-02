package zoho.set3;
import java.util.*;
public class SortElementsUsingPostions {
    public static void sort(int a[],int low,int high){
        int s = low;
        int e = high;
        int mid = s + (e-s)/2;
        int pivot = a[mid];
        if(low >= high)
            return;
        while(s <= e){
            while(a[s]<pivot)
                s++;
            while(a[e]>pivot)
                e--;
            if(s <= e){
                int tmp = a[s];
                a[s] = a[e];
                a[e] = tmp;
                s++;
                e--;
            }
        }
        sort(a,low,e);
        sort(a,s,high);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Elements in the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Array Elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sort(arr,0,n-1);
        int left = 0,right = n-1;
        while(left < right){

        }

        System.out.println(Arrays.toString(arr));
    }

}
