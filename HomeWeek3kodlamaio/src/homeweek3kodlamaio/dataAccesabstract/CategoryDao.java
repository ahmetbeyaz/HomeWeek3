package homeweek3kodlamaio.dataAccesabstract;

import homeweek3kodlamaio.entities.Category;

public interface CategoryDao {
	
	public void saveCategory(Category category);
	
	public void  deleteCategory(int id);
	
	public boolean  getByCategoryName(String categoryName);

}
