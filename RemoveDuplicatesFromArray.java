// Remove Duplicate Elements From Array

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] inputArr = {1, 2, 2, 3, 3, 4, 5};
        int[] resultArr = removeDuplicates(inputArr);
        
        System.out.println("Input : " + Arrays.toString(inputArr));
        System.out.println("Output : " + Arrays.toString(resultArr));
    }
    
    public static int[] removeDuplicates(int[] arr) {
        Set<Integer> st = new HashSet<>();
        for (int num : arr) {
            st.add(num);
        }
        
        int[] result = new int[st.size()];
        int index = 0;
        for (int num : st) {
            result[index++] = num;
        }
        
        return result;
    }
}
