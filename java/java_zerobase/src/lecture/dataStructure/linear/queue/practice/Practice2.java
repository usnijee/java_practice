package lecture.dataStructure.linear.queue.practice;

// Practice2
// 요세푸스 문제
// N과 K가 주어졌을 때 (N, K) 요세푸스 순열을 구하시오.
// N과 K는 N >= K 를 만족하는 양의 정수이다.
// 1부터 N 번까지 N명이 순서대로 원을 이루어 모여 있다.
// 이 모임에서 원을 따라 순서대로 K번째 사람을 제외한다.
// 모든 사람이 제외될 때까지 반복하며 이 때, 제외되는 순서가 요세푸스 순열이다.

// 예시 입력
// 입력: N = 5, K = 2
// 결과: 2, 4, 1, 5, 3

// 입력: N = 7, K = 3
// 결과: 3, 6, 2, 7, 5, 1, 4


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.IntStream;

public class Practice2 {

    public static ArrayList getJosephusPermutation(int N, int K) {
        Queue<Integer> joseList = new LinkedList<>();
        ArrayList<Integer> results = new ArrayList<>();

//        for (int i = 1; i <= N; i++) {
//            joseList.offer(i);
//        }
        IntStream.range(1, N + 1).forEach(x -> joseList.offer(x));

        while (!joseList.isEmpty()) {
            makeAround(joseList, K);
            int outPerson = joseList.poll();
            results.add(outPerson);
        }

//        results.stream().forEach(x -> System.out.print(x + ","));
        return results;
    }

    private static void makeAround(Queue<Integer> joseList, int K) {
        int idx = 1;

        // K-1번째 까지는 다시 queue에서 제거 후 offer
        while (idx < K) {
            int first = joseList.poll();
            joseList.offer(first);
            idx++;
        }
    }

    public static void main(String[] args) {
        // Test code
        System.out.println(getJosephusPermutation(5, 2));
        System.out.println(getJosephusPermutation(7, 3));
    }
}
