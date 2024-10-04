import java.util.Scanner;
import java.util.InputMismatchException;
class VoteAgeRestrictionException extends RuntimeException{
	public VoteAgeRestrictionException(String msg){
		super(msg);
	}
}
public class Voting{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the age for voting : ");
		int age = getValidAge(sc);
		System.out.println("\nPerson Age : "+age);
		sc.close();
	}
	public static int getValidAge(Scanner sc){

		int age = 0;
		while (true) {

			try{
				 age = sc.nextInt();
				if(age >= 18){
					break;
				}else{
					throw new VoteAgeRestrictionException("\n"+age+" -> Not eligible for voting!! Above 18 yrs allowed to vote\nPlease enter valid age : ");
				}
			}catch (VoteAgeRestrictionException e) {

				//System.out.println("\n"+e.getMessage());
				e.printStackTrace();

			}catch (InputMismatchException e) {

				System.out.println("\nInvalid input!please enter a valid integer as input : ");
				sc.next();

			}catch (Exception e) {
				System.out.println("\n"+e.getMessage());
			}

		}

		System.out.println("hello ravi");

		return age;
	}
}
