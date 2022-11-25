package week3.day2assgnmt;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;



public class FirstMostDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String t="bbabababa";
        Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
        char[] charArray1= t.toCharArray();
        for(char c : charArray1)
        {
            map.put(c, map.getOrDefault(c,0)+1) ;   
            }
        System.out.println(map);
        
        Set<Map.Entry<Character,Integer>> entrySet = map.entrySet();
        int m=0;
        char j=0;
        for(Map.Entry<Character,Integer>entry: entrySet) {
            if(entry.getValue()>m)
        {
            j=entry.getKey();
            m=entry.getValue();
        }
            
          }
                
        System.out.println("no of occurence = "+  m);
        System.out.println("character = " + j);
	}

}
