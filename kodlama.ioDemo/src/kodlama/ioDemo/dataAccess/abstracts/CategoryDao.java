package kodlama.ioDemo.dataAccess.abstracts;

import java.util.List;

import kodlama.ioDemo.entites.concretes.Category;

public interface CategoryDao {

	void save(Category category);
	
	List<Category> getAll();
}
