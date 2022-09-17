package recapDemo1;

public class Main {

	public static void main(String[] args) {
		
		int sayi1 = 2900;
		int sayi2 =2510;
		int sayi3 = 2900;
		
		if (sayi1 > sayi2 && sayi1 > sayi3) {
			System.out.println("Sayı 1 en büyüktür.");
		}else if (sayi2 > sayi1 && sayi2 > sayi3) {
			System.out.println("Sayı 2 en büyüktür.");
		}else if(sayi3 > sayi2 && sayi3 > sayi1){
			System.out.println("Sayı 3 en büyüktür.");
		}else {
			System.out.println("sayılar arasında eşitlik söz konusu...");
		}
	}

}
