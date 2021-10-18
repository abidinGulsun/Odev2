package ödev3;

public class InstructorManager {

	public void instructorİnfo(Instructor ıInstructor) {
		System.out.println("Eğitmen Adı : " + ıInstructor.getInstructorName());
		System.out.println("Eğitmen Branşı : " + ıInstructor.getBranch());
	}

	public void courseİnfo(Instructor ınInstructor) {
		System.out.println("Kursun Adı : " + ınInstructor.getCourse() + "\n");
	}
}
