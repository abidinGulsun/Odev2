package ödev3;

public class Main {

	public static void main(String[] args) {
		InstructorManager ınInstructorManager = new InstructorManager();

		Instructor ınInstructor = new Instructor("Engin demiroğ", "Java + React \n",
				"Yazılım Geliştirici Yetiştirme Kampı");
		ınInstructorManager.courseİnfo(ınInstructor);

		User user1 = new User(1, "EnginDemiroğ_06");

		User user2 = new User(1, "AbidinGulsun06");

		UserManager userManager = new UserManager();
		userManager.instructorlogin(user1);

		ınInstructorManager.instructorİnfo(ınInstructor);

		Student student1 = new Student("Abidin Gülsün", "123456");

		userManager.studentLogin(user2);

		StudentManager studentManager = new StudentManager();
		studentManager.ogrenciİnfo(student1);
	}

}
