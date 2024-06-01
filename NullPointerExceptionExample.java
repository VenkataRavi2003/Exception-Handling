class NullPointerExceptionExample{

	// Here we made the str variable as null
	static String str = null;

	public static void main(String[] args) {
		//here we are trying to access the length of the str variable which is assigned to null 
		// when we try to access the null associated variables, then it will throw NullPointerException.
		System.out.println(str.length());
	}
}
