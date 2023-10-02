package ZohoSet4;

//    2. Print the following pattern.
//            Input : n=5
//            Output:
//                +
//               +++
//              +++++
//             +++++++
//            +++++++++

public class PrintPlusTrianglePattern {
    public static void main(String[] args) {
        int n = 5;
        int k = 0;
        for(int i=0;i<n;i++){
            for(int j = 0;j<2*n-1;j++){
                if(j<n-i-1 || i+j>=n+i+k){
                    System.out.print(" ");
                }
                else{
                    System.out.print("+");
                }
            }
            System.out.println();
            k++;
        }

    }
}
