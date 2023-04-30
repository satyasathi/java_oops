//encapsulation - process of accessing members of private variables by creating public methods. 

import java.util.*;
class test{
	private String name;
	
	public void setname(String name1){
		this.name = name1;

	}
	public void getname(){
		System.out.println(name);
	}
}
public class encapsulation
{
	public static void main(String args[]){
		test obj = new test();
		obj.setname("satya");
		obj.getname();
	}
}