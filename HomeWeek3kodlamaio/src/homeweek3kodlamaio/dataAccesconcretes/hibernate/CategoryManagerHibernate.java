package homeweek3kodlamaio.dataAccesconcretes.hibernate;

import homeweek3kodlamaio.dataAccesabstract.CategoryDao;
import homeweek3kodlamaio.entities.Category;

public class CategoryManagerHibernate implements CategoryDao {

	@Override
	public void saveCategory(Category category) {
             System.out.println("Hibernte ile"+ category.getCategoryName() +" kaydedildi");		
	}

	@Override
	public void deleteCategory(int id) {
        System.out.println("Hibernate ile Kategori silindi");
		
	}

	@Override
	public boolean getByCategoryName(String categoryName) {
		// TODO Auto-generated method stub
		return false;
	}

}
