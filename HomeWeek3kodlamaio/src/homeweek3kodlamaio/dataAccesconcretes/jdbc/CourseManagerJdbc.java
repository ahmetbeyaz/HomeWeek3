package homeweek3kodlamaio.dataAccesconcretes.jdbc;

import homeweek3kodlamaio.dataAccesabstract.CourseDao;
import homeweek3kodlamaio.entities.Course;

public class CourseManagerJdbc implements CourseDao {

	@Override
	public void addCourse(Course course) {
              System.out.println("Jdbc ile"+course.getCourseName()+"kaydedildi");		
	}

	@Override
	public void deleteCourse(int id) {
System.out.println("Jdbc ile silindi");		
	}

	@Override
	public boolean getByCourseName(String courseName) {
		return false;
	}

}
