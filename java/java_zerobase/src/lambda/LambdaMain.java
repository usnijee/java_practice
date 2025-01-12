package lambda;
// Java 프로그래밍 - 람다식

interface ComputeTool {
    public abstract int compute(int x, int y);

//    public abstract int compute2(int x, int y);
}

public class LambdaMain {

    public static void main(String[] args) {

        // 익명 클래스
        ComputeTool cTool1 = new ComputeTool() {
            @Override
            public int compute(int x, int y) {
                return x + y;
            }
        };

        System.out.println(cTool1.compute(1, 2));

        // 람다식 (익명 함수)
        ComputeTool cTool2 = (x,y) -> {return x + y;}; // 람다식 -> 하나의 추상 메서드를 갖는 인터페이스를 간편하게 람다식으로 표현 가능
        System.out.println(cTool2.compute(1,2));
    }
}
