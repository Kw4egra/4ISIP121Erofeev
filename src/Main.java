import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    //  Задача 1: Четное или нечетное число
    //  Условие:
    //  Пользователь вводит целое число. Программа должна вывести, является ли это число четным или нечетным.
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("Четное");
        }
        else {
            System.out.println("Нечетное");
        }
    }
}

