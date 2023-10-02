package zoho;
import java.util.*;
public class OddLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(i==j || i+j==s.length()-1) {
                    System.out.print(s.charAt(j) + " ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
