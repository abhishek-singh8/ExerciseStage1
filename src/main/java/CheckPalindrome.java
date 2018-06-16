import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class CheckPalindrome {
	
	  String palindromeSum(ArrayList<Integer> al) {
			int evenCount=0;
			int len=al.size();
			for(int j=0;j<len;j++) {
				if(al.get(j)%2==0) {
					evenCount=evenCount+al.get(j);
				}
				
				
			}
			if(evenCount>25) {
				return "Palindrome and evenCount is greater than 25";
			}
			else {
				return "Palindrome but even count is less than 25";
			}
	  }
	
	  public boolean checkPalindrome(int num) {
		int i=0;
		int[] numArray=new int[1000];
		while(num>0) {
			int x=num%10;
			numArray[i]=x;
			i++;
			num=num/10;	
		}
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int j=0;j<i;j++) {
			al.add(numArray[j]);
		}
		Collections.reverse(al);
		int len=al.size();
		int flag=0;
		for(int j=0;j<len/2;j++) {
			if(al.get(j)==al.get(len-j-1)){
				flag=0;
			}
			else {
				flag=1;
				break;
			}
		}
		if(flag==1) {
			return false;
		}
		else {
		    palindromeSum(al);
			return true;
		}
	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		CheckPalindromeTest cp=new CheckPalindromeTest();
//		Scanner sc =new Scanner(System.in);
//		int num=sc.nextInt();
//		cp.checkPalindrome(num);
//		
//
//	}

}