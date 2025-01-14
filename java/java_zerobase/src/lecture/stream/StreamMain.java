package lecture.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMain {

    public static void main(String[] args) {

//      1. 스트림 생성

//      1-1. 배열 스트림
        System.out.println("== 배열 스트림 == ");
        String[] arr = new String[]{"a", "b", "c"};

        System.out.println("== fori ==");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("== forEach ==");
        for (String item: arr) {
            System.out.println(item);
        }

        System.out.println("== to Stream ==");
        Stream stream1 = Arrays.stream(arr);
        stream1.forEach(System.out::println);
        /**
         * (A::B)
         * 메서드 참조를 나타내는 구문
         *
         * 1. A : 참조 주체 (메서드가 정의된 클래스, 객체를 의미)
         * 2. (::) : 메서드 참조 연산자 -> 메서드나 생성자를 함수형 인터페이스의 구현으로 연결
         * 3. B : 참조 하려는 대상
         */

//      1-2. 컬렉션 스트림
        System.out.println("== 컬렉션 스트림 ==");
        ArrayList list1 = new ArrayList(Arrays.asList(1, 2, 3));
        System.out.println("list1 = " + list1);

        System.out.println("== to Stream ==");
        Stream stream2 = list1.stream();
//        stream2.forEach(System.out::println); // 메서드 참조를 이용한 방법
        stream2.forEach(num -> System.out.println("num = " + num)); // 람다식을 활용한 방법


//      1-3. 스트림 builder
        //Java Stream API에서 스트림을 직접 구성하기 위한 클래스
        // 여러 개의 개별 요소를 추가하여 스트림을 수동으로 생성할 수 있음
        // 비정형적인 데이터 처리 흐름에서 스트림 사용 가능.
        System.out.println("== 스트림 builder ==");
        Stream streamBuilder = Stream.builder().add(1).add(2).add(3).build(); // 유저가 개별요소를 add를 통해 추가할 수 있음
        streamBuilder.forEach(System.out::println);


//      1-4. 스트림 generate
        // 특정 값을 생성하는 무한 스트림을 만드는데 사용 -> 특정 값이라는 것이 단일값일수도 있고 랜덤값일수도 있음
        // limit(a) : 생성 개수를 지정, a개 생성
        System.out.println("== 스트림 generate ==");
        Stream streamGenerate = Stream.generate(() -> "abc").limit(3); // 람다식을 활용할때 () -> "a" 는 매개변수 없이 "a"를 반환하겠다는 의미
        streamGenerate.forEach(System.out::println);

        Random random = new Random();
//        Stream randomStream = Stream.generate(random::nextDouble).limit(5);
        Stream randomStream = Stream.generate(() -> random.nextDouble()).limit(5); // 람다식을 활용한 경우
        randomStream.forEach(System.out::println);


//      1-5. 스트림 iterate
        // 반복적인 패턴의 스트림을 생성하는 데 사용
        // 초기값과 함수(또는 조건)를 기반으로 무한 또는 유한 스트림을 생성
        // iterate(초기값, 이전 값을 입력으로 받아 새로운 값을 생성하는 함수).limit(개수)
        System.out.println("== 스트림 iterate ==");
        Stream streamIterate = Stream.iterate(10, n -> n * 2).limit(3);
        streamIterate.forEach(System.out::println);



//      1-6. 기본 타입 스트림
        System.out.println("== 기본타입 스트림 ==");
        IntStream intStream = IntStream.range(1, 5); // 끝값을 포함하고 싶으면 rangeclose 사용
        intStream.forEach(System.out::println);

//      2. 스트림 중개 연산


//      2-1. Filtering
        // filtering은 특정 조건에 맞는 부분만 출력
        System.out.println("== Filtering ==");
        IntStream intStream2 = IntStream.range(1, 10).filter(n -> n % 2 == 0);
        intStream2.forEach(System.out::println);


//      2-2. Mapping
        // mapping은 모든 원소를 map(a)의 a에 해당하는 로직에 매핑한 결과
        System.out.println("== Mapping ==");
        IntStream intStream3 = IntStream.range(1, 10).map(n -> n + 1);
        intStream3.forEach(n -> System.out.print(n + " "));
        System.out.println();


//      2-3. Sorting
        // 정렬 시킴
        System.out.println("== Sorting ==");
        IntStream intStream4 = IntStream.builder().add(5).add(1).add(3).add(4).add(2).build();
        IntStream intStreamSort = intStream4.sorted();
        intStreamSort.forEach(System.out::println);


//      3. 최종 연산

//      3-1. Sum, Average
        System.out.println("== sum, average ==");
        int sum = IntStream.range(1, 5).sum();
        System.out.println("sum = " + sum);

        double average = IntStream.range(1, 5).average().getAsDouble();
        System.out.println("average = " + average);

//      3-2. Min, Max
        System.out.println("== min, max ==");

        int min = IntStream.range(1, 5).min().getAsInt();
        int max = IntStream.range(1, 5).max().getAsInt();
        System.out.println("min = " + min);
        System.out.println("max = " + max);

//      3-3. reduce
        System.out.println("== reduce ==");

        Stream<Integer> stream3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)).stream();
        System.out.println(stream3.reduce((x,y) -> x + y).get());


//      3-4. forEach
        System.out.println("== forEach == ");
        IntStream.range(1,10).filter(n -> n == 5).forEach(System.out::println);

    }
}
