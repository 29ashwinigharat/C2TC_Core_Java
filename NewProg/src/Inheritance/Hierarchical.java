package Inheritance;
class Ani_Liv{
	void walk()
	{
		System.out.println("walking.....");
	}
}


class Animal2 extends Ani_Liv{
	void eat() 
	{
		System.out.println("vegetables/nonveg");
	}
}


class Dog2 extends  Ani_Liv{
	void bark()
	{
		System.out.println("barking....");
	}
}



public class Hierarchical {
	
public static void main(String[] args) {
	Dog2 dg = new Dog2();
	dg.bark();
	dg.walk();

	}

}
