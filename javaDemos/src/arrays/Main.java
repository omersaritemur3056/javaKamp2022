package arrays;

public class Main {

	public static void main(String[] args) {
		
		String[] ogrenciler = new String[3];
		ogrenciler[0] = "Ömer";
		ogrenciler[1] = "Ümit";
		ogrenciler[2] = "Faruk";
		
		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		
		System.out.println("----------------------------");
		
		
		String[] people = {"Ömer", "Ümit", "Faruk", "Nazmiye"};
		
		for (String person : people) {
			System.out.println(person);
		}

	}

}
