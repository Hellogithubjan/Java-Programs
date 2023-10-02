package zoho.set3;
import java.util.*;
public class ExpandFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res="";
        for(int i=0;i<s.length();){
            char CharacterToBePrinted = 0;
            if((s.charAt(i)>='a'&& s.charAt(i)<='z') || (s.charAt(i)>='A'&& s.charAt(i)<='Z') ){
                CharacterToBePrinted = s.charAt(i);
            }
            int j=i+1;
            int NoOfTimesToBePrinted = 0;
            while(j<s.length()){
                if(s.charAt(j)>='0' && s.charAt(j)<='9'){
                    NoOfTimesToBePrinted = NoOfTimesToBePrinted * 10 + (s.charAt(j)-'0');
                }
                else{
                    break;
                }
                j++;
            }
            for(int k=1;k<=NoOfTimesToBePrinted;k++){
                res+=CharacterToBePrinted;
            }
            i+=(String.valueOf(NoOfTimesToBePrinted).length())+1;
        }
        System.out.println("Result:"+res);
    }
}
