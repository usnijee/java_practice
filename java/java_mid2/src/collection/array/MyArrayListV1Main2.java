package collection.array;

public class MyArrayListV1Main2 {

    public static void main(String[] args) {
        MyArrayListV2 list = new MyArrayListV2();
        System.out.println("==데이터 추가==");
        System.out.println(list);
        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("c");
        System.out.println(list);

        System.out.println("==기능 사용==");
        System.out.println("list.size() = " + list.size());
        System.out.println("list.get(1) = " + list.get(1));
        System.out.println("list.indexOf('c') = " + list.indexOf("c"));
        System.out.println("list.set(2,'z') = " + list.set(2, "z"));
        System.out.println(list);

        System.out.println("==범위 초과==");
        list.add("d");
        System.out.println(list);
        list.add("e");
        System.out.println(list);

        //범위 초과 --> MyArrayListV2는 배열의 크기만큼 value가 채워지면 동일한 더 큰 크기의 배열을 복사하여 동적으로 크기를 조절할 수 있도록 수정
        list.add("f");
        System.out.println(list);
    }

}
