package geekbrains.java_level_one.ovchinnikov.lesson_one;

/**
 * крестики нолики с AI
 */

public class HW3 {

    // переменные ртвечает за создание статического игрового поля
    static final int SizeX = 3;
    static final int SizeY = 3;
    static char[][] field = new char[SizeY][SizeX];

    static final char Player_DOT = 'X'; // поле игрока
    static final char AI_DOT = '0'; // поле компьютера
    static final char Empty_DOT = '.';  // пустое поле

        // метод initField создает пустое поле установленного размера и заполняет его пустыми значениями
        private static void initField() {
            for (int i =0; i < SizeY; i++) // по столбцу так как идет сверху вниз
                for (int j = 0; j < SizeX; j++) // по строке
                    field[i][j] = Empty_DOT;
        }

        // метод показывает поле пользовател
        private static void printField() {
            System.out.println("---------");
            for (int i =0; i < SizeY; i++) { // по столбцу так как идет сверху вниз
                for (int j = 0; j < SizeX; j++) // по строке
                    System.out.print(field[i][j] + " |");
                System.out.println();
            }
            System.out.println("---------");
        }

    public static void main(String[] args) {
            initField();
            printField();
    }
}
