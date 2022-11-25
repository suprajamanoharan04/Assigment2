package week3.day2assgnmt;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		
		String[] spl=text.split(" ");
		Set<String> unique=new HashSet<String>();
		for(int i=0;i<spl.length;i++) {
			unique.add(spl[i]);
		}
		System.out.println("RemoveDuplicate Words : "+unique);
	}

}
