package week3.day2assgnmt;

import java.util.HashSet;
import java.util.Set;
//import java.util.TreeSet;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="babu";
		char[] CharArrary=name.toCharArray();
		Set<Character> unique=new HashSet<Character>();
		for(int i=0;i<CharArrary.length;i++) {
			boolean add = unique.add(CharArrary[i]);
			if(!add)
			{
				if(unique.contains(CharArrary[i]))
				{
					unique.remove(CharArrary[i]);
				}
				else
				{
			unique.add(CharArrary[i]);
				}
			}	
		}
		System.out.println("Print Unique Character : "+unique);
	}

}
