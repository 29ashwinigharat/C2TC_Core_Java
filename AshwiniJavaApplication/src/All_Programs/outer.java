package All_Programs;

public class outer {
	int x=10;
	static int y=100;
	
	static class inner
	{
		public void method_demo()
		{
			System.out.println("i am inner class");
			System.out.println(y);
		}
	}

	public static void main(String[] args) {
       outer.inner obj = new outer.inner();
       obj.method_demo();
       
       inner n= new inner();
       n.method_demo();

	}

}
