package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entites.Product;

public class JdbcProductDao implements ProductDao {

	public void add(Product product) {
		System.out.println(product.getName() + " JDBC ile veritabanına eklendi");
	}
}
