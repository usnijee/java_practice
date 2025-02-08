package lecture.basicMath.practice.practice1.practice5;

public class Practice5 {
    public static int solution(int[][] grid) {
        int[][] directions = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}}; // 탐색 방향을 배열화
        int cnt = 0;

        int row = grid.length;
        int col = grid[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    for (int[] d : directions) {
                        int x = i + d[0];
                        int y = j + d[1];

                        if (x < 0 || y < 0 || x >= row || y >= col || grid[x][y] == 0) {
                            /**
                             * 현재 좌표에서 d를 더한 즉, 현재 grid 위치에서 상하좌우의 인접한 위치가 물이거나 grid를 벗어 나는 경우
                             * -> count해주어야함 영토의 변이기 때문
                             */
                            cnt++;
                        }
                    }
                }
            }
        }
        return cnt;
    }
    
    // 재귀 풀이
    public static int solution2(int[][] grid) {
        int[][] directions = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}}; // 탐색 방향을 배열화

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    return recursion(grid, directions, i, j);
                }
            }
        }

        return 0;
    }

    public static int recursion(int[][] grid, int[][] directions, int i, int j) {
        int row = grid.length;
        int col = grid[0].length;

        grid[i][j] = -1; // 탈출 조건 -> 이미 확인한 곳은 -1로 설정하여 다시 탐색하는 일 없도록 함

        int cnt = 0;
        for (int[] d : directions) {
            int x = i + d[0];
            int y = j + d[1];

            if (x < 0 || y < 0 || x >= row || y >= col || grid[x][y] == 0) {
                /**
                 * 현재 좌표에서 d를 더한 즉, 현재 grid 위치에서 상하좌우의 인접한 위치가 물이거나 grid를 벗어 나는 경우
                 * -> count해주어야함 영토의 변이기 때문
                 */
                cnt++;
            } else {
                /**
                 * 현재 위치에서 상하좌우 방향중 다른 영토와 맞닿아있는 경우 ->
                 */
                if (grid[x][y] == 1) {
                    /**
                     * 영토이면서 탐색하지 않은 부분
                     */
                    cnt += recursion(grid, directions, x, y);
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        // Test code
        int[][] grid = {{1}};
        System.out.println(solution(grid));
        System.out.println(solution2(grid));
        System.out.println();

        grid = new int[][]{{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
        System.out.println(solution(grid));
        System.out.println(solution2(grid));
    }
}
