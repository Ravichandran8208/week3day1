package week3day1;

public class FindTypes {

	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$";
		char[] sd = test.toCharArray();
		for(int i=0;i<=sd.length;i++) {
			char c=test.charAt(i);
			if(Character.isAlphabetic(c)) {
				System.out.println("letter:"+c);
				
			}
			else if(Character.isDigit(c)) {
				System.out.println("num:"+c);
			}
			else if(Character.isSpaceChar(c)) {
				System.out.println("spacechar:"+c);
		}
			else if(Character.isSpace(c)) {
				System.out.println("space:"+c);
			}
			//else {
				//System.out.println("none");
			//}
		
		}
}
}
			
		
	 
	

	



