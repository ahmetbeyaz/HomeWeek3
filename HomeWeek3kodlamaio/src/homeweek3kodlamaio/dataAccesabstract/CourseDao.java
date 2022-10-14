package homeweek3kodlamaio.dataAccesabstract;

import homeweek3kodlamaio.entities.Course;

public interface CourseDao {
	
	public void addCourse(Course course);
	
	public  void deleteCourse(int id);
	
	public boolean  getByCourseName(String courseName);

}
