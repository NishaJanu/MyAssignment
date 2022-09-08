package week1.day1;

public class Mobile {
	
public void makeCall () {
	System.out.println("free call");
	String mobileModel="Moto E4";
	float mobileWeight=15f;
	
	
}
public void sendMsg () {
	System.out.println("free sms for 30days");	
boolean fullCharged=true;
int mobileCost=10000;

}
	public static void main(String[] args) {
		
		Mobile obj=new Mobile();
		System.out.println("This is my mobile");
		obj.makeCall();
		obj.sendMsg();
	}

}
