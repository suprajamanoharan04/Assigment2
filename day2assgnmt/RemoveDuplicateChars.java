package week3.day2assgnmt;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "PayPal India";


		char[] charArray = s.toCharArray();
		Set<Character> ch = new LinkedHashSet<Character>();

		Set<Character> ds = new LinkedHashSet<Character>();
		for (Character c : charArray) {

			if(!ch.add(c))
			{
				ds.add(c);
			}
			else {
			ch.add(c);
			}
		}
	    System.out.println("Original Charset after removing charset = " + ch);
	    System.out.println("Duplicates chars = " +ds);


         for (Character c1 : ds) {
        	 ch.remove(c1);
         }

         System.out.println("Only Unique chars = "+ch);

         for (Character c3 : ch) {

	   if(c3.equals(' '))
	   {
		ch.remove(c3);
		break;
	   }
}

       System.out.println("After removing empty space = " + ch);
	}

}
