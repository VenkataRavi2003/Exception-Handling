import java.util.Scanner;
class OutOfRangeException extends RuntimeException{
	public OutOfRangeException(String msg){
		super(msg);
	}
}
public class TablesFrom2To20_Restricting{
	public static void main(String[] args) {
		
		try(Scanner sc  = new Scanner(System.in)){

			System.out.print("\nEnter the table : ");
			int table = sc.nextInt();

			generateTable(table);

		}catch(OutOfRangeException ore){
			System.out.println("\n"+ore.getMessage());
		}catch(Exception e){
			System.out.println("\n"+e.getMessage());
		}
	}
	public static void generateTable(int table)throws OutOfRangeException{

		if(table >= 2 && table <= 20){

			for (int i = 1 ; i <= 10 ; ++i ) {

				  System.out.println(table+" * "+i+" = "+(table*i));
			}

		}else{

			throw new OutOfRangeException("\n"+table+" -> Limit From 2 to 20 only !!");
		}
	}
}