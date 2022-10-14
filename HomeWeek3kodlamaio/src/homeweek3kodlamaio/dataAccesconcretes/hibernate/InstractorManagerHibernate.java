package homeweek3kodlamaio.dataAccesconcretes.hibernate;

import homeweek3kodlamaio.dataAccesabstract.InstractorDao;
import homeweek3kodlamaio.entities.Instractor;

public class InstractorManagerHibernate implements InstractorDao {



	@Override
	public void deleteUser(int id) {
           System.out.println("Hibernate ile kullanıcı silindi ");		
	}

	@Override
	public void addUser(Instractor t) {
          System.out.println("Hibernate ile"+t.getName()+"Instractor kaydedildi");		
	}

}
