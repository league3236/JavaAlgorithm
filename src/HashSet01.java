//https://m.blog.naver.com/PostView.nhn?blogId=heartflow89&logNo=220994601249&proxyReferer=https:%2F%2Fwww.google.com%2F

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet01 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("one");
        set.add("2");
        set.add("4");
        set.add("5");
        set.add("5");
        set.add("2");
        set.add("1");

        System.out.println("저장된 데이터 수 : " + set.size());

        //Iterator

        Iterator<String> it = set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("-------------------");

        set.remove("5");
        System.out.println("저장된 데이터 수 : " +set.size()); // 저장된 데이터 수 출력

        it = set.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("-------------------");

    }
}
