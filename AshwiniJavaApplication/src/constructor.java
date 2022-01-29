
public class constructor {
	
	String name ;
	int age,roll,birth_date;

	public constructor( String name,int age, int roll ,int birth_date) 
	{
		this.name=name;
		this.age=age;
		this.roll=roll;
		this.birth_date=birth_date;
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		 constructor s1 = new constructor( "Ashwini", 22, 9, 29/10/1999 );
		 constructor s2 = new constructor("Devika", 21, 10, 19/12/2000);
		 constructor s3 = new constructor("Meera", 20, 6, 2/3/2010);
		 
		 System.out.println( s1.name+" " + s1.age+" " + s1.roll+" " + s1.birth_date+" " );
		 System.out.println( s2.name+" " + s2.age+" " + s2.roll+" " + s2.birth_date+" " );
		 System.out.println( s3.name+" " + s3.age+" " + s3.roll+" " + s3.birth_date+" " );
		 

	}

}
