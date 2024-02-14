import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    private static int readIntegerInput(String message) {
        System.out.println(message);
        int number = scanner.nextInt();
        // Очистка буфера после ввода числа
        scanner.nextLine();
        return number;
    }

    private static String readStringInput(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }

    private static void printBinaryResult(String format, String binaryValue) {
        System.out.println(format + " в двоичном формате: " + binaryValue);
    }

    public static void main(String[] args) {
        List<Integer> array1 = new ArrayList<>(Arrays.asList(1, 56, 899, 65));
        List<Double> array2 = new ArrayList<>(Arrays.asList(1.0, 2.0, 56.0));
        Calculator calculator = new Calculator();

        System.out.println("Сложение:");
        System.out.println("arrays1 = " + calculator.sum(array1));
        System.out.println("arrays2 = " + calculator.sum(array2));
        System.out.println("Умножение:");
        System.out.println("arrays1 = " + calculator.multiply(array1));
        System.out.println("arrays2 = " + calculator.multiply(array2));
        System.out.println("Деление:");
        System.out.println("arrays1 = " + calculator.division(array1));
        System.out.println("arrays2 = " + calculator.division(array2));

        int intNumber = readIntegerInput("Введите целочисленное число:");
        printBinaryResult("Целое число", calculator.convertToBinaryInt(intNumber));

        String strNumber = readStringInput("Введите число в виде строки:");
        printBinaryResult("Число в виде строки", calculator.convertToBinaryStr(strNumber));

        double doubleNumber = Double.parseDouble(readStringInput("Введите число в виде Double:"));
        printBinaryResult("Число Double", calculator.DoubleToBinary(doubleNumber));

        float floatNumber = Float.parseFloat(readStringInput("Введите число в виде Float:"));
        printBinaryResult("Число Float", calculator.FloatToBinary(floatNumber));
    }
}