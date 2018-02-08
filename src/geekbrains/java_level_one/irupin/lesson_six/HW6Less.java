/**
* Java. Level 1. Lesson 6. Homework 1.
*@author Ivan Borisov
*@version dated Aug 13, 2017
* i9616271555@yandex.ru
*/

/*
1. Создать классы Собака и Кот с наследованием от класса Животное.
2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие. В качестве параметра каждому методу передается величина, 
означающая или длину препятствия (для бега и плавания), или высоту (для прыжков).
3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м., собака 0.5 м.; 
плавание: кот не умеет плавать, собака 10 м.).
4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль. 
(Например, dog1.run(150); -> результат: run: true)
5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.
*/



class HW6Less {

    public static void main(String[] args) {
        Animal cat = new Cat("Vasil", "red", 5);
        //System.out.println(cat + " say " + cat.voice());
        Animal dog = new Dog("Sharik", "black", 7);
        //System.out.println(dog + " say " + dog.voice());

        Animal[] animal = {cat, dog};
        for (Animal an : animal)
            System.out.println(an + " say " + an.voice());

        //Animal animal = new Animal("", "", -1); // forbidden!
    }
}

class Cat extends Animal {
    Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    String voice() {
        return "meow!";
    }
}

class Dog extends Animal {
    Dog(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    String voice() {
        return "vuf-vuf!";
    }
}

abstract class Animal {
    private String name;
    private String color;
    private int age;

    Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    abstract String voice();

    @Override
    public String toString() {
        return getClass().getName() + " " + name + " " + color + " " + age;
    }
}