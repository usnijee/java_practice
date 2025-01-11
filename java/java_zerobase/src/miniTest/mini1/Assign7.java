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
        displayMyLotto(quantity, count, random);

        System.out.println("[로또 발표]");
        Set<Integer> winningNumbers = makeWinningNumbers(count, random);

    }

    private static void displayMyLotto(int quantity, int count, Random random) {
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
            System.out.printf("%-3c %s \n", alphabet, result.toString());
            System.out.println();
            order++;
        }
    }

    // quantity만큼의 로또 라인 생성 함수
    private static List<Set<Integer>> makeLotto(int quantity, int count, Random random) {
        List<Set<Integer>> lottoPaper = new ArrayList<>(); // 여러 로또 라인을 하나의 로또 종이안에 구현하기 위함

        for (int i = 0; i < quantity; i++) {
            Set<Integer> lottoEachLine = getRandomNums(count, random);
            lottoPaper.add(lottoEachLine);
        }
        return lottoPaper;
    }

    private static Set<Integer> makeWinningNumbers(int count, Random random) {
        Set<Integer> winningNums = getRandomNums(count, random);
        return winningNums;
    }

    private static Set<Integer> getRandomNums(int count, Random random) {
        Set<Integer> lottoEachLine = new HashSet<>(); // 로또 번호의 중복을 방지하기 위해 Set 사용
        while (lottoEachLine.size() < count) {
            int num = random.nextInt(1, 46);
            lottoEachLine.add(num); // 로또 번호 생성
        }
        return lottoEachLine;
    }
}
