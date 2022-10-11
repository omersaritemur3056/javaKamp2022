package staticDemo;

public class ProductManager {
	
	public ProductManager() {
		System.out.println("Yapıcı blok çalıştı");
	}

	public void add(Product product) {
		
		if (ProductValidator.isValid(product)) {
			System.out.println("Eklendi");
		}else {
			System.out.println("Ürün bilgileri geçersiz.");
		}
		
		ProductValidator productValidator = new ProductValidator();
		productValidator.bisey();
		
		
		
	}
}
