package Practice1;

//7.TO PRINT COLUMN NAME OF EXCEL SHEET
//        EG: 28=AB

public class ColumnNumberToColumnName {
    public static void main(String[] args) {
        int num = 28;
        String s = "";
        while(num!=0){
            int d = num % 26;
            s+=(char)(65+d-1);
            num=num/26;
        }
        for(int i=s.length()-1;i>=0;i--)
            System.out.print(s.charAt(i));
    }
}
