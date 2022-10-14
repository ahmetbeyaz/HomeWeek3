package homeweek3kodlamaio.businnes.concretes;

import homeweek3kodlamaio.businnes.abstracts.InstractorService;
import homeweek3kodlamaio.core.logging.LogHelper;
import homeweek3kodlamaio.dataAccesabstract.InstractorDao;
import homeweek3kodlamaio.entities.Instractor;

public class InstractorManager  implements InstractorService {
	InstractorDao instractorDao;
     LogHelper logHelper;
     
     

	public InstractorManager(InstractorDao instractorDao, LogHelper logHelper) {
		
		this.instractorDao = instractorDao;
		this.logHelper = logHelper;
	}

	@Override
	public void addInstractor(Instractor insInstractor) throws Exception {
          instractorDao.addUser(insInstractor);	
          logHelper.log(""  +insInstractor.getDepartment());
	}

	@Override
	public void deleteInstractor(int id) {
            instractorDao.deleteUser(id);		
	}

}
