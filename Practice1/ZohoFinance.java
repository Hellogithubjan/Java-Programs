package Practice1;

public class ZohoFinance {
    public static void main(String[] args) {
        String s = "ZOHOFINANCE";
        int j=0;
        for(int i=0;i<s.length();){
            if(i==j || i+j==s.length()-1){
                System.out.print(s.charAt(j));
                j++;
            }
            else if(j==s.length()){
                i++;
                j=0;
                System.out.println();
            }
            else{
                System.out.print(" ");
                j++;
            }
        }
    }
}
