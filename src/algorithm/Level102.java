package algorithm;

import java.util.HashSet;
import java.util.Set;

public class Level102 {
    public static void main(String[] args) {
        Level102 sol = new Level102();
        System.out.println(sol.solution(new int[] {2,1, 3, 4, 1}));
    }
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        int[] answer = numbers;
        for(int i = 0; i<numbers.length; i++) {
            for (int j = i+1; j <numbers.length ; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        return answer;
    }
}
