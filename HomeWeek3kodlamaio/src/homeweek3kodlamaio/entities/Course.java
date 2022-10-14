package homeweek3kodlamaio.entities;

public class Course {
	private int id;
	private String courseName;
	private String coursePrice;

	public Course(int id, String courseName, String coursePrice) {
		this.id = id;
		this.courseName = courseName;
		this.coursePrice = coursePrice;
	}

	public Course() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(String coursePrice) {
		this.coursePrice = coursePrice;
	}

}
