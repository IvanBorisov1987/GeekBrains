package geekbrains.java_level_one.ovchinnikov.lesson_one;

import java.util.Random;
import java.util.Scanner;

/**
 * крестики нолики с AI
 */

public class HW3 {

    // переменные ртвечает за создание статического  поля
    static final int SizeX = 3;
    static final int SizeY = 3;
    static char[][] field = new char[SizeY][SizeX];

    static final char Player_DOT = 'X'; // поле игрока
    static final char AI_DOT = '0'; // поле компьютера
    static final char Empty_DOT = '.';  // пустое поле

    static Scanner scanner = new Scanner(System.in); // Сканер для ввода чисел с клавиатуры игроком
    static final Random rand = new Random(); // переменная для хода Ai, генератор случайных чисел (от 0 до 21)


        // метод initField создает пустое поле установленного размера и заполняет его пустыми значениями
        private static void initField() {
            for (int i =0; i < SizeY; i++) // по столбцу так как идет сверху вниз
                for (int j = 0; j < SizeX; j++) // по строке
                    field[i][j] = Empty_DOT;
        }


        // метод printField показывает поле пользовател
        private static void printField() {
            System.out.println("----------");
            for (int i =0; i < SizeY; i++) { // по столбцу так как идет сверху вниз
                System.out.print("|");
                for (int j = 0; j < SizeX; j++) // по строке
                    System.out.print(field[i][j] + " |");
                System.out.println();
            }
            System.out.println("----------");
        }

        // принимает параметры координат для того что бы прнимать значения
        private static void setSym(int x, int y, char sym) {
            field[x][y] = sym;
        }


        // Метод playerTurn описывает ход человека, переменные отображают координаты хода
        // заводим в цикл если в параметре true а не false!!! - обратить внимание
        private static void playerTurn() {
            int x;
            int y;
            do {
                System.out.println("Введите координаты в формате X Y (1 -3): ");
                x = scanner.nextInt() - 1;
                y = scanner.nextInt() - 1;

            } while (!isCellValid(y,x)); // остановит цикл, так как значения введенные буду твалидны и вернут true
                // не - неможем - значит просто инверсия

            setSym(y, x, Player_DOT); // почему "-1" потому что массив воспринимает цифры с 0 а пользователь с 1
        }


    // Метод aiTurn описывает ход компьютера, переменные отображают координаты кода
        private static void aiTurn() {
            int x;
            int y;

            do {
                x = rand.nextInt(SizeX);
                y = rand.nextInt(SizeY);

            } while (!isCellValid(y,x));
            setSym(y, x, AI_DOT);
        }

        // проверка на правильность внесенных значений - true -когда введенное значение правильно и не нарушает условий
        private static boolean isCellValid(int y, int x) {
            if (x < 0 || y < 0 || x > SizeX - 1 || y > SizeY -1 ) // проверка что мы не вывалились за пределы поля
                return false;
            return (field[y][x] == Empty_DOT);
        }

        // метод проверка на победу
    private static boolean checkWin(char sym) {
            // варианты по горизонтали
            if (field[0][0] == sym && field[0][1] == sym && field[0][2] == sym) return true;
            if (field[1][0] == sym && field[1][1] == sym && field[1][2] == sym) return true;
            if (field[2][0] == sym && field[2][1] == sym && field[2][2] == sym) return true;
            // варианты по вертикали
            if (field[0][0] == sym && field[1][0] == sym && field[2][0] == sym) return true;
            if (field[0][1] == sym && field[1][1] == sym && field[2][1] == sym) return true;
            if (field[0][2] == sym && field[1][2] == sym && field[2][2] == sym) return true;
            // варианты по диагонали
            if (field[0][0] == sym && field[1][1] == sym && field[2][2] == sym) return true;
            if (field[2][0] == sym && field[1][1] == sym && field[0][2] == sym) return true;
            return false;
    }

    // проверка что все поля заняты& Бежим по полю, и если есть свободная координата, возвращаем false иначе true
        private static boolean isFieldFull() {
            for (int i =0; i < SizeY; i++) {
                for (int j = 0; j < SizeX; j++) {
                    if (field[i][j] == Empty_DOT ) return false;
                }
            }
            return true;
        }

    public static void main(String[] args) {
            initField();
            printField();

            // игровой цикл
        while (true) {
            playerTurn();
            printField();
            if (checkWin(Player_DOT)) {
                System.out.print("Игрок победил");
                break;
            }
                if (isFieldFull()) {
                System.out.println("Ничья");
                break;
                }
                aiTurn();
            printField();
            if (checkWin(AI_DOT)) {
                System.out.print("Компьютер  победил");
                break;
            }
            if (isFieldFull()) {
                System.out.println("Ничья");
                break;
            }

        }
    }
}

/* ДЗ
1) переделать проверку победы из хардкода в с использованием циклов
2) расширит AI  через блокировку ходов игрока
*/