package lang.math.test;

public class LottoMain {

    public static void main(String[] args) {
        LottoGenerator lottoGenerator = new LottoGenerator();
        int[] lottoList = lottoGenerator.generator();

        System.out.print("로또 번호: ");
        for (int lotto : lottoList) {
            System.out.print(lotto + " ");
        }
    }
}
