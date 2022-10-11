package staticDemo;

public class ProductValidator {
	
	static {
		System.out.println("static yapıcı blok çalıştı");
	}

	public static boolean isValid(Product product) {
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		}else {return false;}
		
	}
	
	public void bisey() {
		
	}
	
	
	public class BaskabirClass{
		public static void sil() {
			
		}
	}
}
