package week1.day2;

public class Mobile {
	public void makeCall() {
		String mobileModel = "Samsung Galaxy S21";
		float mobileWeight = 150.4f;
		System.out.println(mobileModel + "\n"+ mobileWeight );
	}
	public void sendMsg() {
		boolean isFullCharged = true;
		int mobileCost = 80000;
		System.out.println(isFullCharged + "\n"+ mobileCost );
	}
public static void main (String [] args) {
	Mobile class1 = new Mobile();
	class1.makeCall();
	Mobile call1 = new Mobile();
	call1.sendMsg();

	System.out.println("This is my mobile");
}

}
