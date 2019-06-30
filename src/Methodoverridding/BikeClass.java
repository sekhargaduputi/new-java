package Methodoverridding;

public class BikeClass  extends Vechicle{
	
	public  void run(){
		System.out.println("bike is running");
	}
	public  void speed(){
		System.out.println("Bike speed is 50kmp");
	}

	public static void main(String[] args) {
		BikeClass obj=new BikeClass();
		obj.run();
		obj.speed();
		
		System.out.println("*************");
		
		Vechicle obj1=new BikeClass();
		obj1.run();
		obj1.speed();
		
		System.out.println("***********");
		
		Vechicle obj2=new Vechicle();
		obj2.run();
		obj2.speed();
	}
}
