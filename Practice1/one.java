package Practice1;

// Input : 123456789
// Output : X-pattern

public class one {
    public static void main(String[] args) {
        String s = "123456789";
        int j=0;
        for(int i=0;i<s.length();){
            if(j<(2*s.length()-1)){
                if(i==j)
                    System.out.print(s.charAt(i));
                else if(i+j == s.length()-1)
                    System.out.print(s.charAt(i));
                else{
                    System.out.print(" ");
                }
                j++;
            }
            else{
                System.out.println();
                i++;
                j=0;
            }
        }
    }
}
