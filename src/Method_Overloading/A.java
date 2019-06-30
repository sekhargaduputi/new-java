
package Method_Overloading;

public class A {
	
	public void sum(){
		System.out.println("No parameters");
	}
	public static void sum(int a){
		System.out.println("single parameter"+ a );
	}
	public String sum(String b){
		System.out.println(b);
		return b;
	}
	
	public static void main(String args[]){
		
		A obj=new A();
		obj.sum();
		obj.sum(10);
		obj.sum("sekhar");
	}
}
