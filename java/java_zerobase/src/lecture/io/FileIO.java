package lecture.io;
// Java 프로그래밍 - 입출력_2

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileIO {

    public static void main(String[] args) throws IOException {
//      1. 파일 쓰기
//      FileWriter
        FileWriter fw = new FileWriter("./memo.txt"); // 현재 경로에 빈 파일 생성
        String memo = "헤드 라인\n";
        fw.write(memo); // 파일에 내용 write

        memo = "1월 1일 날씨 맑음\n";
        fw.write(memo);

        fw.close();

//      PrintWriter
        PrintWriter pw = new PrintWriter("./memo2.txt");
        memo = "헤드라인"; // pw는 println을 제공하기에 \n이 필요없다
        pw.println(memo);

        memo = "1월 1일 날씨 맑음";
        pw.println(memo);

        pw.close();

//      파일 이어 쓰기
        FileWriter fw2 = new FileWriter("./memo.txt", true); // append 매개변수를 true로 하면 해당 파일에 이어서 내용 추가 가능

        memo = "1월 2일 날씨 완전 맑음\n";
        fw2.write(memo);
        fw2.close();

        PrintWriter pw2 = new PrintWriter(new FileWriter("./memo.txt", true)); // new FileWriter를 만들어서 매개변수로 넣어주어야 PrintWriter로 파일 이어 쓰기 가능

        memo = "1월 3일 날씨 너무 더움";
        pw2.println(memo);
        pw2.close();

//      2. 파일 입력 출력하기 (파일 내용 출력하기)
        BufferedReader br = new BufferedReader(new FileReader(("./memo.txt")));

        while (true) {
            String line = br.readLine();

            if (line == null) {
                break;
            }

            System.out.println(line);
        }
        br.close();



    }
}
