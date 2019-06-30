package inheritance_Examples;

public class Honda_bike extends Bike {

	public void hondarun(){
		System.out.println("child honda is runnning");
	}
	public void hondaspeed(){
		System.out.println("child speed km 50");
	}
	public static void main(String[] args) {
		Bike obj=new Honda_bike();
		/*obj.hondarun();
		obj.hondaspeed();*/
		obj.run();
		obj.speed();
	}
}
