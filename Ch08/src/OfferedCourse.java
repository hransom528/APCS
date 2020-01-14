public class OfferedCourse extends Course {
	private String instructorName;
	private String term;
	private String classTime;
	
	public String getInstructorName() {
		return instructorName;
	}
	
	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
	
	public String getTerm() {
		return term;
	}
	
	public void setTerm(String term) {
		this.term = term;
	}
	
	public String getClassTime() {
		return classTime;
	}
	
	public void setClassTime(String classTime) {
		this.classTime = classTime;
	}
}