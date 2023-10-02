package Practice1;

public class FindCommonDifference {
    public static void main(String[] args) {
        int a[] = {8,20,11,5,17};
        int firstTerm = findMin(a);
        int lastTerm = findMax(a);
        int commonDifference = (lastTerm - firstTerm)/(a.length - 1);
        System.out.println(commonDifference);
    }

    private static int findMax(int[] a) {
        int max = a[0];
        for (int ele : a){
            if(ele > a[0])
                max = ele;
        }
        return max;
    }

    private static int findMin(int[] a) {
        int min = a[0];
        for (int ele : a){
            if(ele < a[0])
                min = ele;
        }
        return min;
    }
}
