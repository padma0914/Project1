
// *******Non static methods****** >> they are object bound ie need to create and object to access the non static methods
//Methods with no input and no out put
//Methods with input and out put --uses return keyword
//methods with no input but out put --
//we need to store the returned value in a variable and print it
//we never write return statement inside the main method
package oopsconceptspart1;

public class FunctiosInJava {

	public static void main(String[] args) {
		
		FunctiosInJava f= new FunctiosInJava();
		/* object created and all the non static methods will be made accessible through the object 
		reference*/
		f.addition();
		int i=f.division(288, 8);
		System.out.println(i);
		String p=f.printing();
		System.out.println(p);
	}
	
	//void = does no return any value and have return type void
		public void addition(){
			System.out.println("Method with no input and output");
			
			}
		public String printing(){
			System.out.println("Method with only output");
			String s="selenium with Java";
			return s;
		}

		public int division(int a,int b){
			System.out.println("Method with bothinput and output");
			int c=a/b;
			return c;
			
		}

}
