
public class C1 {

	public static void main(String[] args)
	{
//		                      #  CONCANICATE: in concat string  is immutable so it is not working   #
		
		String p = new String("Ashwini ");
		
		System.out.println(p.concat("Gharat"));
//		
		
//		                      #   StringBuffer:  is mutable    #
		
		StringBuffer t = new StringBuffer("Ashwini");
		t.append(" Gharat");
		System.out.println(t);
		
//		                          #       CALCULATE LENGTH, UPPER, LOWER        #
		
		String x = new String("Ashwini Ulhas Gharat");
		
		System.out.println(x.length());
		
		String upper= x.toUpperCase();
		System.out.println(upper);
		
		String lower= x.toLowerCase();
   	    System.out.println(lower);
		
//		                           #       CASE SENSITIVE : TRUE OR FALSE      #
		
		String y = new String("Dubai");
		System.out.println(y.equals("dubai"));
		
		System.out.println(y.equalsIgnoreCase("dubai"));
		
//		                           #        REPLACE METHOD        #
		String w = ("Dubai");
		System.out.println(w.replace('D','J'));
		
		
//		                           #         TRIM METHOD          #
	    String z = new String("         Ashwini Ulhas Gharat"     );
		System.out.println(z.trim());
		
//		                        #  SUBSTRING METHOD: It start from index no which is declare and end at the last index no  #
		String s = new String("Ashwini Ulhas Gharat");
		System.out.println(s.substring(2,10));
		
//		                           #          CharAt()METHOD: It finds the character at which index    #
		
		String c = ("Im an engineer and im good programmer");
		char ch1 = c.charAt(0);
		System.out.println("character at 0 index is = " +ch1);
		
		char ch6 = c.charAt(6);
		System.out.println("character at 6 index is = " +ch6);
		
		char ch3 = c.charAt(3);
		System.out.println("character at 3 index is = " +ch3);
		
		char ch2 = c.charAt(7);
		System.out.println("character at 7 index is = " +ch2);
		
		char ch10 = c.charAt(10);
		System.out.println("character at 10 index is = " +ch10);
		
		char ch11 = c.charAt(11);
		System.out.println("character at 11 index is = " +ch11);
		
		
//		                            #     ENDS WITH()      #
		 String Mystr = "My name is Ashwini Gharat";
		 System.out.println(Mystr.endsWith("is"));
		 System.out.println(Mystr.endsWith("t"));
		 
//		                            #      STARTSWITH      #
		 
		 String str = "Your system is very slow";
		 System.out.println(str.startsWith("is"));
		 System.out.println(str.startsWith("Y"));
		 
		 
	
		
		
		
	
		
		
		
		

	}

	private static char[] charAt() {
		// TODO Auto-generated method stub
		return null;
	}

}
