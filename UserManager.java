package ödev3;

public class UserManager {

	public void instructorlogin(User user) {
		System.out.println("Eðitmen Giriþ Yaptý : " + user.getUserName());
	}

	public void studentLogin(User user) {
		System.out.println("Öðrenci giriþ yaptý : " + user.getUserName());
	}
}
