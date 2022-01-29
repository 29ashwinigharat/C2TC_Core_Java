package All_Programs;

public class Reference_ContentComparison {

	public static void main(String[] args) {
		String s1 = new String ("Ashwini");
		String s2 = new String ("Ashwini");
		
		System.out.println(s1==s2);          //REFERENCE COMPARISON
		System.out.println(s1.equals(s2));   //CONTENT COMPARISION
	}

}
