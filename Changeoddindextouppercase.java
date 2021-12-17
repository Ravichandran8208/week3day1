package week3day1;

public class Changeoddindextouppercase {

	public static void main(String[] args) {
		String test ="changeme";
		//StringBuilder sb =new StringBuilder();
		
		//char[] word=tst.toCharArray();
		for(int i=0;i<=1;i++) {
			char c=test.charAt(i);
			if(i%2!=1) {
				System.out.println(test.toUpperCase());
				
				
			}
		//	else {
				//System.out.println(test.toLowerCase());
				
			}
		}
		
		

	}


