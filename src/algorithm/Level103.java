package algorithm;

public class Level103 {
   public static void findPair(int[] A, int sum){
       for (int i = 0; i < A.length; i++) {
           for (int j = i + 1; j < A.length ; j++) {
               if(A[i] + A[j] == sum){
                   System.out.println("Pair found at index "+ i+ " and " + j );
                   return;
               }
           }
       }
       System.out.println("Pair not found");
   }

    public static void main(String[] args) {
        int[] A = { 8, 7, 2, 5, 3, 1};
        int sum = 10;

        findPair(A, sum);
    }

}
