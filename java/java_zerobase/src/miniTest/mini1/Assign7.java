package miniTest.mini1;

import java.util.*;

public class Assign7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int count = 6; // 뽑을 로또 번호 개수

        System.out.println("[로또 당첨 프로그램]");
        System.out.println();

        System.out.print("로또 개수를 입력해 주세요.(숫자 1 ~ 10):");
        int quantity = scanner.nextInt();
        int order = 0;
        List<Set<Integer>> myLotto = makeLotto(quantity, count, random);
        for (Set<Integer> lottoEach : myLotto) {
            char alphabet = (char) ('A' + order);
            StringBuilder result = new StringBuilder();
            for (Integer eachNum : lottoEach) {
                if (result.length() > 0) {
                    result.append(",");
                }
                result.append(eachNum);
            }
            System.out.printf("%-3c %s \n",alphabet,result.toString());
            order++;
        }

        Set<Integer> winningNumbers = makeWinningNumbers(count, random);

    }

    // quantity만큼의 로또 라인 생성 함수
    private static List<Set<Integer>> makeLotto(int quantity, int count, Random random) {
        List<Set<Integer>> lottoPaper = new ArrayList<>();

        for (int i = 0; i < quantity; i++) { // quantity만큼 로또 줄 생성
            Set<Integer> lottoEachLine = new HashSet<>();
            while (lottoEachLine.size() < count) {
                int num = random.nextInt(1, 46);
                lottoEachLine.add(num); // 로또 번호 생성
            }
            lottoPaper.add(lottoEachLine);
        }
        return lottoPaper;
    }
    private static Set<Integer> makeWinningNumbers(int count, Random random) {
        Set<Integer> winningNums = new HashSet<>();
        while (winningNums.size() < count) {
            int num = random.nextInt(1, 46);
            winningNums.add(num);
        }
        return winningNums;
    }
}
