package All_Programs;

public class String1 {

	public static void main(String[] args) {
		String s = new String("ASHWINI");  //MUTABLE OBJECT
        s.concat("GHARAT");
        
        System.out.println(s.toLowerCase());
        
        System.out.println(s.length());
        
        System.out.println(s.toUpperCase()); // 1 way
        
        String upper = s.toUpperCase();  //2 Way
        System.out.println(upper);
	}

}
