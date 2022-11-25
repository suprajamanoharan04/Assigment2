package week3.day2assgnmt;

import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n= {1,4,7,8,2,8,10,9};
		Set<Integer> missnum=new TreeSet<Integer>();
		for(int i=0;i<n.length;i++) {
			missnum.add(n[i]);
		}
		System.out.println("After removing duplicated: "+ missnum);
		for(int j=0;j<missnum.size()+1;j++) {
			if(!missnum.contains(j)) {
				System.out.println("Missing number: "+ j);
			}
		}
		

	}

}
