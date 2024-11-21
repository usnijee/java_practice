package lang.string.test;

public class TestString1 {

    public static void main(String[] args) {
        String url = "https://www.example.com";
        boolean result = url.startsWith("https://");
        System.out.println("url이 http://로 시작하는가? : " + result);
    }
}
