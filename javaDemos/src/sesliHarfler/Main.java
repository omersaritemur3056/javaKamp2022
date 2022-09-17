package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		
		char harf = 'h';
		
		switch (harf) {
		case 'A':
		case 'a':
		case 'I':
		case 'ı':
		case 'O':
		case 'o':
		case 'U':
		case 'u':
			System.out.println(harf + " kalın seslidir.");
			break;
		case 'E':
		case 'e':
		case 'İ':
		case 'i':
		case 'Ö':
		case 'ö':
		case 'Ü':
		case 'ü':
			System.out.println(harf + " ince seslidir.");
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + harf);
		}

	}

}
