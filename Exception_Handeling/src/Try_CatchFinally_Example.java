
public class Try_CatchFinally_Example {

	public static void main(String[] args) {
	int[]arr = new int[4];
	try
	{
		System.out.println(arr[4]);  //exception occur in this line
		
		System.out.println("Inside try block");
	}
	catch(ArrayIndexOutOfBoundsException ex)
	{
		System.out.println("Exception Occure in catch block");
	}
	finally   //Always executed
	{
		System.out.println("Finally  block Executed");
	}
	
	//rest program will executed
	System.out.println("Outside Try_CatchFinally claus");

	}

}
