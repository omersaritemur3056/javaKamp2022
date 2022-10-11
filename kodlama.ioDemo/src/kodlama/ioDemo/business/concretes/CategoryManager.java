package kodlama.ioDemo.business.concretes;

import java.util.List;

import kodlama.ioDemo.business.abstracts.CategoryService;
import kodlama.ioDemo.core.Logger;
import kodlama.ioDemo.dataAccess.abstracts.CategoryDao;
import kodlama.ioDemo.entites.concretes.Category;

public class CategoryManager implements CategoryService {

	private CategoryDao categoryDao;
	private List<Logger> loggers;
	
	public CategoryManager(CategoryDao categoryDao, List<Logger> loggers) {
		super();
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}

	@Override
	public void add(Category category) throws Exception {
		
		for (Category inDbCategory : categoryDao.getAll()) {
			if (inDbCategory.getCategoryName() == category.getCategoryName()) {
				throw new Exception("Kategori ismi tekrar edemez");
			}
		}
		
		categoryDao.save(category);
		
		for (Logger logger : loggers) {
			logger.log();
		}
	}
	
	

}
