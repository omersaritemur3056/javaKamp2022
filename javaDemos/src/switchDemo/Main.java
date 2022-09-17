package switchDemo;

public class Main {

	public static void main(String[] args) {
		
		char grade = 'A';
		
		switch(grade) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'B':			
		case 'C':
			System.out.println("İyi : Geçtiniz");
			break;
		case 'D':
			System.out.println("İdare eder... : Geçtiniz");
			break;
		case 'F':
			System.out.println("Üzgünüm... : Kaldınız.");
			break;
			default:
				System.out.println("Geçersiz not girdiniz.");
		}

	}

}
