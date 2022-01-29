import java.util.Scanner;

public class Switch_Case {

	public static void main(String[] args) 
	{
		int age;
	    System.out.println("Enter your age");
	    Scanner sc = new Scanner(System.in);
	    age= sc.nextInt();
	    
	    switch(age) {
	    case 18:
	    	System.out.println("You are going to hit adults");
	    	break;
	    	
	    case 10:
	    	System.out.println("You are child");
	    	break;
	    	
	    case 1:
	    	System.out.println("You are small baby");
	    	break;
	    	
	    case 60:
	    	System.out.println("You are mature experianced person");
	    	break;
	    	
	    default:
	    	System.out.println("Enjoy your life");
	    	break;
	    	 }
	    }

}
