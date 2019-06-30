package Collection_Examples;


import java.util.ArrayList;
import java.util.List;

public class List_Examples {
	public static void main(String[] args) {
		
		List a=new ArrayList<Integer>();	
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(30);
		a.add("sekhar");
		
		System.out.println(a.get(0));
		
		for(Object s:a){
			
			System.out.println(s);
		}
		
	}

}
