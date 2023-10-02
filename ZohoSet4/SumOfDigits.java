package ZohoSet4;

//    1. Find the sum of the digits of given number.
//            Input : 114
//            Output : 6
//            Input: 1999
//            Output: 1


public class SumOfDigits {
    public static void main(String[] args) {
        int n = 1999;
        System.out.println("Sum of Digits : "+findSumOfDigits(n));
    }

    private static int findSumOfDigits(int n) {
        if(n<10)
            return n;
        else{
            int sum = 0;
            while(n!=0){
                int dig = n%10;
                sum = sum + dig;
                n/=10;
            }
            return findSumOfDigits(sum);
        }
    }
}
