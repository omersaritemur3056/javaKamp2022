package classes;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.add();
		
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;
		
		
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1=30;
		System.out.println(sayi2);
		
		int[] sayilar = new int[] {1,2,3};
		int[] sayilar2 = new int[] {1,2,3};
		sayilar2 = sayilar;
		sayilar[0] = 10;
		System.out.println(sayilar2[0]);
		
		

	}

}


