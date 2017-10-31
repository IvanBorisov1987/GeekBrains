package geekbrains.java_level_one.irupin.lesson_one;

/**
* Java. Level 1. Lesson 1. Homework 1.
*@author Ivan Borisov
*@version dated Jul 29, 2017
* i9616271555@yandex.ru
*/
class HW1Less {
	public static void main(String[] args) {
		System.out.println("HW1Less");
		createVar();
		System.out.print(calculate(3,6,9,12));
		System.out.print(sum(4,8));
		PosorNeg(-5);
		PosorNeg(7);
		System.out.println(Negativepoint(-3));
		System.out.println(Negativepoint(2));
		System.out.println("Vasia");
		LeapYear(1800); // делятся на 100
        LeapYear(2000); // делятся на 400
        LeapYear(2012); // на 4, но не делятся на  100
	}

/**
*2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
* byte, short, int, long, float, double, char, boolean, string
*/
static void createVar() {
	byte b  = 10;
	short s = 11000;
	int i = 200000;
	long l =  92233720909899999L;
	float f = 120.0f;
	double d = 14.43123;
	boolean bl = true;
	char c = 'c';
	String str = "Hi";
}

/**
*3. Написать метод вычисляющий выражение a * (b + (c / d)) 
* и возвращающий результат,где a, b, c, d – входные параметры этого метода;
*/
static int calculate(int a, int b, int c, int d) {
	if (d == 0) return 0;
	return a * (b + (c / d));
}

/**
*4. Написать метод, принимающий на вход два числа, 
*и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), 
*если да – вернуть true, в противном случае – false;
*/
static boolean sum(int a, int b) {
	return ((a + b >= 10) && (a + b <= 20));
}

/**
*5. Написать метод, которому в качестве параметра передается целое число, 
* метод должен напечатать в консоль положительное ли число передали, 
* или отрицательное; Замечание: ноль считаем положительным числом.
*/

static void PosorNeg(int a) {
	System.out.println(a + " is " + ((a<0)? "Neg" : "Pos"));
}

/**
* 6. Написать метод, которому в качестве параметра передается целое число,
*    метод должен вернуть true, если число отрицательное
*/
static boolean Negativepoint(int a) {
	return a < 0;
}

/**
* 7. Написать метод, которому в качестве параметра передается строка,
*    обозначающая имя, метод должен вывести в консоль сообщение
*    «Привет, указанное_имя!»
*/
static void Yourname(String name) {
	System.out.println("Привет, " + name + "!");
	}
/**
* 8. Написать метод, который определяет является ли год високосным, и
* выводит сообщение в консоль. Каждый 4-й год является високосным,
* кроме каждого 100-го, при этом каждый 400-й – високосный.
*/

static void LeapYear(int y) {
	if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
		System.out.println(y + "высокосный год");
	else 
		System.out.println(y + "не высокосный год");
	}
}