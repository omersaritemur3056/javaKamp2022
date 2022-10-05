package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entites.Product;

public class HibernateProductDao implements ProductDao {

	public void add(Product product) {
		System.out.println(product.getName() + " Hibernate ile veritabanına eklendi");
	}
}
