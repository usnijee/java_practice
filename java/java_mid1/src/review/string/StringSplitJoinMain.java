package review.string;

public class StringSplitJoinMain {

    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        //split
        String[] splitStr = str.split(",");
        for (String s : splitStr) {
            System.out.println(s);
        }

        //join
        String joinedStr = String.join("-",splitStr); // 배열이와도 되고 각각의 문자가 와도 된다
        System.out.println(joinedStr);
    }
}
