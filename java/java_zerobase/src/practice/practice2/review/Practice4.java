package practice.practice2.review;

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

        StringBuilder sb = new StringBuilder(); // 저장 공간
        int curSor = 0;
        int step = 'a' - 'A';
        int Idx = 0;

        boolean isShift = false;
        boolean isInsert = false;
        boolean isCapsLock = false;


        while (Idx < keyLog.length) {
            int key = keyLog[Idx];

            if (key == BACK_SPACE) {
                if (curSor == 0) {
                    continue;
                }
                sb.delete(curSor - 1, curSor);
                curSor = Math.max(0, --curSor);
            } else if (key == SHIFT) {
                isShift = true;
            } else if (key == CAPS_LOCK) {
                // capsLock은 토글
                isCapsLock = !isCapsLock;
            } else if (key == SPACE_BAR) {
                inputData(sb, ' ', curSor, isInsert);
                curSor++;
            } else if (key == KEY_LEFT) {
//                if (curSor == 0) {
//                    continue;
//                }
//                curSor--;
                curSor = Math.max(0, --curSor);
            } else if (key == KEY_RIGHT) {
//                if (curSor == sb.length()) {
//                    continue;
//                }
//                curSor++;
                curSor = Math.min(sb.length(), ++curSor);
            } else if (key == INSERT) {
                isInsert = !isInsert;
            } else if (key == DELETE) {
                // 커서 오른쪽 제거
                if (curSor == sb.length()) {
                    // 커서가 맨 끝인 경우
                    continue;
                }
                sb.delete(curSor, curSor + 1);
            } else if (key >= 97 && key <= 122) {
                if (isShift && isCapsLock) {
                    // 둘중 하나만 켜있으면 되는데 왜 &&?
                    // else에서 둘다 안켜져있음을 구현하기 위함
                    inputData(sb, (char) key, curSor, isInsert);
                } else if(isShift || isCapsLock) {
                    inputData(sb, (char) (key - step), curSor, isInsert);
                }
                isShift = false; // shift는 true가 되고 적용된 다음 바로 false로 바껴야함
                curSor++;
            } else if (key >= 48 && key <= 57) {
                if (isShift) {
                    char newKey = makeNumtoChar((char) key);
                    inputData(sb, newKey, curSor, isInsert);
                } else {
                    inputData(sb, (char) key, curSor, isInsert);
                }
                isShift = false;
                curSor++;
            }
            Idx++;
        }

        return sb.toString();

    }

    private static char makeNumtoChar(char key) {
        char c;
        switch (key) {
            case '0':
                c = ')';
                break;
            case '1':
                c = '!';
                break;
            case '2':
                c = '@';
                break;
            case '3':
                c = '#';
                break;
            case '4':
                c = '$';
                break;
            case '5':
                c = '%';
                break;
            case '6':
                c = '^';
                break;
            case '7':
                c = '&';
                break;
            case '8':
                c = '*';
                break;
            case '9':
                c = '(';
                break;
            default:
                throw new IllegalArgumentException("Key must be between 0 and 9");
        }
        return c;
    }

    private static void inputData(StringBuilder sb, char key, int curSor, boolean isInsert) {
        if (isInsert) {
            sb.setCharAt(curSor,key);
        } else {
            sb.insert(curSor, key);
        }
    }


}
