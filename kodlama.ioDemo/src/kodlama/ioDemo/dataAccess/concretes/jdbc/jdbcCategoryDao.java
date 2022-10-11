package kodlama.ioDemo.dataAccess.concretes.jdbc;

import java.util.ArrayList;
import java.util.List;

import kodlama.ioDemo.dataAccess.abstracts.CategoryDao;
import kodlama.ioDemo.entites.concretes.Category;

public class jdbcCategoryDao implements CategoryDao {

List<Category> categories = new ArrayList<>();
	
	@Override
	public void save(Category category) {
		categories.add(category);
		System.out.println(category.getCategoryName() + " JDBC ile eklendi.");
		
	}

	@Override
	public List<Category> getAll() {
		
		return categories;
	}

}
