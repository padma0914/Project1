/*class ---> building block of object oriented programming where we define date and functions of the class
and object is an instance of class */

//
package oopsconceptspart1;

public class Car {
	
	
	//class varibles
	
	int mno;
	String name;

	public static void main(String[] args) {
	 
		Car c=new Car();
		Car a=new Car();
		
	//new key word is used to create the object
	// a ,c --> object references 
		c.mno=123;
		c.name="BMW";
		a.mno=234;
		a.name="KIA";
	
		
		
	}

}
