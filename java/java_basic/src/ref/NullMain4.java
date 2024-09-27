package ref;
/*
    NullMain3 해결하기
 */
public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data(); // 객체를 선언하여 null에서 벗어남
        System.out.println("bigData.count=" + bigData.count);
        System.out.println("bigData.data=" + bigData.data); // null
        System.out.println("bigData.data.value = " + bigData.data.value);
    }
}
