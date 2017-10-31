/**
* Java. Level 1. Lesson 5. Homework 1.
*@author Ivan Borisov
*@version dated Aug 11, 2017
* i9616271555@yandex.ru
*/
class HW5Less {

	public static void main(String[] args) {
		Person[] persArray = new Person[5]; // объявление нового массива
		persArray[0] = new Person("Conor McGregor", "Fighter", "conor@ya.com", "89105678943", 4000000, 29);
		persArray[1] = new Person("Lance Armstrong", "Cyclist", "velik@gmail.com", "80986749033", 2500000, 45);
		persArray[2] = new Person("Drew Brees", "Quaterback", "neworlean@yahoo.com", "09873214637", 14000000, 38);
		persArray[3] = new Person("Richie McCaw", "Flanker", "allblacks@nz.gov.com", "19843895473", 500000, 36);
		persArray[4] = new Person("Usaian Bolt", "Sprinter", "thefastest@jamaica.com", "49874071234", 600000, 30);

		for (Person person : persArray)
			if (person.getAge() > 35)
				System.out.println(person);
	}
}

	class Person {
		private String name; //ФИО
		private String position; //должность
		private String mail; //email
		private String telephone; //телефон
		private double salary; //оклад
		private int age; //возраст

		Person(String name, String position, String mail, String telephone, double salary, int age) {
			this.name = name;
			this.position = position;
			this.mail = mail;
			this.telephone = telephone;
			this.salary = salary;
			this.age = age;
		}
        
        int getAge() {
        	return age;
        }
		@Override
		public String toString() { //метод toString
			return (name +
				"\n! Position: " + position +
				"\n! Mail: " + mail +
				"\n! Telephone: " + telephone +
				"\n! Salary: " + salary +
				"\n! Age: " + age);
		}
	}