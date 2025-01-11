package miniTest.mini1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Assign6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> candidates = new LinkedHashMap<>(); // 후보자와 득표수를 동시에 순서대로 저장하기 위해 LinkedHashMap 사용
        Random random = new Random();

        System.out.print("총 진행할 투표수를 입력해 주세요.");
        int totalVote = scanner.nextInt();
        scanner.nextLine();

        System.out.print("가상 선거를 진행할 후보자 인원을 입력해 주세요.");
        int totalCandidate = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= totalCandidate; i++) {
            System.out.print(i + "번째 후보자 이름을 입력해 주세요.");
            String candidateName = scanner.nextLine();
            candidates.put(candidateName, 0); // 후보자를 순서를 유지하여 저장
        }
        System.out.println();
        advanceVoting(totalVote, totalCandidate, candidates, random);
    }

    private static void advanceVoting(int totalVote, int totalCandidate, Map<String, Integer> candidates,
                                      Random random) {
        Set<Map.Entry<String, Integer>> entries = candidates.entrySet();
        List<String> candidateList = new ArrayList<>(candidates.keySet()); // 후보자 이름만 인덱싱이 가능한 자료구조에 저장

        for (int i = 1; i <= totalVote; i++) {
            // 투표 진행 로직 , 각 투표 현황에서 elected된 후보자 반환
            String electedCandidate = performVoting(totalCandidate, candidates, random, candidateList);

            List<Entry<String, Integer>> entryList = new ArrayList<>(entries); // entrySet 일반 for문을 사용하기 위함
            double percent = ((double) i / totalVote) * 100; // 투표 진행률
            System.out.println("[투표진행률]: " + percent + "%, " + i + "명 투표 => " + electedCandidate);
            votingStatus(totalVote, entryList);
        }

        // 결과 발표
        Integer maxVotes = Collections.max(candidates.values());
        for (Entry<String, Integer> entry : entries) {
            if (entry.getValue().equals(maxVotes)) {
                System.out.printf("%-5s", "[투표결과] 당선인 : " + entry.getKey());   // -> 아직 해결 못함 당선인이 중복되면 어떻게 처리할 것인가 ?????
            }
        }

    }

    private static String performVoting(int totalCandidate, Map<String, Integer> candidates, Random random,
                                    List<String> candidateList) {
        int count = random.nextInt(1, totalCandidate +1);
        String electedCandidate = candidateList.get(count - 1);
        candidates.put(electedCandidate, candidates.get(electedCandidate) + 1);
        return electedCandidate;
    }

    // 각 투표 현황을 depth를 위해 메서드로 추출
    private static void votingStatus(int totalVote, List<Entry<String, Integer>> entryList) {
        for (int j = 1; j <= entryList.size(); j++) {
            Entry<String, Integer> entry = entryList.get(j-1);
            String candidateName = entry.getKey();
            int countOfCandidate = entry.getValue();
            double percentOfCandidate = ((double) countOfCandidate / totalVote) * 100;

            System.out.printf("%-5s %-7s %5.2f%% %10s%n",
                    "[기호" + j + "]", candidateName + ":", percentOfCandidate, "(투표수: " + countOfCandidate + ")");
        }
        System.out.println();
    }

}
