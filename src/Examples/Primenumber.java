package Examples;

public class Primenumber {
	
	public boolean checkprime(int num){
		
		boolean flag=true;
		
		if (num==2){
			flag=true;
			return flag;
		}
		
		for(int i=2;i<num;i++){
			if(num%i==0){
				flag=false;
			}
		}
		return flag;
	}
	public static void main(String args[]){
		Primenumber g=new Primenumber();
		int num=15;
		boolean h=g.checkprime(num);
		if(h){
			System.out.println("prime number");
		}
		else{
			System.out.println("Not prime number");
		}
		
	}

}
