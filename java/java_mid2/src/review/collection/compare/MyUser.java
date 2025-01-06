package review.collection.compare;

public class MyUser implements Comparable<MyUser>{

    private String id;
    private int age;

    public MyUser(String id, int age) {
        this.id = id;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }
    /**
     * MyUser 객체는 Comparable 인터페이스의 구현체이기에 '비교가능한 객체'이며 Comparable 인터페이스의
     * compareTo 메서드를 오버라이딩하여 compareTo를 기준으로 기본 비교를 진행한다
     *
     * 기본 비교말고 추가로 다른 기준으로 비교를 하고 싶다면 Comparator인터페이스의 구현체를 만든후
     * Arrays.sort(MyUser, 특정 comparator)로 진행하면 된다
     */
    @Override
    public int compareTo(MyUser o) {
        return (this.age < o.age ? -1 : (this.age == o.age ? 0 : 1));
    }

    @Override
    public String toString() {
        return "MyUser{" +
                "id='" + id + '\'' +
                ", age=" + age +
                '}';
    }
}
