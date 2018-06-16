import java.util.Scanner;

public class NcharacterRepeatNTimes {

	  String lastCharRepeat(String str , String n) {
	
		int len=str.length();
		int nth;
		try {
		nth=Integer.parseInt(n);
		}
		catch(NumberFormatException e) {
			return "Invalid Number input";
		}
		if(nth<0) {
			return "Number cannot be negative";
		}
		if(len==0) {
			return "String cannot be empty";
		}
		if(nth>len) {
			return "n is Greater than length not possible";	
		}
		else {
			int fromBeg=len-nth;
			String sub=str.substring(fromBeg);
			for(int i=0;i<nth;i++) {
				str=str+sub;
			}
			return str;
		}
		
	}
//	public static void main(String[] args) {
//          Scanner sc=new Scanner(System.in);
//          String str=sc.next();
//          int n=sc.nextInt();
//          lastCharRepeat(str,n);
//	}

}
