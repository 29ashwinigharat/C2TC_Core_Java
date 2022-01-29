package Inheritance;

class living_Things{
	void eat() {
		System.out.println(" Eating...");
	}
}
class cat extends living_Things {
	void crying() {
		System.out.println(" mav mav...");
		}
}

public class multi_Inheritance {

	public static void main(String[] args) {
		cat dg =  new cat();
		dg.eat();
		dg.crying();

	}

}
