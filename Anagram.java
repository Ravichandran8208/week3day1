package week3day1;

public class Anagram {

	public static void main(String[] args) {
		String text1="stops";
		String text2="potss";
		int sd =text1.length();
		int ds=text2.length();
		char[] s1=  text1.toCharArray();
		char[] s2=text2.toCharArray();
		int len=s1.length;
		int len1=s2.length;
		if(len==len1) {
			System.out.println("same vlues");;
			
		}
		else {
			System.out.println("different values");
			
		}
		if(sd==ds) {
			System.out.println("same");
		}
		else {
			System.out.println("different");
		}
		
		
		
		

		
				
		
		

	}

}
