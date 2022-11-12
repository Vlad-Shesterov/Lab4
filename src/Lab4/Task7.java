package Lab4;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input total rows: ");
        int a = scanner.nextInt();
        System.out.print("Input total cols: ");
        int b = scanner.nextInt();

        int[][] snakeArr = createSnakeArr(a, b);
        showSnakeArr(snakeArr);
    }

    private static int[][] createSnakeArr(int rows, int cols) {
        int[][] snakeArr = new int[rows][cols];
        int tailSnake = 0;
        int bodySnake = 0;
        int countRows = 0;

        for (int i = 0; countRows < snakeArr.length ; countRows++, tailSnake++) {
            for (int j = 0; j <(snakeArr[i].length - tailSnake); j++) {
                snakeArr[i][j] = bodySnake;
                bodySnake++;
            }

            if(i < snakeArr.length-1) i++;
            for (int o = rows - 1; o > tailSnake; o--) {
                snakeArr[o][snakeArr[i].length - 1 - tailSnake] = bodySnake;
                bodySnake++;
            }
        }
        return snakeArr;
    }

    private static void showSnakeArr(int[][] snakeArr) {
        for (int i = 0, z = 0; i < snakeArr.length; i++, z = 0) {
            int count = i + 1;
            System.out.printf("Row %d: ", count);
            for (int j = 0; j < snakeArr[i].length; j++){
                System.out.print(snakeArr[i][j] + " ");
                z++;
            }
            System.out.println("|| Cols: " + z);

        }        }
}
