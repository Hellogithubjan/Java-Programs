package zoho;
import java.util.*;
//Given a set of numbers like <10, 36, 54,89,12> we want to find sum of weights based on the
//        following conditions
//        1. 5 if a perfect square
//        2. 4 if multiple of 4 and divisible by 6
//        3. 3 if even number
//        And sort the numbers based on the weight and print it as follows
//<10,its_weight>,<36,its weight><89,its weight>
//        Should display the numbers based on increasing order.
class NumberWeight implements Comparable<NumberWeight> {
    int number;
    int weight;

    public NumberWeight(int number, int weight) {
        this.number = number;
        this.weight = weight;
    }

    @Override
    public int compareTo(NumberWeight other) {
        return Integer.compare(this.weight, other.weight);
    }
}

public class SumWeights {
    public static void main(String[] args) {
        System.out.println("Enter n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter array elements:");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }


    }
}
