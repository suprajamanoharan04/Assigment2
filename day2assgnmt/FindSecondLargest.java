package week3.day2assgnmt;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {3,2,11,4,6,7,2,3,3,6,7};
		
		 

		Set<Integer> unique = new TreeSet<Integer>();
			

		for (int i=0;i<num.length;i++)
		{
			unique.add(num[i]);
		}
		
		int Items = unique.size();

		List<Integer> f = new ArrayList<Integer>(Items);
		for (Integer i : unique) {
			f.add(i);
		}
		System.out.println("Items in the list = "+f);
		System.out.println("Second Largest Number in the List = " + f.get(Items-2));
		 

	}

}
