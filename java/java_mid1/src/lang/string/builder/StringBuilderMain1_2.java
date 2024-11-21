package lang.string.builder;

public class StringBuilderMain1_2 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
//        sb.append("A"); // 문자열에 추가
//        sb.append("B");
//        sb.append("C");
//        sb.append("D");
        sb.append("A").append("B").append("C").append("D"); // StringBuilder의 메서드 체이닝 !
        System.out.println("sb = " + sb);

        sb.insert(4, "Java"); // 4번 인덱스에 문자열을 삽입
        System.out.println("insert = " + sb);

        sb.delete(4,8);
        System.out.println("delete = " + sb);

        sb.reverse();
        System.out.println("reverse = " + sb);

        //StringBuilder -> String
        String string = sb.toString();
        System.out.println("string = " + string);
    }
}
