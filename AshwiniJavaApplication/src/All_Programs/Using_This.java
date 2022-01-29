package All_Programs;

public class Using_This {
	String name;
	int roll,age;
	
public Using_This(String name, int roll,int age)
{
	this.name = name;
	this.roll = roll;
	this.age = age;
}

	public Using_This() {
	// TODO Auto-generated constructor stub
}

	public static void main(String[] args)
	{
		Using_This u1= new Using_This("Ashwini" , 23 , 15);
		Using_This u2= new Using_This("Rohini", 34 , 21);
		
		
		System.out.println((u1.name+" " + u1.roll +"" + u1.age));
		System.out.println((u2.name+" " + u2.roll +"" + u2.age));
		

	}

}
