package assignment5;

public class Automation extends MultipleLangauge implements Language{
	

	

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("selenium");
	}

	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("javatool");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("ruby");
	}
public static void main(String[] args) {
	Automation auto=new Automation();
	auto.python();
	auto.ruby();
	auto.Selenium();
	auto.Java();
}
}
