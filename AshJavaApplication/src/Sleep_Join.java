
class slepjo extends Thread
{
	public void run()
	{
		for(int i = 0;i<10;i++)
		{
			System.out.println("Child");
		}
		try
		{
			Thread.sleep(3000);
		}
		catch(InterruptedException e)
		{
			
		}
	}
}
public class Sleep_Join {

	public static void main(String[] args) throws InterruptedException {
		slepjo s= new slepjo();
		s.start();
		s.join();
		
		for(int i=0; i<10;i++)
		{
			System.out.println("Main");
		}
		

	}

}
