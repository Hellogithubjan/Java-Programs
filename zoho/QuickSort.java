package zoho;

import java.lang.reflect.Array;
import java.util.Arrays;

public class QuickSort {
    static void sort(int a[],int start,int end){
        int low = start;
        int high = end;
        int mid = low + (high - low)/2;
        if(start>=end){
            return;
        }
        int pivot = a[mid];
        while(low<=high){
            while(a[low]<pivot){
                low++;
            }
            while(a[high]>pivot){
                high--;
            }
            if(low<=high){
                int temp = a[low];
                a[low] = a[high];
                a[high] = temp;
                low++;
                high--;
            }
        }
        sort(a,start,high);
        sort(a,low,end);
    }

}
