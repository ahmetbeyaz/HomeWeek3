package homeweek3kodlamaio.businnes.concretes;

import homeweek3kodlamaio.businnes.abstracts.CategoryService;
import homeweek3kodlamaio.core.logging.LogHelper;
import homeweek3kodlamaio.dataAccesabstract.CategoryDao;
import homeweek3kodlamaio.entities.Category;

public class CategoryManager implements CategoryService {
	
	CategoryDao categoryDao;
	LogHelper logHelper;
	
	   public CategoryManager(CategoryDao categoryDao, LogHelper logHelper) {
		this.categoryDao = categoryDao;
		this.logHelper=logHelper;
	}
		

	@Override
	public void addCategory(Category category) throws Exception {
          if(categoryDao.getByCategoryName(category.getCategoryName())== false){
        	  categoryDao.saveCategory(category);
        	  logHelper.log(category.getCategoryName());
        	  
          }else {
			throw new Exception("Kategori eklenemedi");
		}
	}

	@Override
	public void deleteCategory(int id) {
		categoryDao.deleteCategory(id);

		
	}

}
