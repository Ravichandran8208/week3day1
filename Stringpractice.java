package week3day1;

public class Stringpractice {
		
	

	public static void main(String[] args) {
		String str= new String("kutty");
		String st1r= new String("kutty");
		String str2="I am Learning  Java";
		String str3="I am learning java";		
		str.equals(st1r);
		String text ="Java Exercise";
		char ch=text.charAt(5);
		char ch1=text.charAt(11);
		System.out.println(ch);
		System.out.println(ch1);
		System.out.println(str2.equals(str3));
		System.out.println(str2.equalsIgnoreCase(str3));
		if(str.equals(st1r)) {
			System.out.println("same");
		}
		else {
			System.out.println("different");
		}
	}
}
	



	


