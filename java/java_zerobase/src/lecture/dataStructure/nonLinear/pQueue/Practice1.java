package lecture.dataStructure.nonLinear.pQueue;// Practice 1
// 자바 기본 PriorityQueue 응용
// 나이 순으로 오름차순 또는 내림차순 출력
/**
 * 우선순위 큐에 특정 객체를 사용할 것이면 비교가능한(comparable) 객체이어야 한다
 * 비교가능한 객체는
 * -> Comparable 인터페이스를 구현해야하며 오버라이딩을 통해 비교 기준을 설정해야한다
 */

import java.util.PriorityQueue;

class Person implements Comparable<Person>{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        // 1: 변경 x
        // -1 : 변경 함

        // 새롭게 추가한 Person o와 this를 비교해서 age가 더 크면 바꾸도록 함
        return this.age >= o.age ? 1 : -1; // o.age가 기존에 존재하던 객체를 의미 -> 오름차순
//        return this.age >= o.age ? -1 : 1;; // 내림 차순
    }
}

public class Practice1 {
    public static void solution(String[] name, int[] age) {
        PriorityQueue<Person> pq = new PriorityQueue<>();

        for (int i = 0; i < name.length; i++) {
            pq.offer(new Person(name[i], age[i]));
        }

        System.out.println("== 실제 출력 순서 ==");
        while (!pq.isEmpty()) {
            Person p = pq.poll();
            System.out.println(p.name + " " + p.age);
        }

    }

    public static void main(String[] args) {
        String[] name = {"A", "B", "C", "D", "E"};
        int[] age = {30, 20, 45, 62, 35};

        solution(name, age);
    }
}
