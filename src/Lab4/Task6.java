package Lab4;

import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите общее кол-во столбцов: ");
        int a = scanner.nextInt();
        System.out.print("Введите общее кол-в строк: ");
        int b = scanner.nextInt();

        System.out.println("===== FIRST ARRAY =====");
        int[][] numsArr = createFirstArr(a, b);

        System.out.println("===== SECOND ARRAY =====");
        createSecondArr(numsArr, a, b);
    }

    private static int[][] createFirstArr(int cols, int rows) {
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

    private static void createSecondArr(int[][] normalArr, int cols, int rows){
        Random random = new Random(200);

        int[][] secondArray = new int[cols-1][rows-1];
        for (int i = 0, s = 0; i < cols-1; s++, i++) {
            if (s != random.nextInt(cols - 1)){
                for (int j = 0, k = 0 ; j < rows-1; k++) {
                    if (k != random.nextInt(rows - 1)) {
                        secondArray[i][j] = normalArr[s][k];
                        System.out.println(secondArray[i][j]);
                        j++;
                    }
                }
            }
        }
    }
}
