import java.util.Scanner;
import java.util.InputMismatchException;
public class Exception2{
	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// System.out.print("\nEnter the number : ");
		// int x = sc.nextInt();
		// System.out.println(x);
		// sc.close();
		// for (int i = 0;i<5 ; ++i) {
		// 	System.out.println("hi");
		// }

		// Scanner sc = new Scanner(System.in);

		// try{
		// 	System.out.print("\nEnter the number : ");
		// 	int x = sc.nextInt();
		// 	System.out.print(x);
		// }catch (InputMismatchException e) {
		// 	System.out.println("\nInvalid input!please enter valid integer as input.");
		// 	System.out.println(e.getMessage());
		// }
		// for (int i = 0 ; i < 5 ; ++i) {
		// 	System.out.println("hi");
		// }

		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter n1 : ");
		int n1 = getValidInput(sc);
		System.out.print("\nEnter n2 : ");
		int n2 = getValidInput(sc);

		System.out.println("\nsum : "+(n1 + n2));

		for (int i = 0 ; i < 5 ; ++i) {
			System.out.println("\n Hello");
		}

	}
	public static int getValidInput(Scanner sc){

		while (true) {
			try{
				int x = sc.nextInt();
				return x;
			}catch (InputMismatchException e) {
				System.out.println("\nInvalid input!please enter valid integer as input.");
				sc.next();
			}
		}
	}
}