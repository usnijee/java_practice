package extends1.ex;

public class ShopMain {

    public static void main(String[] args) {
        Book book = new Book("JAVA",10000,"han","12345");
        Album album = new Album("앨범1",15000,"seo");
        Movie movie = new Movie("영화1",18000,"감독1","배우1");

        book.print();
        album.print();
        movie.print();

        int sum = book.getPrice() + album.getPrice() + movie.getPrice();
        System.out.println("상품 가격의 합: " + sum);
    }
}


/*
    정리
    1. 공통된 속성(필드, 메소드)는 전부 부모클래스에서 구현한다
    -> 상속관계가 있는 클래스는 객체 생성시 힙영역에 자식 클래스와 부모 클래스의 객체 모두가 생성되고
       해당 객체를 참조하기 위한 메모리값은 객체를 생성할 때마다 고유한 값으로 부여받는다

    2. 공통된 속성을 수정하거나 특정 내용을 추가할 때 override를 사용한다
    3. 접근제어자는 상황을 고려해서 잘 정해야한다
 */