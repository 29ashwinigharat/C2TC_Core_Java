package Inheritance;

public class Method_Overloading2 {
	
	public void m(Object O)
	{
		System.out.println(" Im Object");
	}
	
	public void m(String S)
	{
		System.out.println(" Im String");
	}
	public void m(StringBuffer SB)
	{
		System.out.println(" Im String Buffer");
	}

public static void main(String[] args) {
	Method_Overloading2 obj = new Method_Overloading2();
	obj.m( new Object());
	obj.m( "Ashwini Gharat");
	obj.m( "im new in technoserve");

	}

}
