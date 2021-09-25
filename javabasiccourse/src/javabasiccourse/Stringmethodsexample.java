/**
 * 
 */
package javabasiccourse;

import java.*;
import java.util.Arrays;

/**
 * @author sutanu
 *
 */
public class Stringmethodsexample {

	/**
	 * 
	 */
	public Stringmethodsexample() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* example of length() method*/
		String s1=new String();
		String s2="Example String";
		String s3="";
		String s4=" ";
		System.out.println("Length of Emty String s1:"+s1.length());
		System.out.println("Length of String s2:"+s2.length());
		System.out.println("Length of String s2:"+s3.length());
		System.out.println("Length of String s2:"+s4.length());
		/*example of isempty()*/
		System.out.println("Is s1 empty:"+s1.isEmpty());
		System.out.println("Is s2 empty:"+s2.isEmpty());
		System.out.println("Is s3 empty:"+s3.isEmpty());
		System.out.println("Is s4 empty:"+s4.isEmpty());
		/*example of charAt*/
		System.out.println("char at 0 of s1:"+s2.charAt(0));
		System.out.println("char at last of s1:"+s2.charAt(s2.length()-1));
		/*example of getChars() 
		 *getChars(int sourceBegin, int sourceEnd, char[] dest, int destBegin)
		 sourcebeginbeing start inxes w.r.t 0 and source end being the index of last char copied+1,same for desbegin
		 **/ 
		 char[] dest= {'\000','\000', '\000', '\000', '\000' };
		 s2.getChars(2, 5, dest, 1);
		 System.out.println(Arrays.toString(dest));
		 /*Exampleof toCharArray() */ 
		  char[] example=s2.toCharArray();
		  System.out.println(Arrays.toString(example));
		 
	}

}
