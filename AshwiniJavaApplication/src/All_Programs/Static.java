package All_Programs;

public class Static {
	int roll;
	String name;
	static String college= "Mumbai University";
	
	
	Static(int r, String n){
		roll= r;
		name= n;
	}
	
	void display()
	{
		System.out.println(roll+" " +name+" " +college);
	}
	
	public static void main(String[] args) {
		Static s1 = new Static(1,"Ashwini");
		Static s2 = new Static(2,"Samiksha");
		Static s3 = new Static(3,"Rohini");
		s1.display();
		s2.display();
		s3.display();
		
		
	Static.college="doon University";
	s1.display();
	s3.display();

	}

}
