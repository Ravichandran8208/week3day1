package week3day1;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test="I am a software tester";
		String[] word= test .split(" ");
		for(int i=0;i<word.length;i++) {
			if(i%2!=0) {
				char[] ca=word[i].toCharArray();
				for(int j=ca.length-1;j>=0;j--) {
					System.out.print(ca[j]);
				}
				System.out.print(" ");
			}
			else {
				System.out.print(word[i]+" ");
			}
			
		}
				

	}

}
