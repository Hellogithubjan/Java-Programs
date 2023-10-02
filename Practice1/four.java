package Practice1;

//    5. TO FIND INDEX OF HIGHEST NEGATIVE ELEMENT IN ARRAY
//            INPUT: 1 -2 3 4 -5
//            OUTPUT:1


public class four {
    public static void main(String[] args) {
        int a[] = {1,-2,3,4,-5};
        int index = -1;
        int max = Integer.MIN_VALUE;
        for(int ele : a){
            if(ele < 0) {
                max = Math.max(max, ele);
            }
        }
        for(int i=0;i<a.length;i++){
            if(a[i] == max){
                index = i;
                break;
            }
        }
        System.out.println("Index : "+index);
    }
}
