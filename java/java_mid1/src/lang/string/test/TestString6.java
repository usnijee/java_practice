package lang.string.test;

public class TestString6 {

    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int count = 0;
        int keyIndex = str.indexOf(key);

        while (keyIndex >= 0) {
            keyIndex = str.indexOf(key,keyIndex+1);
            count ++;
        }
        System.out.println("count = " + count);

    }
}
