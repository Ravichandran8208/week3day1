package week3day1;

public class Calculatorpoly {
public void multiply(int num1,int num2) {
		System.out.println(num1*num2);

	}
public void multiply(int num1,int num2, int num3) {
	
	System.out.println(num1*num2*num3);

}
public void substract(int num1,int num2) {
	System.out.println(num1-num2);
	

}
public void subsstract(int num1,int num2,int num3) {
	System.out.println(num1-num2-num3);

}
public void divide(int num1,int num2) {
	System.out.println(num1/num2);

}
private void divide(int  num1,int num2,int num3) {
	System.out.println(num1/num2/num3);

}


	public static void main(String[] args) {
		Calculatorpoly multi=new Calculatorpoly();
		multi.multiply(20, 40);
		multi.multiply(20, 30, 40);
		multi.divide(20, 10);
		multi.substract(50, 30);
		multi.subsstract(50, 30, 10);
		multi.divide(40, 2, 10);
	

	}

}
