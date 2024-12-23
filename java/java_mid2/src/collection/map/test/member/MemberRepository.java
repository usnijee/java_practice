package collection.map.test.member;
/**
 * Map 을 사용해서 회원을 저장하고 관리하는 MemberRepository 코드를 완성하자.
 * Member , MemberRepositoryMain 코드와 실행 결과를 참고하자
 */

import java.util.HashMap;
import java.util.Map;

public class MemberRepository {

    private Map<String, Member> memberMap = new HashMap<>();

    public void save(Member member) {
        memberMap.put(member.getId(), member);
    }

    public void remove(String id) {
        memberMap.remove(id);
    }

    public Member findById(String id) {
        return memberMap.get(id);
    }

    public Member findByName(String name) {
        for (Member member : memberMap.values()) {
            if (member.getName().equals(name)) {
                return member;
            }
        }
        return null;
    }
}
