package lecture.java.io;
// Practice
// JamesArthurGosling.txt 파일을 읽은 후 원하는 단어 변경하여 새로 저장해보자.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileIOPractice {
    public static void main(String[] args) throws IOException {
        String inputFile = "./JamesArthurGosling.txt";
        String outputFile = "./JamesArthurGosling_edit.txt";

        // 찾을 단어 / 변경 단어 입력 받기
        System.out.print("찾을 단어: ");
        Scanner scanner = new Scanner(System.in);
        String find = scanner.nextLine();
        System.out.println("변경 단어: ");
        String to = scanner.nextLine();

        // 파일 읽기, 변경 및 저장
        BufferedReader br = new BufferedReader(new FileReader(inputFile));
        FileWriter fw = new FileWriter(outputFile);

        while (true) {
            String line = br.readLine();
            if (line == null) {
                break;
            }

            String newLine = line.replace(find, to);
            fw.write(newLine + '\n');
        }

        br.close();
        fw.close();


    }
}
