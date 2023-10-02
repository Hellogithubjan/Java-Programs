package Practice1;

import java.util.HashMap;

public class SortAccordingToFrequency {
    public static void main(String[] args) {
        //Sort the array elements in descending order according to the frequency of occurrence
        int a[] = {2,2,3,4,5,12,2,3,3,3,12};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : a){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        int element[] = new int[map.size()];
        int frequency[] = new int[map.size()];
        int pos = 0;
        for(int ele:map.keySet()){
            element[pos] = ele;
            frequency[pos] = map.get(ele);
            pos++;
        }
        sort(element,frequency,element.length-1,0);
    }

    private static void sort(int[] e, int[] f, int high, int low) {
        if(high<=low){
            return;
        }
        int s = high;
        int e = low;
        int m = s + (e - s)/2;
        int pivot = f[m];
        while(s>=e){
            while(f[s]>=pivot)
                s--;

        }
    }
}
