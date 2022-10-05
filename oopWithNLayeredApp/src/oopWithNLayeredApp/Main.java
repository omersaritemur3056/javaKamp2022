package oopWithNLayeredApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entites.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Product product1 = new Product(1, "I Phone XR", 10000);
		
		List<Logger> loggers = new ArrayList<>(Arrays.asList(new DatabaseLogger(), new FileLogger()));
		
		
		ProductManager productManager = new ProductManager(new JdbcProductDao(), loggers);
		productManager.add(product1);

	}

}
