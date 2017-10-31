/**
 * Java. Level 1. Lesson 3. Example of homework
 *
 * @author Sergey Iryupin
 * @version dated May 16, 2017
 */
import java.util.*;

 class HW3Less {
    static Random random = new Random();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
    /**
     * 1. Написать программу, которая загадывает случайное число от 0 до 9,
     *    и пользователю дается 3 попытки угадать это число. При каждой попытке
     *    компьютер должен сообщить больше ли указанное пользователем число чем
     *    загаданное, или меньше. После победы или проигрыша выводится запрос
     *    «Повторить игру еще раз? 1 – да / 0 – нет» (1 – повторить, 0 – нет).
     */
        String repeat = "0";
        do {
            int count = 0;
            int guess = -1;
            int number = random.nextInt(10);
            while (count < 3 && guess != number) {
                System.out.print(
                        "Угадай [" + (count + 1) + "] число (0..9): ");
                try {
                    guess = sc.nextInt();
                    if (number == guess) {
                        System.out.println("Ты выиграл!");
                    } else {
                        System.out.println("Твой номер " + ((guess < number)?
                                "больше" : "меньше."));
                        count++;
                    }
                } catch (InputMismatchException ex) {
                    System.out.println("Input Mismatch Exception!");
                    sc.next();
                }
            }
            if (count == 3)
                System.out.println("Ты проиграл!");
            System.out.print("Повторить игру?\n[1 - да / 0 - нет]: ");
            repeat = sc.next();
        } while (repeat.equals("1"));
    }
}