package Examples;

public class ReverseString {

	public static void main(String args[]){
		
		String name="Automation";
		for(int i=name.length()-1;i>=0;i--){
			
			char reverse=name.charAt(i);
			System.out.print(reverse);
		}
	}
}
