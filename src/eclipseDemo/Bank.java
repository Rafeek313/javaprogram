package eclipseDemo;

public class Bank {
	float getRateOfIntrest() {
		return 0;
		
}

	public static void main(String[] args) {
		Bank b;
		b=new Sbi();
		System.out.println("SBI rate of intrest:"+b.getRateOfIntrest());
		b=new Icici();
		System.out.println("ICICI rate of intrest:"+b.getRateOfIntrest());
		b=new Axis();
		System.out.println("AXIS rate of intrest:"+b.getRateOfIntrest());
	}

}
