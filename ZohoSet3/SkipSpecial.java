package ZohoSet3;

//    6.Palindrome
//            Rule: Skip the special characters (!@#$%^&*)
//            Input : m a l a y a l a m
//            Output: True
//            Input : m @ a l a $ $ y * a & l a m (malayalam)
//            Output: True
//            Input : S o m e t h i n g
//            Output: false


public class SkipSpecial {
    public static void main(String[] args) {
        boolean flag = true;
        String s = "m@ala$$y*a&lam";
        int i = 0,j = s.length()-1;
        while(i<j){
            if(!((s.charAt(i)>='a'&&s.charAt(i)<='z')||(s.charAt(i)>='A'&&s.charAt(i)<='Z'))){
                i++;
            }
            if(!((s.charAt(j)>='a'&&s.charAt(j)<='z')||(s.charAt(j)>='A'&&s.charAt(j)<='Z'))){
                j--;
            }
            else if(s.charAt(i)!=s.charAt(j)){
                flag = false;
                break;
            }
            else{
                flag = true;
                i++;
                j--;
            }
        }
        System.out.println("Text : "+s);
        System.out.println("Is Palindrome : "+flag);

    }
}
