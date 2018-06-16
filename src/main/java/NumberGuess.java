
public class NumberGuess {
	
	public String guessTargetnumber(String userInput) {
		int userInputNum;
		int targetNumber=37;
	   try { 
		 userInputNum=Integer.parseInt(userInput);
	     }
	   catch(NumberFormatException e) {
		   return "Given input is not a number";
	   }
	   if(userInputNum<1 || userInputNum>50) {
		   return "User Input is out of range";
	   }
	   else {
			   if( userInputNum<targetNumber) {
				   return "Your number is less than the target";
			   }
			   else if(userInputNum>targetNumber) {
				   return "Your number is greater than the target";
			   }
			   else {
				   return "Your number matches exactly";
			   }
	   }
	   
	}
//	public static void main(String[] args) {
//		
//	}
}
