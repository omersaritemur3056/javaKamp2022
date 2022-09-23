package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product();
		product.setId(1);
		product.setName("Laptop");
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		System.out.println(product.getName());
		product.getKod();
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);
		
		productManager.Add2(1, "", "", 2, 1111);
		
		
		System.out.println(product.getKod());
		
		Product product2 = new Product(2, "Hp", "Hp Laptop", 7000, 2, "Renk" );
		

	}

}
