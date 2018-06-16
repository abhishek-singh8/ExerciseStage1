import java.util.Scanner;

public class OnlyIntegerSum {
   String checkForIntegerOnly(String s)  {
	  
	  String str[]=s.split(" ");
	  int count=0;
	  for(int i=0;i<str.length;i++) {
		  
		  try {
		  int x=Integer.parseInt(str[i]);
		  count=count+x;
		  }
		  catch(NumberFormatException e) {
			  return "Invalid input";
		  }
	  }
	  return count+"";

	  
  }
//	public static void main(String[] args) throws Exception {
//		Scanner sc=new Scanner(System.in);
//		OnlyIntegerSum os=new OnlyIntegerSum();
//		
//		System.out.println(os.checkForIntegerOnly("24 as"));
//		
//	}
	
}
