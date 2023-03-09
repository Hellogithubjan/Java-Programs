package zset1;

//z o h o c o r 
//          p   
//        o     
//      r       
//    a         
//  t           
//i o n t e a m 
public class pattern6 {

    public static void main(String[] args) {
        String s = "zohocorporationteam";
        int k = 0;
        for (int i = 0; i < 7; i++) {
            if (i == 0 || i == 6) {
                for (int j = 0; j < 7; j++) {
                    System.out.print(s.charAt(k++) + " ");
                }
            } else {
                for (int j = 0; j < 7; j++) {
                    if (i + j == 6) {
                        System.out.print(s.charAt(k++) + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }

    }
}
