package week3.day2assgnmt;

import java.util.TreeMap;

public class FindNumbersOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] b = {2,3,5,6,3,2,1,4,2,1,6,-1};
		
		TreeMap<Integer, Integer> s=new TreeMap<Integer, Integer>();
		for(int i=0;i<b.length;i++) {
			if(s.containsKey(b[i]))
			{
				int v=s.get(b[i]);
				s.put(b[i], v+1);
				
			}
			else
			{
				s.put(b[i], 1);
			}
		}
     System.out.println("Find Number Occuramce : "+ s);
	}

}
