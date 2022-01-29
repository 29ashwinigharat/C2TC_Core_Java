
class ThreadMy implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread");
		}
	}
}

public class Runnable_Interface {

	public static void main(String[] args) {
		ThreadMy m = new ThreadMy();
		Thread t = new Thread(m);
		t.start();
		System.out.println(Thread.currentThread().getThreadGroup().getName());

		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread");
		}
	}

}
