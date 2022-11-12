package Lab4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите высоту: ");
        int height = scanner.nextInt();
        scanner.close();

        showTriangleArray(createTriangleArr(height, 9));
    }

    public static int[][] createTriangleArr(int h, int mask) {
        int [][] triangleArr = new int [h][];
        for (int i = 0; i < triangleArr.length; i++) {
            int j = i + 1;
            triangleArr[i]= new int[j];
        }
        for (int i =0; i < h; i++){
            for (int j = 0; j < i+1; j++) triangleArr[i][j] = mask;
        }
        return triangleArr;
    }

    public static void showTriangleArray(int[][] triArr) {
        for (int i =0; i < triArr.length; i++){
            for (int j = 0; j < triArr[i].length; j++) System.out.print(triArr[i][j]);
            System.out.println();
        }
    }
}

