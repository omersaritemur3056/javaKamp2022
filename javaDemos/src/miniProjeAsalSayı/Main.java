package miniProjeAsalSayı;

public class Main {

	public static void main(String[] args) {
		
		int number = 2;
		//int remainder = number % 2;
		//System.out.println(remainder);
		
		boolean isPrime = true;
		if (number < 2) {
			System.out.println("Geçersiz sayı");
			return;
		}else if(number == 2) {
			System.out.println(number + " sayısı asal değildir");
			return;
		}
		
		
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}
		
		if (isPrime) {
			System.out.println(number + " sayısı asaldır");
		}else {
			System.out.println(number + " sayısı asal değildir.");
		}
	}

}
