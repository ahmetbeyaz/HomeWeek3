package homeweek3kodlamaio;
import homeweek3kodlamaio.businnes.abstracts.CategoryService;
import homeweek3kodlamaio.businnes.abstracts.CourseService;
import homeweek3kodlamaio.businnes.abstracts.InstractorService;
import homeweek3kodlamaio.businnes.concretes.CategoryManager;
import homeweek3kodlamaio.businnes.concretes.CourseManager;
import homeweek3kodlamaio.businnes.concretes.InstractorManager;
import homeweek3kodlamaio.core.logging.DataBaseLogger;
import homeweek3kodlamaio.core.logging.LogHelper;
import homeweek3kodlamaio.core.logging.Logger;
import homeweek3kodlamaio.dataAccesconcretes.jdbc.CategoryManagerJdbc;
import homeweek3kodlamaio.dataAccesconcretes.jdbc.CourseManagerJdbc;
import homeweek3kodlamaio.dataAccesconcretes.jdbc.InstractorManagerJdbc;
import homeweek3kodlamaio.entities.Category;
import homeweek3kodlamaio.entities.Course;
import homeweek3kodlamaio.entities.Instractor;

public class Main {

	public static void main(String[] args ) throws Exception {

		Category category=new Category();
		category.setId(1);
		category.setCategoryName("Algoritma ve Programlama");
		
		Course course =new Course();
		course.setId(2);
		course.setCourseName("Java ile ileri Seviye");
		course.setCoursePrice("7500");
		
		Instractor instractor =new Instractor();
		instractor.setId(3);
		instractor.setName("Engin ");
		instractor.setSurName("Demirog");
		instractor.setDepartment("JAVA");
		instractor.setEmail("java@gmail.com");
		
		Logger[] loggers= {new DataBaseLogger()};
		
		CategoryService categoryService=new CategoryManager(new CategoryManagerJdbc(),new LogHelper(loggers));
		categoryService.addCategory(category);
		
		
		CourseService courseService =new CourseManager(new CourseManagerJdbc(),new LogHelper(loggers));
		courseService.addCourse(course);
		
		
		InstractorService instractorService=new InstractorManager(new InstractorManagerJdbc(),new LogHelper(loggers));
		instractorService.addInstractor(instractor);
		
	    
		
		
		
		
		
		
	}

}
