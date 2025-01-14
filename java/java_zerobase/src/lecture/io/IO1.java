package lecture.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class IO1 {

    public static void referInputStream() throws IOException {
//      System.in
        System.out.println("== System.in ==");
        System.out.print("입력 : ");
//        int b = System.in.read();
//        System.out.println("b = " + b);
        int a = System.in.read() - '0'; // System.in.read()는 바이트 단위로 입력을 읽음 -> 이때 대상의 ASCII코드로 반환하게 되는데 실제 숫자를 얻기위해서 0(ASCII = 48)을 빼주어 원래의 숫자를 얻을 수 있음
        System.out.println("a = " + a);
        System.in.read(new byte[System.in.available()]);

//      InputStreamReader
        System.out.println("== InputStreamReader ==");
        InputStreamReader reader = new InputStreamReader(System.in);
        char[] c = new char[3]; // InputStreamReader는 반드시 배열로 받아야한다
        System.out.print("입력 : ");
        reader.read(c);
        System.out.println("c = " + Arrays.toString(c));

//      BufferedReader
        System.out.println("== BufferedReader ==");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("입력 : ");
        String s1 = br.readLine();
        System.out.println("s1 = " + s1);

    }

    public static void main(String[] args) throws IOException {

//      1. 입력
//      1-1. 다른 입력 방식 참고
//        referInputStream();

//      1-2. Scanner
        System.out.println("== Scanner ==");
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력 : ");
        System.out.println(scanner.next()); // next() : 입력에서 첫번째 한 단어만 반환함 즉, 공백을 구분자로 첫번째 단어만 반환
        scanner.nextLine();

        System.out.print("입력2 : ");
        System.out.println(scanner.nextInt());
        scanner.nextLine();

        System.out.print("입력3 : ");
        System.out.println(scanner.nextLine());

//      참고) 정수, 문자열 변환
        int num = Integer.parseInt("122312");
        String str = Integer.toString(123412);
        System.out.println(num);
        System.out.println(str);

//      2. 출력
        System.out.println("== 출력 ==");
        System.out.println("Hello");
        System.out.println("World");

        System.out.print("Hello ");
        System.out.print("world! ");
        System.out.println();

        System.out.printf("Hello ");
        System.out.printf("World!");
        System.out.println();

        String s = "자바";
        int number = 3;

        System.out.println(s + "는 언어 선호도 " + number + "위 입니다.");
        System.out.printf("%s는 언어 선호도 %d위 입니다.\n", s,number);

        System.out.printf("%d\n", 10);
        System.out.printf("%o\n", 10); // 8진수
        System.out.printf("%x\n", 10); // 16진수

        System.out.printf("%f\n", 5.2f);

        System.out.printf("%c\n", 'A');
        System.out.printf("%s\n", "안녕하세요");

        System.out.printf("%5d\n" , 123);  // 입력 앞부분 공백
        System.out.printf("%-5d\n" , 123); // 입력 뒷부분 공백
        System.out.printf("%5d\n", 1234);
        System.out.printf("%5d\n", 12345);

    }
}
