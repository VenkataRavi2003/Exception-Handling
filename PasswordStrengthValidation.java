import java.util.Scanner;
class WeakPasswordException extends RuntimeException{
	
	public WeakPasswordException(String msg){
		super(msg);
	}
}
public class PasswordStrengthValidation{
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){

			System.out.print("\nEnter Password : ");
			String password = sc.nextLine();

			validatePassword(password);

			System.out.println("\nPassword Is Strong.");

		}catch (WeakPasswordException wpe) {
			System.out.println("\nException Occured -> "+wpe.getMessage());
		}catch (Exception e) {
			System.out.println("\nException Occured : "+e.getMessage());
		}
	}
	public static void validatePassword(String password){

		if(password.length() < 8){
			throw new WeakPasswordException("Password length atleast contains 8 characters long.");
		}

		if(!password.matches(".*[!@#$%^&*(),.?\":{}].*")){
			throw  new WeakPasswordException("Password must contain atleast 1 special character.");
		}

		if(!password.matches(".*\\d.*")){
			throw new WeakPasswordException("Password atleast contains one digit.");
		}

		if(!password.matches(".*[A-Z].*")){
			throw new WeakPasswordException("Password atleast contains one Uppercase character.");
		}
	}
}