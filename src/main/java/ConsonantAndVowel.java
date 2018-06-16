import java.util.ArrayList;
import java.util.Scanner;

public class ConsonantAndVowel {
	ArrayList<String> al=new ArrayList<String>();
	public  ArrayList<String> checkVowelAndConsonant(String s) {
		int l=s.length();
		for(int i=0;i<l;i++) {
			char c=s.charAt(i);
			int ascii=c;
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				al.add(c+" is vowel");
			}
			else if((ascii>=65 && ascii<=90) || ascii>=97 && ascii<=122) {
				al.add(c+" is consonant");
			}
			else {
				al.add("Not a letter");
			}
		}
		return al;
	}
     public static void main(String[] args) {
    	 Scanner sc=new Scanner(System.in);
    	 ConsonantAndVowel cv=new ConsonantAndVowel();
    	 String s=sc.next();
    	 ArrayList<String>al=cv.checkVowelAndConsonant(s);
    	 for(int i=0;i<al.size();i++) {
    		 System.out.println(al.get(i));
    	 }
     }
}
