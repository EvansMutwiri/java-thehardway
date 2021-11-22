public class ClubBouncer {
	public static void main(String[] args){
		int age = 20;
		boolean onGuestList = false;
		String gender = "F";
		double allure = 7.5;
		
		if(onGuestList || age >= 21 || (gender == "F") && allure >= 8.0)
			System.out.println("Allowed in");
		else
			System.out.println("Gerrarahia mehn shieerr");
	}
}
