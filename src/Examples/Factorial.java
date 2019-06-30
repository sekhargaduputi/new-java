package Examples;

public class Factorial {
	
	public int factorial(int num){
		
		int g=1;
		for(int i=1;i<=num;i++){
			
			g=g*i;
			
		}
		return g;
		
	}
	public static void main(String args[]){
		Factorial g=new Factorial();
		int num=5;
		int i=g.factorial(num);
		System.out.println(i);
	}

}
