import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    //  Задача 1: Четное или нечетное число
    //  Условие:
    //  Пользователь вводит целое число. Программа должна вывести, является ли это число четным или нечетным.

//        System.out.println("Введите число");
//        int num = scanner.nextInt();
//        if (num % 2 == 0) {
//            System.out.println("Число " + num + " четное");
//        }
//        else {
//            System.out.println("Число " + num + " нечетное");
//        }
        // Задача 2: Минимальное из трех чисел
        // Условие:
        //Пользователь вводит три целых числа. Программа должна найти и вывести минимальное из них.

//        System.out.println("Первое число");
//        int first = scanner.nextInt();
//        System.out.println("Второе число");
//        int second = scanner.nextInt();
//        System.out.println("Третье число");
//        int third = scanner.nextInt();
//        System.out.printf("Макимальное число: " + Math.max(first, Math.max(second, third)));

        // Задача 3: Таблица умножения
        // Условие:
        // Напишите программу, которая выводит таблицу умножения на 5 (от 1 до 10).

//        for (int i = 1; i < 11; i++)
//        {
//            System.out.println("5 * " + i + " = " + i*5);
//        }

        // Задача 4: Сумма чисел от 1 до N
        // Условие:
        // Пользователь вводит целое число N. Программа должна вывести сумму всех чисел от 1 до N.

//        System.out.println("Введите число N");
//        int N = scanner.nextInt();
//        int sum = 0;
//        for (int i = 1; i < N+1; i++)
//        {
//            sum += i;
//        }
//        System.out.println("Сумма всех чисел от 1 до " + N + " - " + sum);

        // Задача 5: Число Фибоначчи
        // Условие:
        // Пользователь вводит целое число N. Программа должна вывести первые N чисел Фибоначчи.

//        System.out.println("Введите чмсло N");
//        int N = scanner.nextInt();
//        System.out.println("Первые " + N + "числа Фибоначи:");
//        int a = 0, b = 1;
//        for (int i = 0; i < N; i++)
//        {
//            System.out.print(a + " ");
//            int c = a + b;
//            a = b;
//            b = c;
//        }
//        System.out.println();

        // Задача 6: Проверка простого числа
        // Условие:
        // Пользователь вводит целое число. Программа должна проверить, является ли это число простым (делится только на 1 и само на себя).

//        System.out.println("Введите число");
//        int num = scanner.nextInt();
//        int i = 4;
//        boolean prime = true;
//        while (i < num/2)
//        {
//            if (num % i != 0)
//            {
//                prime = false;
//                break;
//            }
//            i++;
//        }
//        if (prime)
//        {
//            System.out.println("Число " + num + " простое");
//        }
//        else
//        {
//            System.out.println("Число " + num + " не простое");
//        }

        // Задача 7: Обратный порядок чисел
        // Условие:
        // Пользователь вводит целое число N. Программа должна вывести числа от N до 1 в обратном порядке.

//        System.out.println("Введите число N");
//        int N = scanner.nextInt();
//
//        for (int i = N; i > 0; i--)
//        {
//            System.out.printf(i + " ");
//        }
//        System.out.println();

        // Задача 8: Сумма четных чисел
        // Условие:
        // Пользователь вводит два целых числа A и B. Программа должна найти сумму всех четных чисел в диапазоне от A до B (включительно).

//        System.out.println("Введите первое число (А)");
//        int A = scanner.nextInt();
//        System.out.println("Введите первое число (В)");
//        int B = scanner.nextInt();
//        int sum = 0;
//        for (int i = A; i < B+1; i++)
//        {
//            if (i%2 == 0)
//            {
//                sum += i;
//            }
//        }
//        System.out.println("Сумма всех четных чисел от " + A + " до " + B + " - " + sum);

        // Задача 9: Реверс строки
        // Условие:
        // Пользователь вводит строку. Программа должна вывести эту строку в обратном порядке.

//        System.out.println("Введите строку");
//        String str = scanner.nextLine();
//        String reversed = new StringBuilder(str).reverse().toString();
//        System.out.println("Строка в обратном порядке:\n" + reversed);

        // Задача 10: Количество цифр в числе
        // Условие:
        // Пользователь вводит целое число. Программа должна вывести количество цифр в этом числе.

//        System.out.println("Введите число");
//        String num = scanner.nextLine();
//        System.out.println("Количество цифр в числе " + num + " - " + num.length());
    }
}

