import java.util.Scanner;

public class TomAndJerry {
	
	boolean evenCheck(int num) {
		if(num%2==0) {
			return true;
		}
		else {
			return false;
		}
	}
	boolean oddCheck(int num) {
		if(num%2!=0) {
			return true;
		}
		else {
			return false;
		}
	}
	String rangeCheck(int num) {
		if(num>20 && num<30) {
			if( evenCheck(num)) {
				return "Tom";
			}
			else {
				return "Jerry";
			}
		}
		else {
			return "out Of Range";
		}
	}
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int num=sc.nextInt();
//		conditionCheck(num);
//		
//	}
}
