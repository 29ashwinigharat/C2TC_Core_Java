package All_Programs;

public class AbstractDemo {

	public static void main(String[] args) {
		Scooty s= new Scooty();
		s.NoOfWheels();
	}

}
abstract class vehicle
{
	public abstract void NoOfWheels();
	}

class Scooty extends vehicle
{
 public void NoOfWheels()
     {
		System.out.println(2);
	 }
	
}