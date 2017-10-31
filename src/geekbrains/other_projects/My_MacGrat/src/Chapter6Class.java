class Car {
    private String maker;
    private String color;
    private String bodyType;

    public Car() {
        maker = "Porsche ";
        color = "Серебристый ";
        bodyType = "купе";
    }

    private String accelerate() {
        String motion = "Ускоряется";
        return motion;
    }

    public void setCar(String brand, String paint, String style)
    {
        maker = brand;
        color = paint;
        bodyType = style;
    }

    public void getCar() {
        System.out.println(maker + "цвет " + color);
        System.out.println(maker + "тип кузова " + bodyType);
        System.out.println(maker + " " + accelerate() + "\n");
    }

}

class Constructor {

    public static void main(String[] args) {
        Car Porsche = new Car();
        Porsche.getCar();

        Car Ferrari = new Car();
        Ferrari.setCar("Ferrari ", "Красный", "Спортивный");
        Ferrari.getCar();

}

}





/* class Car { /// инкапсуляция
    private String maker;
    private String color;
    private String bodyType;

    private String accelerate()
    {
        String motion = "Ускоряется ";
        return motion;
    }

    public void setCar (String brand, String paint, String style)
    {
        maker = brand;
        color = paint;
        bodyType = style;
    }

        public void getCar()
        {
            System.out.println(maker + "цвет " + color);
            System.out.println(maker + "тип кузова " + bodyType);
            System.out.println(maker + " " + accelerate() + "\n");
        }
}

class SafeInstance {
    public static void main(String[] args)
    {
        Car Porsche = new Car();
        Porsche.setCar("Порше: ", "Красный ", "Купе ");
        Porsche.getCar();

        Car Bentley = new Car();
        Bentley.setCar("Бентли: ", "Зеленый ", "Седан ");
        Bentley.getCar();
    }
} */

/* class Car { создание объектового класса
    private String maker;
    private String color;
    private String bodytype;

    public Car() {
        maker = "Porshe ";
        color = "Серебристый";
        bodytype = "Купе";
    }

    private String accelerate()
    {
        String motion = "Ускоряется...";
        return motion;
    }

    public void setCar(String brand, String paint, String style)
    {
        maker = brand;
        color = paint;
        bodytype = style;
    }

    public void getCar()
    {
        System.out.println(maker + "цвет " + color);
        System.out.println(maker + "тип кузова " + bodytype);
        System.out.println(maker + " " + accelerate() + "\n");
    }
    }


    class Constructor
    {
    public static void main(String[] args)
    {
        Car Porshe = new Car();
        Porshe.getCar();

        Car Ferrari = new Car();
        Ferrari.setCar("Ferrari ", "Красный", "Спортивный");
        Ferrari.getCar();
    }
    } */

    /* использование множественных классов
    public static void main(String [] args) {
    String msg = "Это локальная переменная класса Chapter6class";
    System.out.println(msg);
    System.out.println(Data.txt);

        Data.greeting();
        Draw.line();

    }
}

class Data {
     final static String txt = "Это глобальная переменная класса Data";
     static void greeting()
    {
        System.out.print("Это глобальный метод");
        System.out.println("класса Data");
    }
}

class Draw {
    static void line()
    {
        System.out.println("_________________");
    } */

    /* Область видимости
    final static String txt = "Это глобальная переменная класса";

    public static void main(String[] args) {
        String txt = "Это локальная переменная метода main";
        System.out.println(txt);
        sub();
        Syste m.out.println(Chapter6Methods.txt);
    }

    public static void sub() {
        ///String txt = "Это локальная переменная метода sub";
        System.out.println(txt);
    } */
