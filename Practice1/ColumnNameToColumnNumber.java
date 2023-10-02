package Practice1;

//7.TO PRINT COLUMN NAME OF EXCEL SHEET
//        EG: 28=AB
public class ColumnNameToColumnNumber {
    public static void main(String[] args) {
        String s = "AB";
        int res = 0;
        for(int i=0;i<s.length();i++){
            res = res * 26 + s.charAt(i)-'A'+1;
        }
        System.out.println(res);
    }
}
