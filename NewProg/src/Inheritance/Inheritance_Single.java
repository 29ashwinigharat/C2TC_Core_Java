package Inheritance;

class animal {
	void eat() {
	System.out.println(" eat..");
		}
}
class dog extends animal{
	void bark() {
		System.out.println(" barking....");
	}
}
public class Inheritance_Single{
	public static void main(String[] args) 
	{
		dog dg= new dog();
		dg.eat();
		dg.bark();
		
	}
}

