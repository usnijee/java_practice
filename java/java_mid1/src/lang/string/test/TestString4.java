package lang.string.test;

public class TestString4 {

    public static void main(String[] args) {
        String arr = "hello.txt";
        String filename = arr.substring(0,5); // java의 인덱스 범위도 이상~미만이다
        String extName = arr.substring(5,9);
        System.out.println("filename = " + filename);
        System.out.println("extName = " + extName);
    }
}
