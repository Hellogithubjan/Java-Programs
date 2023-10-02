package ZohoSet3;

import java.util.Arrays;

//    Input  :
//            Text = Zoho_Corp_Madurai  //(length is 17)
//            Padding = 25
//            -Space between the strings should be evenly distributed.
//            Output : Zoho__Corp__Madurai  //(lenth is 25)

public class AdjustToPadding {
    public static void main(String[] args) {
        String s = "Zoho_Corp_Madurai";
        int padding = 25;
        String a[] =s.split("_");
        for(int i=0;i<a.length-1;i++){
            a[i] = a[i]+'_';
        }
        int wholespacesTOBeAdded = padding - s.length();
        int individualSpace = wholespacesTOBeAdded/2;
        while(individualSpace!=0){
            for(int i=0;i<a.length-1;i++){
                a[i] = a[i]+'_';
            }
            individualSpace--;
        }
        String res = "";
        for(String str: a){
            res+=str;
        }
        System.out.println("Resultant String: "+res);
        System.out.println("Padding : "+res.length());
    }
}
