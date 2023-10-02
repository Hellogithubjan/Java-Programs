package Practice1;

//6.MERGE TWO ARRAY WITHOUT DUPLICATE ELEMENTS
// op = {-19, -7, -5, -4, 0, 3, 6, 7, 8, 11, 13, 21}

import java.util.Arrays;

public class five {
    public static void sort(int a[],int low,int high){
        if(low>=high)
            return;
        int s = low;
        int e = high;
        int m = s + (e - s)/2;
        int pivot = a[m];
        while(s<=e){
            while(a[s]<pivot)
                s++;
            while (a[e]>pivot)
                e--;
            if(s<=e)
            {
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
        int a[] = {7, -5, 3, 8, -4, 11, -19, 21};
        int b[] = {6, 13, -7, 0, 11, -4, 3, -5};
        sort(a,0,a.length-1);
        sort(b,0,b.length-1);

        int i = 0 , j = 0, m = 0;
        int merged[] = new int[a.length + b.length];

        while(i<a.length && j<b.length){
            if(a[i]<b[j])
                merged[m++] = a[i++];
            else if(b[j]<a[i])
                merged[m++] = b[j++];
            else{
                merged[m++] = a[i++];
                j++;
            }
        }
        if(i!=a.length){
            if(i == a.length -1 && a[i-1]!=a[i]){
                merged[m++] = a[i];
            }
            else{
                for(int k = i;k<a.length-1;k++){
                    if(a[k]!=a[k+1]){
                        merged[m++] = a[k];
                    }
                }
            }
        }
        else if(j!=b.length){
            if(i == b.length -1 && b[j-1]!=b[j]){
                merged[m++] = b[j];
            }
            else{
                for(int k = j;k<b.length-1;k++){
                    if(b[k]!=a[k+1]){
                        merged[m++] = b[k];
                    }
                }
            }
        }
        for(int k = 0;k<m;k++){
            System.out.print(merged[k]+" ");
        }
    }
}
