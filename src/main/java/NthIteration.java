import java.util.Scanner;

public class NthIteration {
	 String actualLoopChecking(int number) {
		 String loop="";
		 for(int i=1;i<=number;i++) {
			 for(int j=0;j<i;j++) {
				 loop=loop+i;
			 }
			 
		 }
		 return loop;
	 }
	 String printNthIteration(String num) {
		 try {
			 int number=Integer.parseInt(num);
			 return actualLoopChecking(number);
		 }
		 catch(NumberFormatException e) {
			 return "Not a number";
		 }
		
	 }
         public static void main(String[] args) {
        	 Scanner sc=new Scanner(System.in);
        	 NthIteration n=new NthIteration();
        	 String s=sc.next();
        	 System.out.println(n.printNthIteration(s));
         }
}
