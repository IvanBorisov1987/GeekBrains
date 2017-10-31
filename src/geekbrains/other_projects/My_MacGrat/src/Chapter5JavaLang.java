public class Chapter5JavaLang {
    private static String[] args;

    public static void main (String [] args) {
        createCharacterSwap(); // Обработка символов
        createStringSearch(); // Search strings
        compariseStrings(); // Сравнение строк - только для консоли
        managetoString(); // management of strings
        createLottery(); // generation of lottery from 0 before 10
        createRandom(); // random number generation
        createCompare(); // determenation of min and max
        createRound();  // round of number up and down
    }


    static void createCharacterSwap() {
        String txt = "";

        if (txt.isEmpty()) txt = "   Боррокудо    ";

        System.out.println("Строка: " + txt );
        System.out.println("Длина первоначальной строки: " + txt.length() );

        txt = txt.trim();
        System.out.println("Строка: " + txt );
        System.out.println("Длина строки: " + txt.length() );

        char initial = txt.charAt(0);
        System.out.println("Первая буква " + initial );

        initial = txt.charAt( (txt.length() -1) );
        System.out.println("Последняя буква " + initial );

        txt = txt.replace('o', 'a');
        System.out.println("Строка " + txt );

        System.out.println();
    }



static void createStringSearch() {
        String[] books =
                { "Java in easy steps", "XML in easy steps",
                        "HTML in easy steps", "CSS in easy steps",
                        "Gone With the Wind", "Drop the Defense" };

        int counter1 = 0, counter2 = 0, counter3 = 0;

        for (int i = 0; i < books.length; i++)
    {
        System.out.print(books[i].substring(0,4) + "| ");
        if (books[i].endsWith("in easy steps")) counter1++;
        if (books[i].startsWith("Java")) counter2++;
        if (books[i].indexOf("easy") == -1) counter3++;
    }
    System.out.println("\nНайдено " + counter1 + " названий из этой серии");
    System.out.println("Найдено " + counter2 + " названий с java");
    System.out.println("Найдено " + counter3 + " других названий");
    System.out.println();
}


    static void compariseStrings() {
        String password = "bingo";

        try
        {
            if( args[0].toLowerCase().equals(password) ) // оценка введенного аргумента с консоли!!!!
            {
                System.out.println("Пароль подтвержден");
            }
            else
            {
                System.out.println("Неверный пароль");
            }
        }
        catch (Exception e)
        {
            System.out.println("Требуется ввод пароля");
        }
        System.out.println();
    }


    static void managetoString() {
        String lang = "Java";
        String series = "in easy steps";

        String title = lang.concat(series);
        System.out.print("\"" + title + "\" содержит");
        System.out.println(title.length() + " символов");
        System.out.println();
    }


    static void createLottery() {
        int[]nums = new int[50];

        for (int i = 1; i < 50; i++) {nums[i] = i; }

        for (int i = 1; i < 50; i++) {
            int r = (int) Math.ceil(Math.random()*49);
            int temp = nums[i]; nums[i] = nums[r]; nums[r] = temp; }

            for (int i = 1; i < 7; i++)
            {
                System.out.print(Integer.toString(nums[i]) + " ");
            } System.out.println();
        System.out.println();
        }



    static void createRandom() {
        float random = (float) Math.random();
        System.out.println("Случайное число: " + random);

        float muliplied = random * 10;
        System.out.println("Умножение на 10 " + muliplied);

        int randomInt = (int) Math.ceil(muliplied);
        System.out.println("Случайное целое " + randomInt);
        System.out.println();
    }


    static void createCompare() {
        float num1 = 24.75f;
        float num2 = 25;

        System.out.println("Наибольшее: " + Math.max(num1, num2));
        System.out.println("Наименьшее: " + Math.min(num1, num2));

        System.out.println();
    }


    static void createRound()  {
        float num = 7.25f;
        System.out.println(num + " округление равно " + Math.round(num));

        System.out.println(num + " окргуленное вниз равно " + Math.floor(num));
        System.out.println(num + " окргуленное вниз вверх " + Math.ceil(num));
    }
}
