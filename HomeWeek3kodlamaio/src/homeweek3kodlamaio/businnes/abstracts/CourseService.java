package homeweek3kodlamaio.businnes.abstracts;

import homeweek3kodlamaio.entities.Course;

public interface CourseService {
	
	public void addCourse(Course course) throws Exception;
	
	public void deleteCourse(int id);

}
