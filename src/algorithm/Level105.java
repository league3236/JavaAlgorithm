// https://www.techiedelight.com/find-sub-array-with-0-sum/

package algorithm;

public class Level105 {
    public static void printallSubarrays(int[] A){
        for (int i = 0; i < A.length; i++) {
            int sum = 0;
            for (int j = i; j < A.length; j++) {
                sum += A[j];

                if(sum==-0){
                    System.out.println("Subarray [" + i + ".." + j +"]");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] A = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};
        printallSubarrays(A);
    }
}
