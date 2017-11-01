import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ваша задача угадать номер");
        for (int i = 10; i <= 30; i += 10) playLevel(i);
        System.out.println("Вы выиграли");
        scanner.close();  // закрываем сканер - так как он выделяет ресурсы
    }
    private static void playLevel(int range) {
        int number = (int) (Math.random() * range);  // универсальный метод
        while (true) {
            System.out.println("Введите число от нуля до " + range);
            int input_number = scanner.nextInt();
            if (input_number == number) {
                System.out.println("Вы выиграли");
                break;
            } else if (input_number > number) {
                System.out.println("Ваше число меньше");
            } else {
                System.out.println("Ваше число больше");
            }
        }
    }
 /*       System.out.println("Введите операцию:"); /// простейший калькулятор
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3.Уножение");
        System.out.println("4.Деление");
        Scanner scanner = new Scanner(System.in);
    int operation = scanner.nextInt();
    System.out.println("Введите первое число: ");
    int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        int result;
        if (operation == 1) {
            result = a + b;
        } else if (operation == 2) {
            result = a - b;
        } else if (operation == 3) {
            result = a * b;
        } else {
            result = a / b;
        }
        System.out.println("Ваш результат равен: " + result);  */

/*    System.out.println("Введите число");    /// Ввод и вывод числа в конслоль
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    System.out.println("variable a = " + a ); */
}