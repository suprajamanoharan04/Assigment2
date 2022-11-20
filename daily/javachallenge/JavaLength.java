package daily.javachallenge;

public class JavaLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s1="Hello World";
     String s2="fly me to   the moon";
     String s3="luffy is still joyboy";
     String[] a1=s1.split(" ");
     int l1=a1[a1.length-1].length();
     System.out.println("The last word is World with length "+l1);
     String[] a2=s2.split(" ");
     int l2=a2[a2.length-1].length();
     System.out.println("The last word is World with length "+l2);
     String[] a3=s3.split(" ");
     int l3=a3[a3.length-1].length();
     System.out.println("The last word is World with length "+l3);
     
	}

}
