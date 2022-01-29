import java.util.Scanner;
public class CustomizeException {

	public static void main(String[] args) throws CanApply
	{
		
		int Marks;
		System.out.println("Enter candidate Marks");
		Scanner s = new Scanner(System.in);
		Marks = s.nextInt();
		
		if (Marks<60)
		{
			throw new CanApply(" SORRY You are not applicable for Government Scholership..");
		}
		else
		{
			System.out.println("CONGRATULATIONS! You are applicable for Government Scholership..");
		}
	}

}
class CanApply extends Exception
{
	CanApply (String msg)
	{
		super (msg);
	
	}
}
