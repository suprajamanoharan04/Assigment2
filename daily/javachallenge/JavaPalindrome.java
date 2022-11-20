package daily.javachallenge;

import java.util.Scanner;

public class JavaPalindrome {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner n=new Scanner(System.in);
      System.out.println("Input:");
      //getting input in string using scanner
      String s=n.nextLine();
     // Chaining to lower case
      String l=s.toLowerCase();
      String v=l.replaceAll("[^A-Za-z]", "");
      String rev="";
      System.out.println(v);
      for(int i=0;i<v.length();i++)
      {
    	  rev=v.charAt(i)+rev;
    	  
      }
      System.out.println(rev);
      if(v.equals(rev)) {
    	  System.out.println("true");
    	  System.out.println("\""+v+ "\" is a palindrome");
    	  
      }
      else {
    	  System.out.println("False");
    	  System.out.println("\""+v+ "\" is not a palindrome");
    	  
      }
	}

}
