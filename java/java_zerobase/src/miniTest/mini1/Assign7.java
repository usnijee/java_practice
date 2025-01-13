package miniTest.mini1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Assign7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int count = 6; // 뽑을 로또 번호 개수

        System.out.println("[로또 당첨 프로그램]");
        System.out.println();

        System.out.print("로또 개수를 입력해 주세요.(숫자 1 ~ 10):");
        int quantity = scanner.nextInt();
        List<Set<Integer>> myLotto = makeLotto(quantity, count, random);
        displayMyLotto(myLotto, quantity, count, random);

        System.out.println("[로또 발표]");
        Set<Integer> winningNumbers = makeWinningNumbers(count, random);
        displayWinningNums(winningNumbers, count);

        System.out.println("[내 로또 결과]");
        displayResult(myLotto, winningNumbers);

    }

    private static void displayMyLotto(List<Set<Integer>> myLotto, int quantity, int count, Random random) {
        int order = 0;

        for (Set<Integer> lottoEach : myLotto) {
            char alphabet = (char) ('A' + order);
            String result = setToString(lottoEach);
            System.out.printf("%-3c %s \n", alphabet, result);
            order++;
        }
        System.out.println();
    }

    private static void displayWinningNums(Set<Integer> winningNumbers, int count) {
        String result = setToString(winningNumbers);
        System.out.printf("%20s \n", result);
        System.out.println();
    }

    private static void displayResult(List<Set<Integer>> myLotto, Set<Integer> winningNumbers) {
        int order = 0;

        for (Set<Integer> lottoEach : myLotto) {
            char alphabet = (char) ('A' + order);
            String result = setToString(lottoEach);
            lottoEach.retainAll(winningNumbers); // 교집합을 통해 공통 개수 구하기
            int matchCounts = lottoEach.size();

            System.out.printf("%-3c %s => %d개 일치\n", alphabet, result, matchCounts);
            order++;
        }
    }

    // display를 하는 메서드의 공통된 부분 추출
    private static String setToString(Set<Integer> lottoEach) {
//        StringBuilder result = new StringBuilder();
//        for (Integer eachNum : lottoEach) {
//            if (result.length() > 0) {
//                result.append(",");
//            }
//            result.append(eachNum);
//        }
//        return result;
        return lottoEach.stream().map(String::valueOf).collect(Collectors.joining(","));
    }

    // quantity만큼의 로또 라인 생성 함수
    private static List<Set<Integer>> makeLotto(int quantity, int count, Random random) {
        List<Set<Integer>> lottoPaper = new ArrayList<>(); // 여러 로또 라인을 하나의 로또 종이안에 구현하기 위함

//        for (int i = 0; i < quantity; i++) {
//            Set<Integer> lottoEachLine = getRandomNums(count, random);
//            lottoPaper.add(lottoEachLine);
//        }
        lottoPaper = IntStream.range(0, quantity).mapToObj(i -> getRandomNums(count, random)).collect(Collectors.toList());
        return lottoPaper;
    }

    // 당첨 번호 생성 로직 메서드
    private static Set<Integer> makeWinningNumbers(int count, Random random) {
        Set<Integer> winningNums = getRandomNums(count, random);
        return winningNums;
    }

    // 무작위로 로또 번호 생성하는 로직 (당첨 번호와 유저들의 로또 페이퍼에 모두 사용됨)
    private static Set<Integer> getRandomNums(int count, Random random) {
        Set<Integer> lottoEachLine = new HashSet<>(); // 로또 번호의 중복을 방지하기 위해 Set 사용
        while (lottoEachLine.size() < count) {
            int num = random.nextInt(1, 46);
            lottoEachLine.add(num); // 로또 번호 생성
        }
        return lottoEachLine;
    }
}
