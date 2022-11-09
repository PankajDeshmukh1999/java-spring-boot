package retraining;

public class Smartphone {
	
	Mobile mobile = null; //HAS-A
	
	public void whatsapp() {
		System.out.println("In Whatsapp");
		System.out.println(mobile.brandName);
		System.out.println(mobile.cost);
		System.out.println(mobile.inch);
		mobile.voicCall();
		mobile.sms();

	}
	
	public void videoCall() {
		System.out.println("Video call is avilable on " + mobile.brandName+" Mobile");
	}
	public static void main(String[] args) {
		Smartphone smartphone = new Smartphone();
		smartphone.whatsapp();
		System.out.println("-----------------------");
		smartphone.videoCall();
	}

}
