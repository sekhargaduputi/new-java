package Examples;

import java.util.HashSet;

public class DuplicateElements {
	public static void main(String args[]){
	String[] name= {"Sekhar","java","Sekhar"};
	
	HashSet<String> duplicate=new HashSet<String>();
	
	for(String s:name){
		
		if(duplicate.add(s)==false){
			System.out.println(s);
		}
		
	}}
}
