package algorithm;//https://programmers.co.kr/learn/courses/30/lessons/68644/solution_groups?language=java

import java.util.ArrayList;
import java.util.Arrays;

public class Level101 {
    public static void main(String[] args) {
        int[] numArr1 = {2,1,3,4,1};
        Level101 solution = new Level101();
        System.out.println(Arrays.toString(solution.solution(numArr1)));

    }
    public int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<numbers.length; i++){
            for (int j=i; j<numbers.length; j++){
                int var = numbers[i] + numbers[j];
                if(list.indexOf(var) < 0 && i!=j){ // var 값이 list에 없으면 -1 반환
                    list.add(var);
                }
            }
        }

        int[] answer = new int[list.size()];
        for (int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
//        System.out.println(Arrays.toString(answer));   // array 한번에 출력

        return answer;
    }
}
