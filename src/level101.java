import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class level101 {
    public static void main(String[] args) {
        int[] numArr1 = {2,1,3,4,1};
        level101 solution = new level101();
        System.out.println(solution.solution(numArr1));

    }
    public int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<numbers.length; i++){
            for (int j=i; j<numbers.length; j++){
                int var = numbers[i] + numbers[j];
                if(list.indexOf(var) < 0){ // var 값이 list에 없으면 -1 반환
                    list.add(var);
                }
            }
        }

        int[] answer = new int[list.size()];
        for (int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        System.out.println(answer);
        Arrays.sort(answer);
        System.out.println(answer);

        return answer;
    }
}
