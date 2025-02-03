package lecture.dataStructure.nonLinear.pQueue;// Practice 2
// 문자열 사전식 오름차순

import java.util.PriorityQueue;

class Person2 {
    String name;
    int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Practice2 {
    public static void solution(String[] name, int[] age) {
        PriorityQueue<Person2> pq = new PriorityQueue<>((Person2 p1, Person2 p2) -> p1.name.compareTo(p2.name));
        // (Person2 p1, Person2 p2) -> p2.name.compareTo(p1.name)이 되면 내림차순이 됨

        for (int i = 0; i < name.length; i++) {
            pq.offer(new Person2(name[i], age[i]));
        }

        while (!pq.isEmpty()) {
            Person2 p = pq.poll();
            System.out.println(p.name + " " + p.age);
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Person2> pq = new PriorityQueue<>((Person2 p1, Person2 p2) -> p1.name.compareTo(p2.name));

        String[] name = {"A", "B", "C", "D", "E"};
        int[] age = {30, 20, 45, 62, 35};

        solution(name, age);
    }
}
