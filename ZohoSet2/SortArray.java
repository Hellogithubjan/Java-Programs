package ZohoSet2;

//    6.Sort the given string array without using atoi or other built-in functions.
//            Input:
//            ['1', '15', '20', '4', '9', '14']
//            Output:
//            ['1', '4', '9', '14', '15', '20']


public class SortArray {

    public static int convertInt(String s){
        int num = 0;
        for(int i=0;i<s.length();i++){
            num = num * 10 + (s.charAt(i)-'0');
        }
        return num;
    }

    public static void sort(int a[],int low, int high){
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
        String arr[] = {"1", "15", "20", "4", "9", "14"};
        int a[] = new int[arr.length];
        int ind = 0;
        for(String s : arr){
            a[ind++] = convertInt(s);
        }
        sort(a,0,a.length-1);
        for (int ele : a){
            System.out.print(ele +" ");
        }
    }
}
