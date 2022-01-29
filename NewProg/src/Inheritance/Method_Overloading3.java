package Inheritance;

public class Method_Overloading3 {
	public void m(Object o)
	{
		System.out.println("Object class");
	}
	public void m(String s)
	{
		System.out.println("String class");
	}

	public static void main(String[] args) {
		Method_Overloading3 obj = new Method_Overloading3();
		obj.m(new Object());
		
		obj.m("Ashwini");
		obj.m(null);
				}

}
