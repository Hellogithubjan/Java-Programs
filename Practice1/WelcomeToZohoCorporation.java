package Practice1;

//    3. Save the string “WELCOMETOZOHOCORPORATION” in a two dimensional array and search
//            for substring like “too” in the two dimensional string both from left to right and from top to bottom.
//            W E L C O
//            M E T O Z
//            O H O C O
//            R P O R A
//            T I O N
//            And print the start and ending index as
//            Start index : <1,2>
//            End index: <3, 2>

import java.util.Arrays;
import java.util.Scanner;

public class WelcomeToZohoCorporation {
    public static void main(String[] args) {
        char[][] a = new char[5][5];
        String s = "WELCOMETOZOHOCORPORATION";
        int pos = 0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(pos >= s.length()){
                    a[i][j] = ' ';
                }
                else{
                    a[i][j] = s.charAt(pos++);
                }
            }
        }
        //Printing Array
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the substring to search: ");
        String sub = sc.nextLine().toUpperCase();
        int[] start = {-1,-1};
        int[] end = {-1,-1};
        boolean flag = false;

        //search row wise
        for(int i=0;i<5;i++){
            String str = "";
            for(char c:a[i]){
                str+=c;
            }
            if(str.contains(sub)){
                start[0] = i;
                end[0] = i;
                start[1] = str.indexOf(sub);
                end[1] = start[1]+sub.length();
                flag=true;
                break;
            }
        }
        //search column wise
        if(!flag){
            for(int i=0;i<5;i++){
                String str="";
                int j;
                for(j=0;j<5;j++){
                    str+=a[j][i];
                }
                if(str.contains(sub)){
                    start[0] = str.indexOf(sub);
                    end[0] = start[0]+sub.length()-1;
                    start[1] = i;
                    end[1] = i;
                    break;
                }
            }
        }
        System.out.println("Start Index : "+Arrays.toString(start));
        System.out.println("End Index : "+Arrays.toString(end));
    }
}
