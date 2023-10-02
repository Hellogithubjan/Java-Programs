package Practice1;

//3.TO PRINT ODD ELEMENTS IN A ARRAY FIRST FOLLOWED BY EVEN ELEMENTS

public class three {
    public static void main(String[] args) {
        int a[] = {12, 34, 45, 9, 8, 90, 3};
        int i=0,j=a.length-1;
        while(i<j){
            while(a[i]%2==1 && i<j)
                i++;
            while(a[j]%2==0 && i<j)
                j--;
            if(i<j){
                int tmp = a[i];
                a[i] = a[j];
                a[j] =tmp;
                i++;
                j--;
            }
        }

        for(int ele : a){
            System.out.print(ele+" ");
        }
    }
}
