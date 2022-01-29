package Inheritance;

public class Method_Overloading {
	
	public void m()
	{
		System.out.println("I am Parameter" );
	}
	
	public void m(float f)
	{
		System.out.println("I am Float" );
	}
	
	public void m(char c)
	{
		System.out.println("I am Character" );
	}
	
	public void m(int i)
	{
		System.out.println("I am Integer" );
	}

	
public static void main(String[] args) {
		Method_Overloading obj = new Method_Overloading();
		obj.m();
		obj.m(14.87f);
		obj.m(34);
		obj.m(4l);   // "l" means long
		obj.m('a');
		

	}

}
