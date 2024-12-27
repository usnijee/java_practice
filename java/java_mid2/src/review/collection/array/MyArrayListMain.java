package review.collection.array;

public class MyArrayListMain {

    public static void main(String[] args) {
        MyArrayListRe1 arrayList = new MyArrayListRe1(10);

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(2,4);
        System.out.println(arrayList);

        arrayList.remove(1);
        System.out.println(arrayList);

    }
}
