package cond;
// 삼항 연산자
public class CondOp2 {
    public static void main(String[] args) {
        int age = 18;
        String status = (age >= 18) ? "성인":"미성년자";
        String status2 = true ? "성인":"미셩년자";
        // 쉽게 생각하는 법
        // (조건)?a:b ==> (조건)이 맞냐 ? 맞으면a:틀리면b
        System.out.println(status);
        System.out.println(status2);
    }
}
