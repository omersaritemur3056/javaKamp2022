package kodlama.ioDemo.dataAccess.concretes.hibernate;

import java.util.ArrayList;
import java.util.List;

import kodlama.ioDemo.dataAccess.abstracts.CategoryDao;
import kodlama.ioDemo.entites.concretes.Category;

public class HibernateCategoryDao implements CategoryDao {

	List<Category> categories = new ArrayList<>();
	
	@Override
	public void save(Category category) {
		categories.add(category);
		System.out.println(category.getCategoryName() + " Hibernate ile eklendi.");
		
	}

	@Override
	public List<Category> getAll() {
		
		return categories;
	}


}
