package kodlama.ioDemo.business.concretes;

import kodlama.ioDemo.business.abstracts.CategoryService;
import kodlama.ioDemo.dataAccess.abstracts.CategoryDao;
import kodlama.ioDemo.entites.concretes.Category;

public class CategoryManager implements CategoryService {

	private CategoryDao categoryDao;
	
	
	public CategoryManager(CategoryDao categoryDao) {
		super();
		this.categoryDao = categoryDao;
	}


	@Override
	public void add(Category category) {
		// TODO Auto-generated method stub
		
	}

}
