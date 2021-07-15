
public class AuthApp {

	public static void main(String[] args) {

		
		

		String name = "Song";
		String inputId = args[0];
		String pass = "1111";
		String inputPass = args[1];
		
		System.out.println("Hi.");
		//if(inputId == name) {
		if(inputId.equals(name) && inputPass.equals(pass)) {
			System.out.println("Master!");
		}
		else if(inputId.equals(name) && pass != "1111"){
			System.out.println("Wrong password");
		}
		else if(name != "Song" && inputPass.equals(pass)) {
			System.out.println("Wrong ID");
		}
		else {
			System.out.println("Who are you?");
		}
			

	}

}
