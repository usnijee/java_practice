package lecture.java.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Stream
 *  - 배열, 컬렉션 등의 데이터를 하나씩 참조하여 처리 가능한 기능
 *  - for문의 사용을 줄여 코드를 간결하게 함
 *  - 구성
 *          - lecture.java.stream 생성
 *          - 중간 연산 (가공 단계)
 *          - 최종 연산 (결과 도출)
 */
public class StreamMain2 {

    public static void main(String[] args) {

        // 1. Stream 생성

        // 배열 스트림
        System.out.println("== 배열 스트림==");

        String[] arr = new String[]{"a", "b", "c"};

        // 1-1. 일반 fori
        System.out.println("=== fori ===");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // 1-2. 배열 스트림 활용
        System.out.println("=== to Stream ===");
        Stream stream1 = Arrays.stream(arr);
        stream1.forEach(num -> System.out.print(num + " "));
        System.out.println();

        // 컬렉션 스트림
        System.out.println("== 컬렉션 스트림==");

        List list1 = new ArrayList(Arrays.asList(1, 2, 3));
        System.out.println("list1 = " + list1);

        System.out.println("=== to Stream ===");
        Stream stream2 = list1.stream();
        stream2.forEach(num -> System.out.print(num + " "));
        System.out.println();

        // 1-3. 스트림 builder
        // 배열 스트림과 컬렉션 스트림은 요소를 일단 자료구조에 add하고 그 자료구조를 stream으로 변환한 것
        // 스트림 builder를 통해 스트림을 직접 구성할 수 있음
        // 여러 개의 개별 요소를 추가하여 스트림을 수동으로 생성할 수 있음
        // 비정형적인 데이터 처리 흐름에서 사용 가능
        System.out.println("== 스트림 builder ==");
        Stream streamBuilder = Stream.builder().add("a").add("b").add("c").build();
        streamBuilder.forEach(System.out::print);

        // 1-4. 스트림 generate
        // 특정 값을 무한 생성하는 스트림을 만드는데 사용
        // 여기서 특정 값이라는 것은 단일값일수도 있고 랜덤값일수도 있다
        // Stream.generate(생성 대상).limit(생성 개수)
        // limit(a) : 생성 개수를 지정
        System.out.println("== 스트림 generate ==");
        Stream streamGenerate = Stream.generate(() -> "abc").limit(3);
        streamGenerate.forEach(a -> System.out.print(a + " "));
        System.out.println();

        // 1-5. 스트림 iterate
        // 반복적인 패턴의 스트림을 생성하는 데 사용
        // 초기값과 함수(또는 조건)을 기반으로 무한 또는 유한 스트림을 생성
        // generate와의 차이점은 무엇?
        // geberate()는 매개변수로 복잡한 함수를 받기에는 한계가 있다 (초기값을 모르기 때문 + 함수형 인터페이스 supplier 타입)
        // 더욱 복잡한 함수를 표현할땐 iterate를 사용하여 stream을 생성하자
        System.out.println("== 스트림 iterate ==");
        Stream streamIterate = Stream.iterate(10, n -> n * 2).limit(3);
        streamIterate.forEach(element -> System.out.print(element + " "));
        System.out.println();

        // 1-6. 기본 타입 스크림
        // Integer, Double같은 래퍼타입은 IntStream, DoubleStream 같이 기본 타입 스트림을 제공한다
        IntStream intStream = IntStream.range(1, 5);
        intStream.forEach(element -> System.out.print(element + " "));
        System.out.println();


        //2. 스트림 중간 연산

        // 2-1. Filtering
        // 특정 조건에 맞는 부분만 출력
        System.out.println("== Filtering ==");
        IntStream intStream2 = IntStream.range(1, 10).filter(n -> n % 2 == 0); // 짝수인것만 filtering
        intStream2.forEach(element -> System.out.print(element + " "));
        System.out.println();

        // 2-2. Mapping
        // 모든 요소를 map(a)의 a에 해당하는 로직에 매핑
        System.out.println("== Mapping ==");
        IntStream intStream3 = IntStream.range(1, 11).map(n -> n * 2);
        intStream3.forEach(element -> System.out.print(element + " "));
        System.out.println();

        // 2-3. Sorting
        // 모든 요소를 정렬시킴
        System.out.println("== Sorting ==");
        IntStream intStream4 = IntStream.builder().add(1).add(7).add(5).add(3).build();
        IntStream intStreamSorted = intStream4.sorted();
        intStreamSorted.forEach(element -> System.out.print(element + " "));
        System.out.println();

        //3. 최종 연산

        // 3-1. Sum, Average
        System.out.println("== Sum,Average ==");
        int sum = IntStream.range(1, 5).sum();
        System.out.println("sum = " + sum);

        double average = IntStream.range(1, 5).average().getAsDouble();
        System.out.println("average = " + average);

        // 3-2. Min, Max
        System.out.println("== min, max ==");

        int min = IntStream.range(1, 6).min().getAsInt();
        int max = IntStream.range(1, 6).max().getAsInt();
        System.out.println("min = " + min);
        System.out.println("max = " + max);

        //3-3. reduce
        System.out.println("== reduce ==");

        Stream<Integer> stream3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)).stream();
        System.out.println(stream3.reduce((x,y) -> x + y).get());


    }
}
