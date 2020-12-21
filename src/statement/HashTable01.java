//https://ktko.tistory.com/entry/HashTable-Java%EB%A1%9C-%EA%B5%AC%ED%98%84%ED%95%98%EA%B8%B0

package statement;

import java.util.LinkedList;

public class HashTable01 {
    LinkedList<Node>[] data;

    public HashTable01(int size) {
        this.data = new LinkedList[size];
    }

    int getHashCode(String key) {
        int hashCode = 0;
        for (char c : key.toCharArray()) {
            hashCode += c;
        }
        return hashCode;
    }

    int convertToIndex(int hashCode) {
        return hashCode % data.length;
    }

    Node searchKey(LinkedList<Node> list, String key) {
        if(list == null) return null;

        for(Node node : list) {
            if(node.key.equals(key)) {
                return node;
            }
        }
        return null;
    }

    void put(String key, String value) {
        int hashCode = getHashCode(key);
        int index = convertToIndex(hashCode);

        LinkedList<Node> list = data[index];

        if(list == null) {
            list = new LinkedList<Node>();
            data[index] = list;
        }
        Node node = searchKey(list,key);

        if(node == null) {
            list.addLast(new Node(key, value));
        } else {
            node.setValue(value);
        }
    }

    public String get(String key) {
        int hashCode = getHashCode(key);
        int index = convertToIndex(hashCode);
        LinkedList<Node> list = data[index];
        Node node = searchKey(list, key);
        return node == null ? "Not found" : node.getValue();
    }

    class Node{
        String key;
        String value;

        public Node(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        HashTable01 ht = new HashTable01(3);
        ht.put("league", "he is pretty");
        ht.put("rwerr", "he is pretty1");
        ht.put("fwefwf", "he is pretty2");

        System.out.println(ht.get("league"));
        System.out.println(ht.get("rwerr"));
        System.out.println(ht.get("fwefwf"));

    }
}
