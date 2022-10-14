package homeweek3kodlamaio.businnes.concretes;

import homeweek3kodlamaio.businnes.abstracts.CourseService;
import homeweek3kodlamaio.core.logging.LogHelper;
import homeweek3kodlamaio.dataAccesabstract.CourseDao;
import homeweek3kodlamaio.entities.Course;

public class CourseManager implements CourseService {
	
	CourseDao courseDao;
	LogHelper logHelper;
    	

	public CourseManager(CourseDao courseDao, LogHelper logHelper) {
		this.courseDao = courseDao;
		this.logHelper=logHelper;
	}

	@Override
	public void addCourse(Course course) throws Exception {
            if(courseDao.getByCourseName(course.getCourseName())==false) {
            	
            	courseDao.addCourse(course);
            	logHelper.log(course.getCourseName());
            	
            }
            else {
				System.out.println("Kurs ismi eklenmedi");
			}
		
	}

	@Override
	public void deleteCourse(int id) {
		
		courseDao.deleteCourse(id);
	}

}
