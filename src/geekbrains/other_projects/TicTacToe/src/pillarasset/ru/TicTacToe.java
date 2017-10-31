package pillarasset.ru;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    static final int SIZEX = 3;
    static final int SIZEY = 3;
    static char[][] field = new char[SIZEX][SIZEY];

    static final char PLAYER_DOT = 'X';
    static final char DOT_AI = 'O';
    static final char EMPTY_DOT = '.';
    static Scanner scanner = new Scanner(System.in);
    static final Random rand = new Random();


    private static void initField() {
        for (int i = 0; i < SIZEY; i++)
            for (int j = 0; j < SIZEX; j++)
                field[i][j] = EMPTY_DOT;
    }

    private static void printField() {   //рисование поля
        System.out.println("-------");
        for (int i = 0; i < SIZEY; i++) {
            System.out.print("|");
            for (int j = 0; j < SIZEX; j++)
                System.out.print(field[i][j] + "|");
            System.out.println();
        }
        System.out.println();
    }

    private static void setSym(int y, int x, char sym) {
        field[y][x] = sym;
    }

    private static void playerTurn() {  // ход человека
        int x;
        int y;
        do {
            System.out.println("Введите координаты");
             x = scanner.nextInt() - 1;
             y = scanner.nextInt() - 1 ;
        } while (!isCellValid(y, x));
        setSym(y, x, PLAYER_DOT);
    }

    private static boolean isCellValid(int y, int x) { // верны ли координаты вводимых яеек
        if (x < 0 || y < 0 || x > SIZEX - 1 || y > SIZEY - 1) return false;
        return (field[y][x] == EMPTY_DOT);
    }

    private static void aiTurn() {  //ход компьбтера
        int x;
        int y;
        do {
            x = rand.nextInt(SIZEX);
            y = rand.nextInt(SIZEY);
        } while (!isCellValid(y, x));
        setSym(y, x, DOT_AI);
    }

    private static boolean checkWin(char sym) { //проверка на победу
        if (field[0][0] == sym && field[0][1] == sym && field[0][2] == sym)return true;
        if (field[1][0] == sym && field[1][1] == sym && field[1][2] == sym)return true;
        if (field[2][0] == sym && field[2][1] == sym && field[2][2] == sym)return true;

        if (field[0][0] == sym && field[1][0] == sym && field[2][0] == sym)return true;
        if (field[0][1] == sym && field[1][1] == sym && field[2][1] == sym)return true;
        if (field[0][2] == sym && field[1][2] == sym && field[2][2] == sym)return true;

        if (field[0][0] == sym && field[1][1] == sym && field[2][2] == sym)return true;
        if (field[2][0] == sym && field[1][1] == sym && field[0][0] == sym)return true;
        return false;
    }

    private static boolean isFieldFull() { //проверка поля на заполненность
        for (int i = 0; i < SIZEY; i++) {
            for (int j = 0; j < SIZEX; j++) {
                if (field[i][j] == EMPTY_DOT) return false;
            }
        }
        return true;
    }

    public static void main(String [] args) {
        initField();
        printField();

        while (true) {
            playerTurn();
            printField();
            if (checkWin(PLAYER_DOT)) {
                System.out.println("ПОбедил игрок");
                break;
            }
            if ((isFieldFull())) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printField();
            if (checkWin(DOT_AI)) {
                System.out.println("Победил ИИ");
            }
        }
    }
}