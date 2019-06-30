package Examples;

public class PalindromeString {

	public String palindrome(String name) {

		String reverse = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			reverse = reverse + name.charAt(i);
		}
		return reverse;

	}
	public static void main(String args[]){
		PalindromeString obj=new PalindromeString();
		String name="aba";
		
		String g=obj.palindrome(name);
		
		System.out.println(g.length());
		
		if(g.equals(name)){
			System.out.println("Panlindrome");
		}
		else{
			System.out.println("Not palindrome");
		}
	}

}
