package zoho;

import java.util.HashMap;

public class SearchGrandChildren {
    public static void main(String[] args) {
        HashMap<String,String> h = new HashMap<>();
        h.put("luke", "shaw");
        h.put("wayne", "rooney");
        h.put("rooney", "ronaldo");
        h.put("shaw", "rooney");

        // to find the number of grandsons of ronaldo
        // here ronaldo -> rooney -> wayne, shaw

        String targetPerson = "ronaldo";
        int countGrandChildren = 0;
        for(String child : h.keySet()){
            if(h.get(child).equals(targetPerson)){
                countGrandChildren += cgc(h,child);
            }
        }
        System.out.println("Grandsons of Ronaldo is "+countGrandChildren);
    }

    public static int cgc(HashMap<String,String> h, String person){
        int count = 0;
        for(String child : h.keySet()){
            if(h.get(child).equals(person)){
                count++;
            }
        }
        return count;
    }
}
