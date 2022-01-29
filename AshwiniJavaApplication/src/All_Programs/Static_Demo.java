package All_Programs;

public class Static_Demo {
	int roll;
	String name;
	static String college= "Mumbai University";
	
	
	Static_Demo(int r, String n){
		roll= r;
		name= n;
	}
	static void change()
	{
		college= "Doon University";
	}
	void display()
	{
		System.out.println(roll+" " +name+" " +college);
	}

	public static void main(String[] args) {
		Static_Demo.change();
		
		Static_Demo s1= new Static_Demo(1,"Ashwini Gharat");
		Static_Demo s2= new Static_Demo(1,"Rohini Gharat");
		s1.display();
		s2.display();
		}

}
