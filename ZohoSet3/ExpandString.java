package ZohoSet3;

//    1.Write a program to get the output:
//            Input: a1b10
//            Output: abbbbbbbbb
//            Input: b3c6d15
//            Output: bbbccccccddddddddddddddd

public class ExpandString {
    public static void main(String[] args) {
        String s = "b3c6d15";
        char c=s.charAt(0);
        int i=1;
        String res = "";
        while(i<s.length()){
            int num = 0;
            if((s.charAt(i)>='a' && s.charAt(i)<='z')||(s.charAt(i)>='A' && s.charAt(i)<='Z')){
                c = s.charAt(i);
                i++;
            }
            else{
                int j = i;
                while(j<s.length()){
                    if(s.charAt(j)>='0' && s.charAt(j)<='9'){
                        num = num * 10 + (s.charAt(j)-'0');
                        j++;
                        i++;
                    }
                    else{
                        break;
                    }

                }
                for(int k = 0;k<num;k++)
                    res+=c;
            }

        }
        System.out.println("Resultant String: "+res);

    }
}
