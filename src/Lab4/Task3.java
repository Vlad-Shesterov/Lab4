package Lab4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ширину: ");
        int width = scanner.nextInt();
        System.out.print("Введите длину: ");
        int height = scanner.nextInt();
        scanner.close();

        showRectangleArray(createRectangleArray(width, height, 2));
    }

    public static int[][] createRectangleArray(int w, int h, int mask) {
        int[][] rectGraph = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                rectGraph[i][j] = mask;
            }
        }
        return rectGraph;
    }

    public static void showRectangleArray(int[][] rectArr) {
        for (int i = 0; i < rectArr.length; i++) {
            for (int j = 0; j < rectArr[0].length; j++) System.out.print(rectArr[i][j]);
            System.out.println();
        }
    }
}
