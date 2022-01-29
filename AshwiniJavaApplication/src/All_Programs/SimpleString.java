package All_Programs;

public class SimpleString {

	public static void main(String[] args) {
		char c[]= {'A', 'B', 'J', 'K'};
		String s1=new String(c);
		String s2=new String(s1);
		
		
		System.out.println(s1);
		System.out.println(s2);
		String longStr = "This could have been"+ "A very long line would have"+ "wrapped around. But String concatination"+
		                  "prevents tjis." ;
		
		System.out.println(longStr);
		           
		

	}

}
