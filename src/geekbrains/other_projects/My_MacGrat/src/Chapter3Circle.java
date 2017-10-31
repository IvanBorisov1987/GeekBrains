class Circle {
	public static void main(String[] args) {
		circleLabel();
		circleBreak();
		circleDowWile();
		circleWhile();
		circleFor();
		branchSwitch();
		branchElse();
		branchIf();
	}


	static void circleLabel() { // возврат управление
	   outerLoop : for (int i = 1; i < 4; i++)
        {
            for (int j = 1; j < 4; j++)

            {
                if (i == 2 && j == 3)
                {
                    System.out.println("Выход из OutLoop при i = " +i+ " j=" +j);
                    break outerLoop;
                }
                if (i == 1 && j == 1)
            {
                System.out.println("OutLoop продалжает работу при i=" + i+ " j=" + j);
                continue outerLoop;
            }
                System.out.println("Итерация i=" + i + " j=" + j);
            }
        } System.out.println();
    }


	static void circleBreak() {  /// прерывание цикла
	    for (int i = 1; i < 4; i++)
	        {
	             for (int j = 1; j < 4; j++)
	                {
	                    if (i == 2 && j == 1)
                        {
                            System.out.println("Выход из внутреннего цикла при i = " + i + " j = " + j);
                            break;
                        }
                        if (i == 1 && j == 1)
                        {
                            System.out.println("Продолжение работы внутреннего цикла при i =" + i + " j=" + j);
                            continue;
                        }
	                     System.out.println("Итерация i = " + i + " j = " + j);
                    }
        } System.out.println();
    }


	static void circleDowWile() { /// работа цикла DoWhile
        int num = 100;
        do {
            System.out.println("Используем DoWhile: " + num);
            num += 10;
        } while (num < 0 );

        System.out.println();
    }


	static void circleWhile() { /// работа цикла While
	    int num = 100;
	    while (num > 0) {
	        System.out.println("Обратный отчет с использованием While: " + num);
	        num -=10;
        } System.out.println();
    }


	static void circleFor() { // цикл For
	    int num = 0;
	    for (int i = 1; i < 4; i++) {
	        System.out.println("Внешний цикл i = " + i);
	        for (int j = 1; j < 4; j++) {
	            System.out.println("\tВнутренний цикл j = " + j);
                System.out.println("\t\tВсего num = " + (++num));
            }
        } System.out.println();
    }


	static void branchSwitch() { /// ветвление с помощью переключателей

		int month = 2, year = 2016, num = 31 ;

		switch (month) {
			case 4: case 6: case 9: case 11: num = 30 ; break;
			case 2: num = (year % 4 == 0) ? 29 : 28; break;
		}
		System.out.println(month + "/ " + year + ": " + num + " дней");
        System.out.println();
	}


	static void branchElse() {   /// операторы альтернативного ветвления

		int hrs = 21;
		if (hrs < 13) {   /// если
			System.out.println("Доброе утро: " + hrs);
		} else if (hrs < 18) { /// иначе если
			System.out.println("Добрый день: " + hrs);
		} else System.out.println("Добрый вечер: " + hrs); ///
        System.out.println();
	}


	static void branchIf() {
	    int num = 8;

	    if (((num > 5) && (num < 10)) || (num == 12))
	        System.out.println("Число в диапазоне от 6 до 9 включительно или равно 12");

		if (5 > 1)
			System.out.println("Пять больше чем один");
		if (3 < 4)
			System.out.println("Два меньше четырех");
		System.out.println("Проверка выполнена успешно");
	}
}