package ZohoSet2;

//    4.Given a String with numbers and operators. Perform the operation on the numbers in
//            their respective order. Operator precedence need not be considered. The input string
//            will have the numbers followed by the operators.
//            Input: 12345 * + - +
//            Result: 6
//            Input: 374291 - - * + -
//            Result:-4

public class OperatorCalculation {
    public static void main(String[] args) {
        String s = "374291--*+-";
        int operatorInitialIndex = 0;
        for(int i=0;i<s.length();i++){
            if(!(s.charAt(i)>='0' && s.charAt(i)<='9')){
                operatorInitialIndex = i;
                break;
            }
        }
        int numberIndex = 0;
        int ans = 0;
        int operatorIndex = operatorInitialIndex;
        int a = s.charAt(numberIndex++)-'0';
        while(numberIndex < operatorInitialIndex){
            int b = s.charAt(numberIndex)-'0';
            char op  = s.charAt(operatorIndex);
            switch (op){
                case '+':
                    ans = a + b;
                    a = ans;
                    break;
                case '-':
                    ans = a - b;
                    a = ans;
                    break;
                case '*':
                    ans = a * b;
                    a = ans;
                    break;
                case '/':
                    ans = a / b;
                    a = ans;
                    break;
            }
            operatorIndex++;
            numberIndex++;
        }
        System.out.println("Answer: "+ans);

    }
}
