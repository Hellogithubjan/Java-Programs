package ZohoSet3;

//    9.Print the vowels count in the given String.
//            Input: India
//            Output:
//            a : 1
//            e : 0
//            i : 2
//            o : 0
//            u : 0

public class CountVowel {
    public static void main(String[] args) {
        int a[] = new int[5];
        String s = "India";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            switch(c){
                case 'A':
                case 'a':
                    a[0]++;
                    break;
                case 'E':
                case 'e':
                    a[1]++;
                    break;
                case 'I':
                case 'i':
                    a[2]++;
                    break;
                case 'O':
                case 'o':
                    a[3]++;
                    break;
                case 'U':
                case 'u':
                    a[4]++;
                    break;
            }
        }
        String vowels = "aeiou";
        for(int i=0;i<5;i++){
            System.out.println(vowels.charAt(i)+" : "+a[i]);
        }
    }
}
