package kodlama.ioDemo.dataAccess.concretes.hibernate;

import kodlama.ioDemo.dataAccess.abstracts.CategoryDao;
import kodlama.ioDemo.entites.concretes.Category;

public class HibernateCategoryDao implements CategoryDao {

	@Override
	public void save(Category category) {
		System.out.println(category + " Hibernate ile eklendi.");
		
	}

}
