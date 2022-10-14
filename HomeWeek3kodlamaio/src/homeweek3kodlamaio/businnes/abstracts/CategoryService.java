package homeweek3kodlamaio.businnes.abstracts;

import homeweek3kodlamaio.entities.Category;

public interface CategoryService {
	
	public void addCategory(Category category) throws Exception;
	
	public void deleteCategory(int id);

}
