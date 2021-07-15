
public class AuthApp2 {

	public static void main(String[] args) {

		
		

		String name = "Song";
		String inputId = args[0];
		String pass = "1111";
		String pass2 = "2222";
		String inputPass = args[1];
		
		System.out.println("Hi.");
		
		boolean RightPass = inputPass.equals(pass) || inputPass.equals(pass2);
		//if(inputId == name) {
		if(inputId.equals(name) && RightPass) {
			System.out.println("Master!");
		}
		
		else {
			System.out.println("Who are you?");
		}
		  
	}

}
