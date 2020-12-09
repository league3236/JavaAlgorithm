// https://coding-factory.tistory.com/555


// TreeSet은 이진탐색트리 구조로 이루어져있음, 이진 탐색 트리는 추가와 삭제에는 시간이 조금 더 걸리지만
// 정렬, 검색에 높은 성능을 보이는 자료구조, HashSet보다 데이터의 추가와 삭제는 시간이 더 걸리지만 검색과 정렬에는 유리
// TreeSet은 이진탐색트리 중에서도 성능을 향상시킨 red-black tree로 구성되어있음
// 부모노드보다 작은 값을 가지는 노드는 왼쪽 자식으로, 큰 값을 가지는 노드는 오른쪽 자식으로 배치하여 데이터의 추가나 삭제시 트리가 한쪽으로 치우쳐지지 않도록 균형을 맞추어줌

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet01 {

    TreeSet<Integer> set1 = new TreeSet<Integer>();
    TreeSet<Integer> set2 = new TreeSet<>();
    // set1의 모든 값을 가진 ThreeSet 선언
    TreeSet<Integer> set3 = new TreeSet<Integer>(set1);
    TreeSet<Integer> set4 = new TreeSet<>();


    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<Integer>(); //TreeSet 생성

        set.add(7);
        set.add(4);
        set.add(9);
        set.add(1);
        set.add(5);

        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }


}
