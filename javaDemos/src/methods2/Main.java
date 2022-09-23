package methods2;

public class Main {

	public static void main(String[] args) {
		
		String mesaj = "Bugün hava çok güzel";
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		
		int sayi = topla(5, 7);
		System.out.println(sayi);
		
		int toplam = topla2(10,9,8,7,6,5,4,3,2,1);
		System.out.println(toplam);
	}
	
	public static void ekle() {
		System.out.println("Eklendi");
	}
	
	public static void sil() {
		System.out.println("Silindi");
	}
	
	public static void güncelle() {
		System.out.println("Güncellendi");
	}
	
	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	
	public static String sehirVer() {
		return "Ankara";
	}
	
	public static int topla2(int... sayilar) { //parametre tipinin yanındaki üç nokta Java dilinde arkaplanda o değişkene verilebilecek değerleri arraye çevirir
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam += sayi;
		}
		
		return toplam;
		
	}

}
