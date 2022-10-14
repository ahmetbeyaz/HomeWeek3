package homeweek3kodlamaio.dataAccesconcretes.jdbc;

import homeweek3kodlamaio.dataAccesabstract.CategoryDao;
import homeweek3kodlamaio.entities.Category;

public class CategoryManagerJdbc implements CategoryDao {

	@Override
	public void saveCategory(Category category) {
            System.out.println("Jdbc ile" + category.getCategoryName()+"kaydedildi");		
	}

	@Override
	public void deleteCategory(int id) {

		System.out.println("jdbc ile silindi");
	}

	@Override
	public boolean getByCategoryName(String categoryName) {
		// TODO Auto-generated method stub
		return false;
	}

}
