package ZohoSet4;

//    3. Subtraction of long integers in array. Consider two array A and B subtract A from B
//            and store the result in new array C
//            Input :
//            A=[1,2,1,5,3]
//            B=[5,8,7,9]
//            Output:
//            C=[6,2,7,4]

import java.util.Arrays;


public class SubtractLongIntegers {
    public static void main(String[] args) {
        int A[] = {1,2,1,5,3};
        int B[] = {5,8,7,9};
        int ap = A.length-1;
        int bp = B.length-1;
        String diff = "";
        int borrow = 0;
        while (bp>=0){
            if(A[ap]<=B[bp]){
                A[ap] = borrow + 10 + A[ap];
                int d = A[ap] - B[bp];
                diff+=d;
                borrow = -1;
            }
            else if(borrow+A[ap]-B[bp]==0){
                borrow = 0;
            }
            else{
                int d = borrow + A[ap] - B[bp];
                diff+=d;
                borrow=0;
            }
            ap--;
            bp--;
        }
        if(ap!=-1){
            while(ap!=-1){
                if(ap-1 == -1 && borrow+A[ap]==0){
                    ap--;
                }
                else{
                    int d = borrow + A[ap];
                    diff+=d;
                    borrow = 0;
                    ap--;
                }
            }
        }
        int subtractArray[] = new int[diff.length()];
        int index = 0;
        for(int i=diff.length()-1;i>=0;i--){
            subtractArray[index++] = diff.charAt(i)-'0';
        }
        System.out.println(Arrays.toString(subtractArray));
    }
}
