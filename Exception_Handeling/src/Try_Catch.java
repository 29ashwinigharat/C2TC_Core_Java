
public class Try_Catch {

	public static void main(String[] args) 
	{
		System.out.println("hiiiiiii");
		
		try
		{
			System.out.println(10/0);	
		}
		catch(ArithmeticException e)
		{
			System.out.println(10/2);
		}
		
		System.out.println("Hello");

	}

}
