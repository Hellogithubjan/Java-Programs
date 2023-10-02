package Practice1;

//    2. Given a set of numbers like <10, 36, 54, 89, 12> we want to find sum of weights based on the
//            following conditions
//            1. 5 if a perfect square
//            2. 4 if multiple of 4 and divisible by 6
//            3. 3 if even number
//            And sort the numbers based on the weight and print it as follows
//                <10,its_weight>,<36,its weight><89,its weight>
//            Should display the numbers based on increasing order.


public class six {

    public static void sort(int num[],int wt[],int low,int high){
        if(low>=high)
            return;
        int s = low;
        int e = high;
        int m = s + (e - s)/2;
        int pivot = wt[m];
        while(s<=e){
            while(wt[s]<pivot)
                s++;
            while(wt[e]>pivot)
                e--;
            if(s<=e){
                int t1 = wt[s];
                wt[s] = wt[e];
                wt[e] = t1;
                int t2 = num[s];
                num[s]=num[e];
                num[e] = t2;
                s++;
                e--;
            }
        }
        sort(num,wt,low,e);
        sort(num,wt,s,high);
    }

    public static void main(String[] args) {
        int num[] = {10,36,54,89,12};
        int weights[] = new int[num.length];
        for(int i=0;i<weights.length;i++){
            weights[i] = findWeight(num[i]);
        }
        System.out.println("Before Sorting:");
        for(int i=0;i<num.length;i++)
            System.out.print("< "+num[i]+" , "+weights[i]+" > ");
        sort(num,weights,0,num.length-1);
        System.out.println();
        System.out.println("After Sorting:");
        for(int i=0;i<num.length;i++)
            System.out.print("< "+num[i]+" , "+weights[i]+" > ");
    }

    private static int findWeight(int num) {
        int wt = 0;
        if(isPerfectSquare(num)){
            wt+=5;
        }
        if(num%4==0 && num%6==0)
            wt+=4;
        if(num % 2 == 0){
            wt+=3;
        }
        return wt;
    }

    private static boolean isPerfectSquare(int num) {
        boolean f = false;
        int n = (int)Math.sqrt(num);
        if(n*n == num)
            f = true;
        return f;
    }
}
