
public class NullPoint_Exception {

	public static void main(String[] args) {
	   try
	   {
//		   String a = null;
//		   System.out.println(a.charAt(0));
		   System.out.println(1);
		   System.out.println(4/0);
		   System.out.println(3);
	   }
	   catch(NullPointerException n)
	   {
		   System.out.println("Null Pointer Exception");  
	   }
	   finally
	   {
		   System.out.println("can i execute?");
	   }

	}

}
