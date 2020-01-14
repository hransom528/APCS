public class Course{
	private String courseNumber;
	private String courseTitle;
	
	public String getCourseNumber() {
		return courseNumber;
	}
	
	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}
	
	public String getCourseTitle() {
		return courseTitle;
	}
	
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public void printInfo() {
		System.out.println("Course Information: ");
		System.out.println("   Course Number: " + getCourseNumber());
		System.out.println("   Course Title: " + getCourseTitle());
	}
}