package lang.string.test;

public class TestString5 {

    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        int extIndex = str.indexOf(ext);

        System.out.println("filename = " + str.substring(0,extIndex));
        System.out.println("extName = " + str.substring(extIndex)); // substring은 begin index만 넣으면 자동으로 end index는 문자열 끝으로 고정
    }
}
