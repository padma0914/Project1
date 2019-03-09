<<<<<<< HEAD:src/oopsconceptspart1/TwoDimensionalArray.java
package oopsconceptspart1;
=======
package javaBasics;
>>>>>>> 62ff0ccfd7513dcf6243e0d6cf5adb5e52346ab8:src/javaBasics/TwoDimensionalArray.java

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s [][] =new String[4][5];
		
		s[0][0]="Aa";
		s[0][1]="Bb";
		s[0][2]="Cc";
		s[0][3]="Dd";
		s[0][4]="Ee";
		
		s[1][0]="Ff";
		s[1][1]="Gg";
		s[1][2]="Hh";
		s[1][3]="Ii";
		s[1][4]="Jj";
		
		s[2][0]="Kk";
		s[2][1]="Ll";
		s[2][2]="Mm";
		s[2][3]="Nn";
		s[2][4]="Oo";
		
		s[3][0]="Pp";
		s[3][1]="Qq";
		s[3][2]="Rr";
		s[3][3]="Ss";
		s[3][4]="Tt";
		
				
		//System.out.println(s.length);
	//System.out.println(s[0].length);

// to print all values in 2d array variable
	
	for (int row=0;row<s.length;row++){
		
		for(int col=0;col<s[0].length;col++){
			System.out.println(s[row][col]);
			
			
		
		}
		
		
		
		
		
		
	}
	
	
	}

}
