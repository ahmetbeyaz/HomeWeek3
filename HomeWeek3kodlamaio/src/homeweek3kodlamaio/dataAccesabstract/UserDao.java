package homeweek3kodlamaio.dataAccesabstract;

import homeweek3kodlamaio.entities.User;

public interface UserDao<T extends User> {
	
	public void addUser(T t);
	
	public void deleteUser(int id);
	

}
