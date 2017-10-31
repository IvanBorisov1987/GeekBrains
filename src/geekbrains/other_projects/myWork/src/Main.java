class Main{
public static void main(String args[]) { 

	double a; 
	double b;
	double c;
	double d;
	a = 128;
	System.out.println("a = " + a);
	b = a / 2;
	System.out.println("b = a / 2 = " + b);
	c = b * a;
	System.out.println("c = b * a = " + c);
	d = Math.sqrt(c);
	System.out.println("d = a / c = " + d);
}

//4
/**запуск двухмерного массива
public static void main(String[] args) {
	int array = 0;
	int [] [] tab = new int[3] [3];
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			tab[i][j] = array;
			System.out.println(tab[i][j] + " ");
			array++;
		}
	System.out.println();
	}
}
*/
//3 
/*/*public static void main(String[] args) {
	for (int i = 2, j = 8; i < j; i++, j--) {
		System.out.println("Значение i-j: " + i + "-" + j);
	}
}*/

//2
/*   создаем цикл с прибавлением y к 1, пока не дойдем до -20
public static void main(String[] args) { 
	int x = 1;
    for (int y = 2; y < 5; y++) {
    	System.out.println(x += y); }
   }
}

/1
/*создаем цикл от 0 до 4 {0,1,2,3,4}
public static void main(String[] args) { 
    for (int i = 0; i < 6; i++) {
	System.out.println("i = " + i); }
	System.out.println("Very cool"); 
   }
   */
}

