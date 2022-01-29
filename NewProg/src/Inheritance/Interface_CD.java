package Inheritance;

interface A{
		void ADisplay();
	}
	interface B{
		void BDisplay();
	}
	class GTE implements A,B
	{
		public void ADisplay()
		{
			System.out.println("My name is A");
		}
		public void BDisplay()
		{
			System.out.println("My name is B");
		}
	}
	
	    public class Interface_CD {
		public static void main(String[]args) {
		GTE obj = new GTE();
		obj.ADisplay();
		obj.BDisplay();
	}

	}

