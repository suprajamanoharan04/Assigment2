package assignment4;

public class Students {
	public void getStudentInfo(int id ) {
		System.out.println(id);
		
	}
	public void getStudentInfo(String name,int id ) {
		System.out.println(name);
		System.out.println(id);	
		
	}
	public void getStudentInfo(int phoneNumber,String email ) {
		System.out.println(phoneNumber);
		System.out.println(email);
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Students details=new Students();
		details.getStudentInfo(58);
		details.getStudentInfo(897456321, "supraja.mano@gmail.com");
		details.getStudentInfo("subbu",58);
		
	}

}
