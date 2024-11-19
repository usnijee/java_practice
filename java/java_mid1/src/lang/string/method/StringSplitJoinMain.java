package lang.string.method;

public class StringSplitJoinMain {

    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        //split("a") : a 구분자를 기준으로 생성된 대상을 원소로 갖는 배열 형성
        String[] splitStr = str.split(",");
        for (String s : splitStr) {
            System.out.println(s);
        }

        //join()을 쓰지않고 결합하는 경우 -> 매우 복잡
        String joinStr = "";
        for (int i = 0 ; i < splitStr.length ; i++) {
            String string = splitStr[i];
            joinStr += string;
            if (i != splitStr.length-1) {
                joinStr += "-";
            }
        }
        System.out.println("joinStr = " + joinStr);

        //join()
        String result = String.join("-", splitStr);
        System.out.println("result = " + result);

    }
}
