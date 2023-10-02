package ZohoSet3;

//    3.Write a program for the following.
//            Input: 1213
//            Output: One Thousand Two Hundred and Thirteen
//            Input range: 0-99999

public class NumberExpression {
    public static void main(String[] args) {
        int num = 13;
        if(num == 0){
            System.out.println("Zero");
        }
        else {
            String digits[] = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                    "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
            String tens[] = {"", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
            if(num < 20){
                System.out.println(digits[num]);
            }
            else{

            }

        }




    }
}
