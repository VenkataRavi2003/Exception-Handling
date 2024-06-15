import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Arrays;
public class AnagramCheck{
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){

			System.out.print("\nEnter 1st string :: ");
			String s1 = sc.nextLine();

			System.out.print("\nEnter 2nd string :: ");
			String s2 = sc.nextLine();

			if(areAnagrams(s1,s2)){
				System.out.println("\n"+s1+" && "+s2+" -> Both strings are anagrams.");
			}else {
				System.out.println("\n"+s1+" && "+s2+" -> Both strings are not anagrams!!");
			}

		}catch (InputMismatchException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static boolean areAnagrams(String s1,String s2){

		if(s1.length() != s2.length()) return false;

		char ch1[] = s1.toLowerCase().toCharArray();
		char ch2[] = s2.toLowerCase().toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		return Arrays.equals(ch1,ch2);
	}
}