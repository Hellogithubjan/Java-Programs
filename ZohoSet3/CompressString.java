package ZohoSet3;

//    2.Compression of String
//            Input: AAABBC
//            Output: A3B2C  (or)  A3BBC
//            Input: AAABBCCCDE
//            Output: A3B2C3DE  (or)  A3BBC3DE

import java.util.HashMap;
import java.util.Map;

public class CompressString {
    public static void main(String[] args) {
        String s = "AAABBCCCDE";
        String res="";
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int i=0;
        while(i<s.length()){
            if(map.get(s.charAt(i))==1){
                res+=s.charAt(i);
                i++;
            }
            else if(map.get(s.charAt(i))==2){
                res=res+s.charAt(i)+s.charAt(i);
                i+=2;
            }
            else{
                res=res+s.charAt(i)+map.get(s.charAt(i));
                i+=map.get(s.charAt(i));
            }
        }
        System.out.println("Resultant String: "+res);
    }
}
