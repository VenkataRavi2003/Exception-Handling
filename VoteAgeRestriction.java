import java.util.Scanner;
class TooYoungAgeException extends RuntimeException{
	TooYoungAgeException(String msg){
		super(msg);
	}
}
public class VoteAgeRestriction{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Age : ");

		int age = sc.nextInt();

		if(age >= 18){
			System.out.println("\n"+age+" -> Eligible For Voting.");
		}else{
			throw new TooYoungAgeException("\n"+age+" -> Below 18 Not Allowed To Vote !!");
		}
		sc.close();
	}
}