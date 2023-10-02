package ZohoSet3;
//    4.Compare 2 equal length strings and find the mismatched pair of strings
//            Input:
//            str1 = "antonyandcleopatra"
//            str2 = "antaniandcleapadra"
//            compare(str1,str2)
//            Output:
//            o , a
//            y , i
//            o , a
//            t , d

import java.util.ArrayList;

//            Input:
//            str1 = "abcddefgikom"
//            str2 = "abdcdeffgklm"
//            compare(str1,str2)
//            Output:
//            cd , dc
//            gi , fg
//            o , l
public class CompareStrings {
    public static void main(String[] args) {
        String s1 = "abcddefgikom";
        String s2 = "abdcdeffgklm";
        ArrayList<String> l = new ArrayList<>();
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                l.add("< "+s1.charAt(i)+" , "+s2.charAt(i)+" > ");
            }
        }
        for (String s: l){
            System.out.println(s);
        }
    }
}
