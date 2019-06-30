package Interface_examples;

public class Honda implements Bike{
	public void run(){
		System.out.println("Honda bike is running");
	}
	public void speed(){
		System.out.println("honda bike is 50kmp");
	}
	public void hondabreak(){
		System.out.println("break");
	}
	public static void main(String[] args) {
		Honda obj=new Honda();
		obj.run();
		obj.hondabreak();
		obj.speed();
	}
	

}
