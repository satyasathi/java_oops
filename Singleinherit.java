//=================single inheritance==============
// process of deriving only one sub class from parent class

/*
import java.util.*;
import java.io.*;
class Shape{
	int side=10;
}
class Square extends Shape
{
	void area(){
		int area = side * side;
		System.out.println("area of square :" + area);
	}
}

class Singleinherit{
public static void main(String args[]){
	Square s = new Square();
	s.area();
}
}

*/


import java.util.*;
class Shape{
	// private int side; - private method can't inherit its properties in child class whereas remaining does.
	public int side; 
	public Shape(int side){
		this.side=side;
	}
	public void display(){
		System.out.println("this is parent class");
	}
}
class Square extends Shape{
	public Square(int side){
		super(side);
	}
	void area(){
		super.display();  // calls display() in Shape class and prints 'this is parent class'
		int area = side * side;
		System.out.println(area);
	}
}

class Singleinherit{
public static void main(String args[]){
	Square s = new Square(100);
	s.area();   //calls area() in Square class and prints area  
	s.display();  //calls display() in Shape class and prints 'this is parent class'
}
}