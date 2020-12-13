package algorithm;

import java.util.HashSet;

public class Level104 {
    public static Boolean zeroSumSubarray(int[] A)
    {
        HashSet<Integer> set = new HashSet<>();

        int sum = 0;
        for (int value:
             A) {
            sum += value;
            if (set.contains(sum)){
                return true;
            }
            set.add(sum);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] A = { 4, -6, 3, -1, 4, 2, 7 };

        if (zeroSumSubarray(A)) {
            System.out.println("Subarray exits");
        } else {
            System.out.println("Subarray do not exist");
        }
    }
}
