package zoho;

public class SearchIndex {
    public static void main(String[] args) {
        String input = "WELCOMETOZOHOCORPORATION";
        char[][] ch = new char[5][5];
        int ind = 0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(i==4 && j>3){
                    ch[i][j] = ' ';
                }
                else{
                    ch[i][j] = input.charAt(ind++);
                }
            }
        }
        String substring = "TOO";
        boolean found = false;
        for(int i = 0;i<5;i++){
            String s = new String(ch[i]);
            int index = s.indexOf(substring);
            if(index != -1){
                System.out.println("Start Index : < "+i+" , "+index+" > ");
                System.out.println("Start Index : < "+i+" , "+(index + substring.length()-1)+" > ");
                found = true;
                break;
            }
        }
        if(!found){
            for(int j=0;j<5;j++){
                StringBuilder c = new StringBuilder();
                for(int i=0;i<5;i++){
                    c.append(ch[i][j]);
                }
                String s = new String(c);
                int index = s.indexOf(substring);
                if(index != -1){
                    System.out.println("Start Index : < "+index+" , "+j+" > ");
                    System.out.println("End Index : < "+(index + substring.length()-1)+" , "+j+" > ");
                    found = true;
                    break;
                }

            }


        }


    }

}
