package review.collection.set;

import review.collection.set.member.Member;

public class JavaHashCodeMain {

    public static void main(String[] args) {

        Object object1 = new Object(); // x001
        Object object2 = new Object(); // x002

        System.out.println("object1.hashCode() = " + object1.hashCode());
        System.out.println("object2.hashCode() = " + object2.hashCode());

        Integer i = 10;
        String strA = "A";
        String strAB = "AB";
        System.out.println("i.hashCode() = " + i.hashCode());
        System.out.println("strA.hashCode() = " + strA.hashCode());
        System.out.println("strAB.hashCode() = " + strAB.hashCode());

        Member member1 = new Member("idA");
        Member member2 = new Member("idA");
        System.out.println("member1.hashCode() = " + member1.hashCode());
        System.out.println("member2.hashCode() = " + member2.hashCode());
    }
}
