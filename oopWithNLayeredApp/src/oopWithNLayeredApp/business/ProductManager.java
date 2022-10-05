package oopWithNLayeredApp.business;


import java.util.List;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entites.Product;

public class ProductManager {
	
	private ProductDao productDao;
	private List<Logger> loggers;

	public ProductManager(ProductDao productDao, List<Logger> loggers) {
		
		this.productDao = productDao;
		this.loggers = loggers;
	}

	public void add(Product product) throws Exception {
		
		if (product.getUnitPrice() < 10) {
			throw new Exception("Ürün fiyatı 10'dan küçük olamaz");
		}
		
		//ProductDao productDao = new HibernateProductDao();
		productDao.add(product);
		
		for (Logger logger : loggers) {
			logger.log(product.getName());
		}
	}
}
