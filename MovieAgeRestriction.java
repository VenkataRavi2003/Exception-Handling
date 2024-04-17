import java.util.Scanner;
class TooYoungAgeException extends RuntimeException{

	public TooYoungAgeException(String msg){
		super(msg);
	}
}
public class MovieAgeRestriction{
	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)){

			System.out.print("\nEnter Age : ");
			int age = sc.nextInt();

			if(age < 18){
				throw new TooYoungAgeException("\n"+age+" -> Below 18 Years Not Allowed !!");
			}else{
				System.out.println("\n"+age+" -> Welcome, Enjoy The Movie.");
			}

		}catch(TooYoungAgeException tye){

			System.out.println("\n"+tye.getMessage());

		}catch(Exception e){

			System.out.println("\n"+e.getMessage());
		}
	}
}