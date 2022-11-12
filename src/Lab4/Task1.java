package Lab4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int figure = 11;
        int x;
        int y;
        int z;
        for (x=1; x<=figure; x++) {
            System.out.println("номер строки" + x + "");
            z = 0;
            for (y=-12; y<figure; y++){
                System.out.println("+");
                z=z+1;
            }
            System.out.println("Количество символов в строке"+z);
        }
    }
}
