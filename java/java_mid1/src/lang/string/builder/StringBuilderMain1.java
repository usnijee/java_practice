package lang.string.builder;
/*
    StringBuilder : 가변 문자열

    불변 객체인 String의 단점은 문자를 더하거나 변경할 때 마다 계속해서 새로운 객체를 생성해야 한다는 점이다.
    문자를 자주 더하거나 변경할 시 -> 더 많은 String 객체를 만들어야하고, GC해야한다. 즉, CPU와 메모리를 많이 소모한다.

    StringBuilder는 가변 String이기에 이를 해결할 수 있다.
    하지만, 가변이기에 사이드 이펙트에 주의해서 사용해야한다.

    따라서, StringBuilder 는 보통 문자열을 변경하는 동안만 사용하다가 문자열 변경이 끝나면 안전한(불변) String 으로 변환하는 것이 좋다.

 */
public class StringBuilderMain1 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("A"); // 문자열에 추가
        sb.append("B");
        sb.append("C");
        sb.append("D");
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
