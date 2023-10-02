package Practice1;

//    2.TO FIND THE MATCH BETWEEN STRINGS AND CHECK IF THE STRING IS A SUBSTRING OF
//            ANOTHER
//            INPUT1:TEST123
//            INPUT2:123
//            OUTPUT:4(INDEX OF STARTING SUBSTRING)

public class two {
    public static void main(String[] args) {
        String ip1 = "TEST1234";
        String ip2 = "123";
        int ind1 = 0,ind2=0,index=-1;
        while(ind1 < ip1.length() && ind2<ip2.length()){
            if(ip1.charAt(ind1)!=ip2.charAt(ind2))
                ind1++;
            else if(ip1.charAt(ind1)==ip2.charAt(ind2)) {
                index = ind1;
                while(ind2 < ip2.length()){
                    if(ip1.charAt(ind1)==ip2.charAt(ind2)){
                        ind1++;
                        ind2++;
                    }
                    else{
                        ind1 = index+1;
                        ind2=0;
                        index = -1;
                        break;
                    }
                }
            }
        }
        System.out.println("Index : "+index);
    }
}
