package scanner.ex;

public class ChangeVarEx {
    public static void main(String[] args) {

        int a = 10, b = 20;
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        // temp라는 변수를 사용할 수 밖에 없는 이유
        // 코드는 순차적으로 compile되는데 a=b;가 되는 순간 본래의 a의 값은 b의 값으로 바뀌어져 있기에
        // 그 다음의 b=a;는 b=b;가 된다. 따라서 a의 값을 중간 저장할 공간인 temp가 필요

    }
}
