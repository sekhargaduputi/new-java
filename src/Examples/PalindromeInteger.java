package Examples;

public class PalindromeInteger {
	
	public int checkpalindrome(int num){
		
		int reminder=0;
		int reverse=0;
		
		while(num!=0){
			
			reminder=reminder%10;
			reverse=reverse*10+reminder;
			num=num/10;
			
			
		}
		return reverse;
	}
	public static void main(String args[]){
		
		PalindromeInteger obj=new PalindromeInteger();
		int num=151;
		
		int number=obj.checkpalindrome(num);
		
		if(number==num){
			System.out.println("palindrome");
		}
		else{
			System.out.println("not palindrome");
		}
	}

}
