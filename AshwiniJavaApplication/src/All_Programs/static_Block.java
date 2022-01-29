package All_Programs;

public class static_Block {
	static int a;

	public static void main(String[] args) {
		System.out.println("Execute main block");
		System.out.println(a);
		m();
	    

	}
	static void m()
	{
		System.out.println("India is best");
	}
	static 
	{
		System.out.println("India is best");
	}
	static
	{
		System.out.println("India is best");
	}
    static
    {
    	System.out.println("Vande Mataram");
    }
    static
    {
    	System.out.println("Jay Hind");
    }
}
