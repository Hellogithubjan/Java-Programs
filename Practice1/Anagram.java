package Practice1;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        if(s1.length()!=s2.length())
            System.out.println("No");
        else{
            int a[] = new int[26];
            for(int i=0;i<s1.length();i++){
                a[s1.charAt(i)-'a']++;
                a[s2.charAt(i)-'a']--;
            }
            boolean flag = true;
            for(int ele:a){
                if(ele != 0){
                    flag = false;
                    break;
                }
            }
            if(!flag)
                System.out.println("No");
            else
                System.out.println("Yes");
        }
    }
}
