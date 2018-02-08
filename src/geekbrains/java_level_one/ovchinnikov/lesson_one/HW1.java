package geekbrains.java_level_one.ovchinnikov.lesson_one;

import java.sql.SQLOutput;

public class HW1 {

        //  1 Прописать метод main
    public static void main(String[] args) {
        System.out.println("Задание 3");
        System.out.println(Calculate(3,2,4,5));
        System.out.println("");
        System.out.println("Задание 4");
        System.out.println(Sum(4, 6));
        System.out.println("");
        System.out.println("Задание 5");
        Posorneg(4);
        Posorneg(-2);
        System.out.println("");
        System.out.println("Задание 6");
        System.out.println(Neg(5));
        System.out.println(Neg(-4));
        System.out.println("");
        System.out.println("Задание 7");
        System.out.println("Чмо");
        System.out.println("");
        System.out.println("Задание 8");
        Year(2018);
        Year(2019);
        Year(202);

    }
    // 2 Создать переменные всех типов и инициализировать их значения
    static void Variable() {
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
    static int  Calculate(int a, int b, int c, int d) {
        if (d == 0) return 0;
         return a * (b + (c / d));
    }

    // 4 метод принимает 2 числа и проверяет что их сумма лежит в пределах от 10 до 20 если да treu иначе false
    static boolean Sum(int a, int b) {
        return ((a + b) >= 10 && (a + b) <= 20 );
    }

    //5 написать метод принимающий число и выводящий положительное или отрицательное число
    static void Posorneg(int e) {
        System.out.println(e + " - " + ((e<0)? "Отрицательное" : "Положительное"));
    }

    // 6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное
    static boolean Neg(int a) {
        return a < 0;
    }

    // 7 Написать метод, которому в качестве параметра передается строка,
    //*    обозначающая имя, метод должен вывести в консоль сообщение
    //*    «Привет, указанное_имя!»

    static void Str(String name){
        System.out.println("Привет, " + name + "!");
    }

    //8. Написать метод, который определяет является ли год високосным, и
    //* выводит сообщение в консоль. Каждый 4-й год является високосным,
    //* кроме каждого 100-го, при этом каждый 400-й – високосный.
    static void Year(int leap) {
        if (leap % 4 == 0 && leap % 100 != 0 || leap % 400 == 0) System.out.println(leap + " это высокостный год");
            else
        System.out.println(leap + " это не высокостный год");
    }
}
