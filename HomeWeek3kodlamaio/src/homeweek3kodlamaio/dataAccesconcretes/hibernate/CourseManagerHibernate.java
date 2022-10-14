package homeweek3kodlamaio.dataAccesconcretes.hibernate;

import homeweek3kodlamaio.dataAccesabstract.CourseDao;
import homeweek3kodlamaio.entities.Course;

public class CourseManagerHibernate implements CourseDao {

	@Override
	public void addCourse(Course course) {
	System.out.println("Hibernate ile"+course.getCourseName()+"kaydedildi");
		
	}

	@Override
	public void deleteCourse(int id) {
	System.out.println("Hibernate ile silindi");
		
	}

	@Override
	public boolean getByCourseName(String courseName) {
		return false;
		
		
	}

}
