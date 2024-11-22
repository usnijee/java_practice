package lang.math.test;

import java.util.Random;

/*
    로또 번호를 자동으로 만들어주는 자동 생성기를 만들자
    로또 번호는 1~45 사이의 숫자를 6개 뽑아야 한다.
    각 숫자는 중복되면 안된다.
    실행할 때 마다 결과가 달라야 한다.
 */
public class LottoGenerator {

    private static final int COUNTLIMIT = 6;
    private static final int LOTTOLIMIT = 44;
    private final Random random = new Random();
    private int[] lottoArray;
    private int count;


    public int[] generator() {
        lottoArray = new int[6];
        count = 0;
        while (count < COUNTLIMIT) {
            int lottoNum = random.nextInt(LOTTOLIMIT)+1;
            if (reChoice(lottoNum)) {
                lottoArray[count] = lottoNum;
                count ++;
            }
        }
        return lottoArray;
    }

    private boolean reChoice(int lottoNum) {
        for (int i = 0 ; i < count; i++) {
            if (lottoArray[i] == lottoNum) {
                return false;
            }
        }
        return true;
    }

}
