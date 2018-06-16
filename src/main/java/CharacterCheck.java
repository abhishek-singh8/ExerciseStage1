import java.util.Scanner;

public class CharacterCheck {
	
	public static String inputLength(String s) {
		int len=s.length();
		if(len==1) {
			return "A valid character input";
		}
		else {
			return "Invalid character input";
		}
	}
	public String checkTypeChar(char c) {
	
		
		if (c >= 65 && c <= 90) {
			return (c + " is a Capital letter");

		} else if (c >= 97 && c <= 122) {
			return (c + " is a small letter");
		} else if (c >= 48 && c <= 57) {
			return (c + " is a number");
		} else {
			return (c + " is a special character");
		}
	}

//	public static void main(String[] args) {
//		CharacterCheck cC = new CharacterCheck();
//		Scanner sc = new Scanner(System.in);
//		char c = sc.next().trim().charAt(0);
//		System.out.println(cC.checkTypeChar(c));
//	}
}
