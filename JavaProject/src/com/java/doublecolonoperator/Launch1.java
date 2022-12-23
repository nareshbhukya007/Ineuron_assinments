package com.java.doublecolonoperator;

interface Bike {
	public String getname();
}


class Engine{
	Engine(){
		System.out.println("Engine is created!!");
	}
}
interface NewBike{
	public Engine getEngine();
}
class Honda {
	public static String printName() {
		return "RoyalEnfield in static method";
	}

	public String displayName() {
		return "RoyalEnfield in non-static method";
	}
}

public class Launch1 {
	public static void main(String[] args) {
		Bike b = () -> "RoyaleEnfield";
		System.out.println(b.getname());

		// method referance static method
		//classname :: methodname
		Bike b1 = Honda::printName;
		System.out.println(b1.getname());

		// method referance non static
		// object referance::methodname
		Honda h = new Honda();
		Bike b2 = h::displayName;
		System.out.println(b2.getname());
		
		// constructor referance
		// classname::new
		NewBike nb = Engine::new;
		nb.getEngine();
	
	}

}
