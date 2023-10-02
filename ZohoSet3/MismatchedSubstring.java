package ZohoSet3;

//    8.String Mismatched Substrings
//            For a given string, find all mismatched substrings
//            Input : AABBCCDD,ABCDCCAD
//            Output : ABB , BCD, D , A


public class MismatchedSubstring {
    public static void main(String[] args) {
        String s1 = "AABBCCDD";
        String s2 = "ABCDCCAD";
        String substring1 = "";
        String substring2 = "";
        int i = 0,j=0;
        while(i<s1.length()-1 && j<s2.length()-1){
            if(s1.charAt(i) != s2.charAt(i)){
                substring1+=s1.charAt(i);
                substring2+=s2.charAt(j);
                if(s1.charAt(i+1)==s2.charAt(j+1)){
                    System.out.print(substring1+" "+substring2+" ");
                    substring1="";
                    substring2="";
                    i++;
                    j++;
                }
                i++;
                j++;
            }
            else{
                i++;
                j++;
            }
        }
        if(i!= s1.length())
            System.out.print(s1.substring(i)+" ");
        if(j!=s2.length())
            System.out.print(s2.substring(j)+" ");
    }
}
