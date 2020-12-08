import java.util.HashSet;
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

        // iterator

    }
}
