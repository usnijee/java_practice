package dataStructure.linear.linkedList.practice.P4;

// Practice4
// 연결 리스트 배열 사용 연습

// 주어진 문자열 배열을 연결 리스트 배열로 관리하는 코드를 작성하시오.
// 관리 규칙은 다음과 같다.
// 각 문자열의 첫 글자가 같은 것끼리 같은 연결 리스트로 관리하기


import java.util.Set;
import java.util.TreeSet;

class Node {
    String data;
    Node next;

    Node() {}
    Node(String data, Node next) {
        this.data = data;
        this.next = next;
    }
}

class LinkedList {
    Node head;
    char alphabet;

    LinkedList() {}
    LinkedList(Node node, char alphabet) {
        this.head = node;
        this.alphabet = alphabet;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public void addData(String data) {
        if (this.head == null) {
            this.head = new Node(data, null);
        } else {
            Node cur = this.head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = new Node(data, null);
        }
    }

    public void removeData(int data) {
        if (this.isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        Node cur = this.head;
        Node pre = cur;
        while (cur != null) {
            if (cur.data.equals(data)) {
                if (cur == this.head) {
                    this.head = cur.next;
                } else {
                    pre.next = cur.next;
                }
                break;
            }

            pre = cur;
            cur = cur.next;
        }
    }

    public boolean findData(int data) {
        if (this.isEmpty()) {
            System.out.println("List is empty");
            return false;
        }

        Node cur = this.head;
        while (cur != null) {
            if (cur.data.equals(data)) {
                System.out.println("Data exist!");
                return true;
            }
            cur = cur.next;
        }
        System.out.println("Data not found!");
        return false;
    }

    public void showData() {
        if (this.isEmpty()) {
            System.out.println("List is empty!");
            return;
        }

        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }
}

public class Practice4 {

    public static void dataCollect(String[] data) {
        Set<Character> set = new TreeSet<>(); // 알파벳을 중복하지 않고 저장하기 위함 또한 알파벳 오름차순 정리

        for (String item : data) {
            set.add(item.toCharArray()[0]);
        }

        Character[] arr = set.toArray(new Character[0]);
        LinkedList[] linkedLists = new LinkedList[set.size()]; // 이 생각을 못했다....
        for (int i = 0; i < linkedLists.length; i++) {
            linkedLists[i] = new LinkedList(null, arr[i]); // LinkedList를 alphabet별로 분리 저장
        }

        for (String item : data) {
            for (LinkedList list : linkedLists) {
                if (list.alphabet == item.toCharArray()[0]) {
                    list.addData(item);
                }
            }
        }

        for (LinkedList list : linkedLists) {
            System.out.print(list.alphabet + " : ");
            list.showData();
        }

    }

    public static void main(String[] args) {
        // Test code
        String[] input = {"apple", "watermelon", "banana", "apricot", "kiwi", "blueberry", "cherry", "orange"};
        dataCollect(input);

        System.out.println();
        String[] input2 = {"ant", "kangaroo", "dog", "cat", "alligator", "duck", "crab", "kitten", "anaconda", "chicken"};
        dataCollect(input2);

    }
}

