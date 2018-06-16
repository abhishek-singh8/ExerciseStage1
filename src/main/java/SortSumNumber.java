import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortSumNumber {
	public int sumEvenNumber(ArrayList<Integer> al) {
		int count=0;
		for(int i=0;i<al.size();i++) {
			if(al.get(i)%2==0) {
				count=count+al.get(i);
			}
		}
		countSumCheck(count);
		return count;
		
	}
	boolean countSumCheck(int count) {
		if(count>15) {
			return true;
		}
		else {
			return false;
		}
	}
	public int reveseNum(int num) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		while(num>0) {
			int x=num%10;
			al.add(x);
			num=num/10;
		}
		Collections.sort(al,Collections.reverseOrder());
		int newNumber=0;
		for(int i=0;i<al.size();i++) {
			newNumber=al.get(i)+newNumber*10;
		}
		sumEvenNumber(al);
		
		return newNumber;
		
//		System.out.print("Number after sorting in non-increasing order : ");
//		int count=0;
//		for(int i=0;i<al.size();i++) {
//			System.out.print(al.get(i));
//			if(al.get(i)%2==0) {
//				count=count+al.get(i);
//			}
//		}
//		System.out.println();
//		System.out.println("Sum of number : "+count);
//		if(count>15) {
//			System.out.println("true");
//		}
//		else {
//			System.out.println("false");
//		}
	}
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	SortSumNumber s=new SortSumNumber();
    	int n=sc.nextInt();
    	System.out.println(s.reveseNum(n));
    }
}
