package week3.day2assgnmt;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		int count=0;
		String[] spl=text.split(" ");
		String txt="";
		for(int i=0;i<spl.length;i++) {
			count=0;
			for(int j=0;j<spl.length;j++) {
				if(spl[i].equals(spl[j]))
				{
					count++;
					if(count>1) {
						spl[j].replace(spl[j], " ");
						break;
					}
					if(i==j)
					{
						txt=txt+spl[j]+" ";
					}
				}
				
			}
			
		}
 System.out.println("String without duplicate words: "+txt);
	}

}
