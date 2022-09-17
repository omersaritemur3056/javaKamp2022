package stringsDemo;

public class Main {

	public static void main(String[] args) {
		
		//demo1(); //kodların tamamını işaretleyip sağ tık ile Refactor -> Extract method yapabiliriz.
		
		
		//demo2();
		

	}

	/**
	 * 
	 */
	private static void demo2() {
		String mesaj = "Bugün hava çok kötü.";
		System.out.println(mesaj);
		
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		
		System.out.println(mesaj.substring(2)); //baştan itibaren verilen sayı kadar keser.
		System.out.println(mesaj.substring(2, 5));//üstekine ilaveten 5. indexten sonrasını da keser
		
		for (String kelime : mesaj.split(" ")) { //split() verilen bir char'ı anahtar alıp onları gördüğü yerde kesim yapar. İstersek bunu bir array değişkenine de atayabiliriz ya da böyle for döngüsü...
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		
		System.out.println(mesaj.trim()); //bu operasyon metnin başındaki ve sonundaki boşlukları keser.
	}

	private static void demo1() {
		String message = "Bugün hava çok güzel.";
		System.out.println(message);
		
		System.out.println("Eleman sayısı = " + message.length());
		System.out.println("5. Eleman = " + message.charAt(4));
		System.out.println(message.concat(" Yaşasın!"));
		System.out.println(message.startsWith("B"));//true döner büyük 'B' ile başladığı için.
		System.out.println(message.endsWith("l"));
		
		char[] karakterler = new char[5];
		message.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		
		System.out.println(message.indexOf('a')); //küçük a ilk kaçıncı elemanda olduğunu bulur.
		//indexOf() metoduna char ya da strin veririz int sonuç alırız.
		System.out.println(message.lastIndexOf("e"));
	}

}
