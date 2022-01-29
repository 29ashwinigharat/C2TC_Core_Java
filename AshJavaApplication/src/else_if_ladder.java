import java.util.Scanner;

public class else_if_ladder {

	public static void main(String[] args) {
		int  age;
		System.out.println("Enter your age");
		Scanner sc=new Scanner(System.in);
		age=sc.nextInt();
		
		if(age>18) {
			System.out.println("You can cast your vote");
		}
		else if(age<18) {
			System.out.println("You can't cast your vote");
		}
		else if(age>80) {
			System.out.println("You can cast your vote at home according to your age");
		}
		else {
			System.out.println("You cant cast your vote ,when you are reach to your 18 age");
		}
		}

}
