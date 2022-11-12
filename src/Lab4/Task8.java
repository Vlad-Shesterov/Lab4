package Lab4;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст для шифрования: ");
        String baseText = scanner.nextLine();
        System.out.print("Введите ключ сдвига: ");
        int keyEncrypt = scanner.nextInt();

        String encryptStr = CaesarEncrypt.encrypt(baseText, keyEncrypt);
        System.out.print("Текст после преобразования :" + "\"" + encryptStr + "\"");

        System.out.print("\nВыполнить обратное преобразование? (y/n)");
        boolean cool = false;
        while (!cool) {
            String reply = scanner.next();
            if (reply.equalsIgnoreCase("y")) {
                String decryptStr = CaesarEncrypt.decrypt(encryptStr, keyEncrypt);
                System.out.println(decryptStr);
                cool = true;
            }

            else if (reply.equalsIgnoreCase("n")) {
                System.out.println("До свидания!");
                cool = true;
            }

            else {
                System.out.println("Введите корректный ответ: ");
            }
        }
    }
    private static class CaesarEncrypt {
        static String encryptText;
        private static String encrypt(String enText, int key)
        {
            char[] ArrayText = enText.toCharArray();
            int[] CharCode = new int[ArrayText.length];
            for (int i = 0; i < ArrayText.length; i++)
            {
                CharCode[i] = ArrayText[i];
                CharCode[i] = CharCode[i] + key;
            }
            for (int i = 0; i < ArrayText.length; i++)
            {
                ArrayText[i] = (char) CharCode[i];
            }
            encryptText = new String(ArrayText);
            return encryptText;
        }

        private static String decrypt(String enText, int key)
        {
            char[] ArrayText = enText.toCharArray();
            int[] CharCode = new int[ArrayText.length];
            for (int i = 0; i < ArrayText.length; i++)
            {
                CharCode[i] = ArrayText[i];
                CharCode[i] = CharCode[i] - key;
            }
            for (int i = 0; i < ArrayText.length; i++)
            {
                ArrayText[i] = (char) CharCode[i];
            }
            encryptText = new String(ArrayText);
            return encryptText;
        }
    }
}