package loops;

public class Main {

	public static void main(String[] args) {
		
		//For
		for (int i = 1; i < 10; i = i + 2) {
			System.out.println(i);
		}
		
		System.out.println("For döngüsü bu yazıda bitmiştir, While döngüsü başlamıştır.");
		
		//While
		int i = 1;
		while (i < 10) {
			System.out.println(i);
			i+=2;
		}
		
		System.out.println("While döngüsü bu yazıda bitmiştir, Do-While döngüsü başlamıştır.");
		
		//Do-While Do bloğu şart sağlanmasa bile çalışır.
		int j = 20; 
		do {
			System.out.println(j);
			j++;
		} while (j<10);
		
		System.out.println("Do-While döngüsü bu yazıda bitmiştir.");

	}

}
