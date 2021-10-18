package ödev3;

public class Student extends User {

	private String studentName;
	private String studentNo;

	public Student() {
	}

	public Student(String studentName, String studentNo) {

		this.studentName = studentName;
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentno() {
		return studentNo;
	}

	public void setStudentno(String studentNo) {
		this.studentNo = studentNo;
	}

}
