package String_Example;

public class StringBuffer_Examples {
	
	public static void main(String[] args) {
		
		//String b="sekhar";
		StringBuffer buffer=new StringBuffer("sekhar automation");
		
		char s=buffer.charAt(3);
		System.out.println(s);
		
		String a=buffer.substring(0,3);
		System.out.println(a);
	}

}
