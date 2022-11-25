package week3.day2;
import java.util.*;
public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] word= {"g","o","o","g","l","e"};
		Set <String> uniquset= new HashSet<String>();
		for(int i=0;i<word.length;i++) {
			uniquset.add(word[i]);
		}
System.out.println(uniquset);


	}

}
