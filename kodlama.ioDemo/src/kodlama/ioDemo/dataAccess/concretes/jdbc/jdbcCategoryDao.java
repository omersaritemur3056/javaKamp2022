package kodlama.ioDemo.dataAccess.concretes.jdbc;

import kodlama.ioDemo.dataAccess.abstracts.CategoryDao;
import kodlama.ioDemo.entites.concretes.Category;

public class jdbcCategoryDao implements CategoryDao {

	@Override
	public void save(Category category) {
		System.out.println(category + " JDBC ile eklendi");
		
	}

}
