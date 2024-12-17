package collection.list;

public class BatchProcessorMain {

    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        MyLinkedList<Integer> list2 = new MyLinkedList<>();

        BatchProcessor processor1 = new BatchProcessor(list);
        processor1.logic(50_000); // 1.2초

        BatchProcessor processor2 = new BatchProcessor(list2);
        processor2.logic(50_000); // 0.002초

    }
}
