package nested.test.ex1;

/*
문제: 도서 관리 시스템
    도서관에서 사용할 수 있는 간단한 도서 관리 시스템을 만들어 보자. 이 시스템은 여러 권의 도서 정보를 관리할 수 있어
    야 한다. 각 도서는 도서 제목( `title` )과 저자명( `author` )을 가지고 있다. 시스템은 도서를 추가하고, 모든 도서의 정
    보를 출력하는 기능을 제공해야 한다.

    - `Library` 클래스를 완성해라.
    - `LibraryMain` 과 실행 결과를 참고하자.
    - `Book` 클래스는 `Library` 내부에서만 사용된다. `Library` 클래스 외부로 노출하면 안된다.
    - `Library` 클래스는 `Book` 객체 배열을 사용해서 도서 목록을 관리한다
 */
public class Library {

    private int bookCnt;
    private Book[] books;

    public Library(int size) {
        this.bookCnt = 0;
        this.books = new Book[size];
    }

    public void addBook(String title, String author) {
//        if (bookCnt < books.length) {
////            books[bookCnt] = new Book(title, author);
////            bookCnt++;
//            books[bookCnt++] = new Book(title,author);
//        } else {
//            System.out.println("도서관 저장 공간이 부족합니다.");
//        }
        // 정상 로직과 비정상 로직을 if-else로 처리하기 보단 비정상 로직읆 먼저 처리한 후 정상 로직을 제시하는 것이 유지보수에 좋음
        // 그 이유는 비정상 로직은 계속해서 추가 될 수 있기 때문

        if (bookCnt >= books.length) {
            System.out.println("도서관 저장 공간이 부족합니다.");
            return; // 현재 메서드(addBook)의 나머지 부분을 건너뛰고 메서드 호출이 종료
        }
        books[bookCnt++] = new Book(title, author);
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (int i = 0; i < bookCnt; i++) {
            System.out.println("도서 제목: " + books[i].title + ", 저자: " + books[i].author);
        }
    }

    // 중첩 클래스의 효용 --> 저장공간으로 사용할 수 있다.... 대박적
    private static class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

    }

}
/*
    놓쳤던 부분

    1. 배열의 원소는 기본형만 되는것이 아니다. 배열의 원소는 참조형도 된다.

 */
