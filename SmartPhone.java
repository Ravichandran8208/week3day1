package week3day1;

public class SmartPhone extends AndroidPhone{
	public void connectWhatsApp() {
		System.out.println("connected");
	

	}
	public void takevideo() {
		 System.out.println("video captured");
		

	}

	public static void main(String[] args) {
		SmartPhone dd=new SmartPhone();
		dd.takeVideo();
		dd.connectWhatsApp();
		
	}



	}


