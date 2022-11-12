package Lab4;

import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите общее кол-во столбцов: ");
        int a = scanner.nextInt();
        System.out.print("Введите общее кол-во строк: ");
        int b = scanner.nextInt();

        System.out.println("===== NORMAL ARRAY =====");
        int [][] numsArr = createArray(a, b);

        System.out.println("===== TRANSPONATE ARRAY =====");
        transArr(numsArr, a, b);
    }

    private static int[][] createArray(int cols, int rows) {
        Random random = new Random(200);
        int[][] firstArray = new int[cols][rows];
        for (int i = 0 ; i < cols; i++) {
            for (int j = 0 ; j < rows; j++) {
                firstArray[i][j] = random.nextInt(200);
                System.out.println(firstArray[i][j]);
            }
        }
        return firstArray;
    }

    private static void transArr(int[][] normalArr, int cols, int rows){
        int[][] secondArray = new int[rows][cols];
        for (int i = 0 ; i < rows; i++) {
            for (int j = 0 ; j < cols; j++) {
                secondArray[i][j] = normalArr[j][i];
                System.out.println(secondArray[i][j]);
            }
        }
    }
}
