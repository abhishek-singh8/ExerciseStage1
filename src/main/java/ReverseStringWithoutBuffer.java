import java.util.Scanner;

public class ReverseStringWithoutBuffer {
	 String reverseString(String str) {
		char[] c=str.toCharArray();
		int l=c.length;
		for(int i=0;i<l/2;i++) {
			char temp=c[i];
			c[i]=c[l-i-1];
			c[l-i-1]=temp;
		}
		String revString=new String(c);
		return revString;
	}
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		String str=sc.next();
//		reverseString(str);
//	}
}
