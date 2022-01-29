import java.util.Scanner;

public class STCH {

	public static void main(String[] args)
	{
		int  num ;
		Scanner console = new Scanner(System.in);
		
		System.out.print( "Enter Number 0-4 : ");
		
		num = console.nextInt();
		
	     
		switch(num)
		{
		default:
			System.out.println("default ");
			
		case 0:
			System.out.println("0");
			break;
		case 1:
			System.out.println("1");
			
		case 2:
			System.out.println("2");
			
		}
		
		

	}

}
