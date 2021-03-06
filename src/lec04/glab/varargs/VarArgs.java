package lec04.glab.varargs;

import java.lang.String;import java.lang.System;public class VarArgs {


	public static void main(String[] args) {

		sum("The sum of",8,2,5,7, 6, 8, 101, -9);

	}
	
	//varargs, introduced in Java5
    //notice how the varargs argument is last!
    //once inside the method, the param Type... is treated as Type[]
    //so, int... becomes int[]
	private static void sum(String strSum, int... nParams){
		int nResult = 0;
		System.out.print(strSum + " ");
		//notice that the int... is converted to int[] inside the method
		for (int nC = 0; nC < nParams.length; nC++) {
            //just output to the command-line
			if (nC == nParams.length - 1){
				System.out.print("and " + nParams[nC]);
            }
			else {
			     System.out.print(nParams[nC] + ", ");
            }

            //do the summing
			nResult += nParams[nC]; 
		}
		
		System.out.print(" is: " + nResult);
		
	}

}
