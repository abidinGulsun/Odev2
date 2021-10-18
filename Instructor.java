package ödev3;

public class Instructor extends User {

	private String instructorName;
	private String branch;
	private String course;

	public Instructor() {

	}

	public Instructor(String instructorName, String branch, String course) {
		super();
		this.instructorName = instructorName;
		this.branch = branch;
		this.course = course;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

}
