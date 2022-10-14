package homeweek3kodlamaio.dataAccesconcretes.jdbc;

import homeweek3kodlamaio.dataAccesabstract.InstractorDao;
import homeweek3kodlamaio.entities.Instractor;

public class InstractorManagerJdbc implements InstractorDao {



	@Override
	public void deleteUser(int id) {
  System.out.println("jdbc ile silindi");		
	}

	@Override
	public void addUser(Instractor t) {
		System.out.println("JDBC ile"+t.getName()+"Instractor kaydedildi");
		
	}

}
