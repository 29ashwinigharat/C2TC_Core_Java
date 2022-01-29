
class THRH extends Thread
{
	public void run()
	{
		for (int i=0;i<10;i++)
		{
			System.out.println("Child");
			Thread.yield();
			
		}
	}
}
public class Thread_Yeild {

	public static void main(String[] args) {
		THRH m =new THRH();
		m.start();
		
		for(int i=0; i<10; i++)
		{
			System.out.println("Main");
		}

	}

}
