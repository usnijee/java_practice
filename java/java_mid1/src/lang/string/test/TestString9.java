package lang.string.test;

public class TestString9 {

    public static void main(String[] args) {
        String email = "hello@example.com";
        String[] emails = email.split("@");
        System.out.println("ID: " + emails[0]);
        System.out.println("Domain: " + emails[1]);
    }
}
