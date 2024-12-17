package collection.list;
/**
 *  MyArrayList를 통해 많은 데이터를 처리하는 BatchProcessor 클래스
 *
 *  개발 프로세스를 진행하다보니 데이터를 앞에서 추가하는 일이 빈도가 높음 -> Array의 경우 O(n)으로 성능이 좋지않음 -> LinkedList 사용
 *
 *  그러면 단순히 private final MyArrayList<Integer> list = new MyArrayList<>(); 이 부분을 ArrayList로 바꿔주면 될까?
 *  그러다가 개발 프로세스가 다시 바뀌면 또 BatchProcessor의 코드를 바꿔주어야한다 -> 비효율적
 *
 *  이럴때 구체적인 클래스에 의존하는 것이 아닌 추상적인 것에 의존해야한다. (다형적 참조 - 부모는 자식을 품을수있다)
 */
public class BatchProcessor {

//    private final MyArrayList<Integer> list = new MyArrayList<>();
    private final MyList<Integer> list;

    public BatchProcessor(MyList<Integer> list) {
        this.list = list;
    }

    public void logic(int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }
}
