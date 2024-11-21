package lang.string.builder;
/*
    StringBuilder는 methodchanining을 제공한다.
 */
public class StringBuilderMain1_3 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
//        sb.append("A"); // 문자열에 추가
//        sb.append("B");
//        sb.append("C");
//        sb.append("D");
        String string = sb.append("A").append("B").append("C").append("D")
                .insert(4,"Java").delete(4,8).reverse().toString();
//        System.out.println("sb = " + sb);

//        sb.insert(4, "Java"); // 4번 인덱스에 문자열을 삽입
//        System.out.println("insert = " + sb);

//        sb.delete(4,8);
//        System.out.println("delete = " + sb);

//        sb.reverse();
//        System.out.println("reverse = " + sb);

        //StringBuilder -> String
//        String string = sb.toString();
        System.out.println("string = " + string);
    }
}
