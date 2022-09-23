package reCapDemo_Classes;

public class DortIslem {

	public int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	
	public int cikar(int sayi1, int sayi2) {
		return sayi1 - sayi2;
	}
	
	public int carp(int sayi1, int sayi2) {
		return sayi1 * sayi2;
	}
	
	public int bolme(int sayi1, int sayi2) throws Exception {
		if (sayi2 ==0) {
			throw new Exception("sayı2 0 girilemez");
		}
		return sayi1 / sayi2;
	}
	
	
	
}
