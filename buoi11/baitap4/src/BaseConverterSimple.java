import java.util.Scanner;
import java.util.Stack;

public class BaseConverterSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số thập phân: ");
        int n = sc.nextInt();
        System.out.println("Số " + n + " chuyển qua hệ nhị phân là: " + convertToBinary(n));
        System.out.println("Số " + n + " chuyển qua hệ 16(Hexadecimal) là: " + convertDecimalToHexadecimal(n));

        sc.nextLine();
        System.out.print("Nhập chuỗi nhị phân: ");
        String binary = sc.nextLine();
        System.out.println("Số " + binary + " chuyển qua hệ thập phân là: " + convertBinaryToDecimal(binary));

        System.out.println("Nhập chuỗi hệ 16(Hexadecimal): ");
        String hex = sc.nextLine();
        System.out.println("Số " + hex + " chuyển qua hệ thập phân là: " + convertHexadecimalToDecimal(hex));
    }

    public static String convertToBinary (int number) {
        if (number == 0) {
            return "0";
        }

        Stack<Integer> stack = new Stack<>();

        while (number > 0) {
            stack.push(number % 2);
            number = number / 2;
        }

        String binary = "";
        while (!stack.isEmpty()) {
            binary += stack.pop();
        }
        return binary;
    }

    public static int convertBinaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            char bit = binary.charAt(i);
            if (bit == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }
        return decimal;
    }

    public static String convertDecimalToHexadecimal(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        String hexDigits  = "0123456789ABCDEF";
        String result = "";
        while (decimal > 0) {
            int remainder = decimal % 16;
            decimal = decimal / 16;
            result = hexDigits .charAt(remainder) + result;
        }
        return result;
    }

    public static int convertHexadecimalToDecimal(String hexadecimal) {
        int decimal = 0;
        int power = 1;
        String hexDigits = "0123456789ABCDEF";
        hexadecimal = hexadecimal.toUpperCase();
        for (int i = hexadecimal.length() - 1; i >= 0; i--) {
            char bit = hexadecimal.charAt(i);
            int value = hexDigits.indexOf(bit);
            decimal += value * power;
            power *= 16;
        }
        return decimal;
    }

}
