package ZohoSet2;

//    5.Replace the array of numbers with next greatest to the each number in the right side
//            of the array. If there is no greatest number than given, replace it by -1.
//            (Replace using the same array given. Do not use another array)
//            Input:
//            [1,9,7,56,36,91,42]
//            Output:
//            [7,36,36,91,42,-1,-1]

public class NextGreatest {
    public static void main(String[] args) {
        int a[] = {1,9,7,56,36,91,42};
        int n = a.length;
        int max;
        for(int i=0;i<n-1;i++){
            max = -1;
            for(int j=i+1;j<n;j++){
                if(a[j]>a[i]){
                    if(a[j]<max){
                        max = a[j];
                        break;
                    }
                    else {
                        max = a[j];
                    }
                }

            }
            a[i] = max;
        }
        a[n-1] = -1;
        for (int ele:a){
            System.out.print(ele+" ");
        }
    }
}
