package practice.practice2;

import java.util.Random;

public class Practice4 {

    public static void main(String[] args) {
        int[] keyLog = {16, 106, 101, 108, 108, 111, 37, 37, 37, 37, 37, 155, 16, 104};
        System.out.println(solution(keyLog));

        keyLog = new int[]{20, 104, 16, 105, 32, 20, 16, 106, 97, 118, 97};
        System.out.println(solution(keyLog));

        keyLog = new int[]{49, 51, 8, 50, 51, 53, 55, 37, 37, 127, 127, 52, 53};
        System.out.println(solution(keyLog));

        keyLog = new int[]{20, 97, 98, 16, 99, 16, 100, 16, 49, 16, 50, 16, 51};
        System.out.println(solution(keyLog));


    }

    public static String solution(int[] keyLog) {
        final int BACK_SPACE = 8;
        final int SHIFT = 16;
        final int CAPS_LOCK = 20;
        final int SPACE_BAR = 32;
        final int KEY_LEFT = 37;
        final int KEY_RIGHT = 39;
        final int INSERT = 155;
        final int DELETE = 127;

        StringBuilder sb = new StringBuilder();
        int step = (int) ('a' - 'A');
        int cursor = 0; // 커서 위치
        // 놓친 부분
        boolean isShift = false;
        boolean isCapsLock = false;
        boolean isInsert = false;

        for (int i = 0; i < keyLog.length; i++) {
            if (keyLog[i] == BACK_SPACE) {
                if (cursor == 0) {
                    continue;
                }
                sb.delete(cursor - 1, cursor);
                cursor = Math.max(0, cursor - 1);
            } else if (keyLog[i] == SHIFT) {
                isShift = true;
            } else if (keyLog[i] == CAPS_LOCK) {
//                if (isCapsLock == false) {
//                    isCapsLock = true;
//                } else {
//                    isCapsLock = false;
//                }
                isCapsLock = !isCapsLock;
            } else if (keyLog[i] == SPACE_BAR) {
//                sb.insert(cursor, " ");
//                cursor++;
                inputData(sb, ' ', cursor, isInsert);  // space bar도 insert의 영향을 받는다
                cursor++;
            } else if (keyLog[i] == KEY_LEFT) {
                cursor = Math.max(0, cursor - 1);
            } else if (keyLog[i] == KEY_RIGHT) {
                cursor = Math.min(sb.length(), cursor + 1);
            } else if (keyLog[i] == INSERT) {
                isInsert = !isInsert;
            } else if (keyLog[i] == DELETE) {
                if (cursor == sb.length()) {
                    continue;
                }
                sb.delete(cursor, cursor + 1);

            } else if (keyLog[i] >= 97 && keyLog[i] <= 122) {
//                if (isInsert) {
//                    if (isCapsLock) {
//                        sb.insert(cursor, (char) (keyLog[i] - step));
//                    } else if (isShift) {
//                        sb.insert(cursor, (char) (keyLog[i] - step));
//                        isShift = false;
//                    } else {
//                        sb.insert(cursor, (char) keyLog[i]);
//                    }
//                    cursor++;
//                } else {
//                    if (isCapsLock) {
//                        sb.setCharAt(cursor, (char) (keyLog[i] - step));
//                    } else if (isShift) {
//                        sb.setCharAt(cursor, (char) (keyLog[i] - step));
//                        isShift = false;
//                    } else {
//                        sb.setCharAt(cursor, (char) keyLog[i]);
//                    }
//                    cursor++;
//                }
                int data = keyLog[i];

                if (isCapsLock && isShift) {
                    data = keyLog[i];
                } else if (isCapsLock || isShift) {
                    data -= step;
                }
                // 데이터 입력
                inputData(sb, (char) data, cursor, isInsert);
                isShift = false;
                cursor++;
            }  else if (keyLog[i] >= 48 && keyLog[i] <= 57) {
//                if (isInsert) {
//                    if (isShift) {
//                        sb.insert(cursor, numtoSymbol(keyLog[i]));
//                        isShift = false;
//                    } else {
//                        sb.insert(cursor, (char) keyLog[i]);
//                    }
//                    cursor++;
//                } else {
//                    if (isShift) {
//                        sb.setCharAt(cursor, numtoSymbol(keyLog[i]));
//                        isShift = false;
//                    } else {
//                        sb.setCharAt(cursor, (char) keyLog[i]);
//                    }
//                    cursor++;
//                }
                if (isShift) {
                    inputData(sb, numtoSymbol((char)keyLog[i]), cursor, isInsert);
                } else {
                    inputData(sb, (char)keyLog[i], cursor, isInsert);
                }
                isShift = false;
                cursor++;
            }
        }
        return sb.toString();
    }

    public static void inputData(StringBuilder sb, char data, int cursor, boolean isInsert) {
        if (isInsert == false) {
            sb.insert(cursor, data);
        } else {
            sb.setCharAt(cursor,data);
        }
    }

    private static char numtoSymbol(char key) {
        char symbol;
        switch (key) {
            case '0':
                symbol = ')';
                break;
            case '1':
                symbol = '!';
                break;
            case '2':
                symbol = '@';
                break;
            case '3':
                symbol = '#';
                break;
            case '4':
                symbol = '$';
                break;
            case '5':
                symbol = '%';
                break;
            case '6':
                symbol = '^';
                break;
            case '7':
                symbol = '&';
                break;
            case '8':
                symbol = '*';
                break;
            case '9':
                symbol = '(';
                break;
            default:
                throw new IllegalArgumentException("Key must be between 0 and 9");
        }
        return symbol;
    }
}
