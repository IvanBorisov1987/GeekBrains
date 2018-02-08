package geekbrains.java_level_one.ovchinnikov.lesson_one;

public class HW1 {

        //  1 Прописать метод main
    public static void main(String[] args) {
        System.out.print(calculate(3,2,4,5));
        System.out.println(sum(4, 6));
        posorneg(4);
        posorneg(-2);
        System.out.println(neg(5));


    }
    // 2 Создать переменные всех типов и инициализировать их значения
    static void variable() {
        byte b = 0;                 // целое число от -128 до 127
        short sh = 1 + 2;           // целое число от -32768 до 32767
        int i = 0;                  // целое число от -2147483648 до 2147483647
        long l = 4000000000000L;    // число с плавающей запятой
        float f = 5.124543413f;     // число с плавающей запятой
        double d = 5.12345432;      // число с остатком от деления
        char c = 'A';               //символьный тип
        String str = "Hello world"; // Любое количество символов в юникоде
        boolean flstr = true;       // логическое значение типа false или true
    }

    // 3 написать метод вычисляющий (a*(b+(c/d)) и возвращающий результат
    static int  calculate(int a, int b, int c, int d) {
        if (d == 0) return 0;
         return a * (b + (c / d));
    }

    // 4 метод принимает 2 числа и проверяет что их сумма лежит в пределах от 10 до 20 если да treu иначе false
    static boolean sum(int a, int b) {
        return ((a + b) >= 10 && (a + b) <= 20 );
    }

    //5 написать метод принимающий число и выводящий положительное или отрицательное число
    static void posorneg(int e) {
        System.out.println(e + " is " + ((e<0)? "Neg" : "Pos"));
    }

    // 6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное
    static boolean neg(int a) {
        return (a < 0);
    }
}
