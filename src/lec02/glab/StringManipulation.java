package lec02.glab;

import java.awt.*;

public class StringManipulation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		//this is a String literal  "Hello World";
		//a String literal has no object reference, so unless it's assined to
		   //a reference or a passed into a method, and then assined, it's unfindable
		
		//strResult refers to "Hello World." now. 
		String strResult1 = "Hello " + "World.";
		System.out.println(strResult1);
		
		String strOne = "CSPP";
		String strTwo = strOne; //sometimes this will copy references, and sometimes values
		                        //so you must assume values

		
		String strState = "Mississippi";
		System.out.println(strState);
		strState = strState.replaceFirst("issipp", "our");
		System.out.println(strState);
		System.out.println(strState.length());
		
		System.out.println("Pardon me " + strState.substring(0,4));
		
		String strNeedsTrim = "    some string     ";
		System.out.println(strNeedsTrim);
		strNeedsTrim = strNeedsTrim.trim();
		System.out.println(strNeedsTrim);
		
		System.out.println(strOne.compareTo(strTwo));
		
		System.out.println("Hello".compareTo("Hello"));
		
		int nPos = strNeedsTrim.indexOf(' ');
		System.out.println(nPos);
		
		System.out.println(strState.endsWith("i"));


        //string pools

        String strBig0 = new String("Illinois");
        String strBig1 = new String("Indiana");
        String strBig2 = new String("Iowa");
        String strBig3 = new String("Michigan");
        String strBig4 = new String("Michigan State");
        String strBig5 = new String("Minnesota");
        String strBig6 = new String("Nebraska");
        String strBig7 = new String("Northwestern");
        String strBig8 = new String("Ohio State");
        String strBig9 = "Pennsylvania";
        String strBig10 = "Purdue";
        String strBig11 = "Wisconsin";

        String strNoLake0 = new String("Iowa");
        String strNoLake1 = new String("Nebraska");


        System.out.println(56.21 == 56.21);

        //the == sign is comparing memory address
        Rectangle recOne = new Rectangle(2,3,4,5);
        Rectangle recTwo = new Rectangle(2,3,4,5);

        //this is false
        System.out.println(recOne == recTwo);


        recOne = recTwo;
        //this is true
        System.out.println(recOne == recTwo);


        //this should be false, but sometimes it's true??
        System.out.println(strNoLake1 == strBig6);




    }
	
	
	
	

}
