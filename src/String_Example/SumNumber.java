package String_Example;

public class SumNumber {

	
	public void sum(int a,int b,int c){
		
		int sum;
		
		sum=a+b+c;
		System.out.println(sum);
		
		int d=sum/3;
		System.out.println(d);
		
	}
	
	
	public static void main(String args[]){
		SumNumber obj=new SumNumber();
		obj.sum(10, 20,30);
	}
}
