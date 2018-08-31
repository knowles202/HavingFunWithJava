
public class GettingStarted {

	public static void main(String[] args) {
		//fizzBuzz(120);
		//double finalResult = multiplyWithoutSymbols(10,200);
		//System.out.print(finalResult);

		/*int myNum = (10 + 5) + (2 * 10);
		int mySecondNum = 12;
		int myThirdNum = myNum * 2;

		int myTotal = myNum + mySecondNum + myThirdNum;
		System.out.println(myTotal); */

		/*byte myAwesomeByte = 100;
		short myAwesomeShort = 1340;
		int myAwesomeInt = 9;
		long myAwesomeLong = (long) 50000 + (10 * (myAwesomeByte + myAwesomeShort + myAwesomeInt));
		float myAwesomeFloat = 5.4f;
		double myDoubleValue = 5.25;

		double weightInPounds = 185;
		double weightInKilos = (weightInPounds * 0.45359237);
		System.out.print(weightInKilos);

		boolean myBoolean = false;
		boolean isMale = true;*/

		stringStrangler();


		}
	
	// For any given Max Number, iterate through a loop and print FizzBuzz if it
	// is divisable by both 3 and 5, Fizz if it is divisable by 3, and Buzz if it is
	// divisable by 5. Else, print the number as an int.
	public static void fizzBuzz(int theMaximumNumber){
		
		for(int x = 1; x <= theMaximumNumber; x++)
		{
			if((x % 3 == 0) && (x % 5 == 0)){
				System.out.println("FizzBuzz");
			}
			else if(x % 3 == 0){
				System.out.println("Fizz");
			}
			else if(x % 5 == 0){
				System.out.println("Buzz");
			}
			else {
				System.out.println(x);
			}
		}
		
	}
	
	
	// Write a method that multiplies any two numbers WITHOUT using *
	private static double multiplyWithoutSymbols(double theFirstNumber, double theSecondNumber){
		int runningTotal = 0;
		
		for(int i = 0; i < theFirstNumber; i++){
			runningTotal += theSecondNumber;
		}
		
		return runningTotal;
	}

	private static void stringStrangler()
	{
		String theString = "This is a string.";
		System.out.println("theString is equal to " + theString);
		theString = theString + ", and this is more.";
		System.out.println("theString is equal to " + theString);
		theString = theString + " \u00A9 2018"; //This is unicode for copyright symbol
		System.out.println("theString is equal to " + theString);

		String numberString = "250.55";
		numberString = numberString + "49.95";
		System.out.println("The result is " + numberString);

		String lastString = "10";
		int myInt = 50; //Java will convert this int into a string...
		lastString = lastString + myInt;
		System.out.println("LastString is equal to " + lastString); // right here.

		

	}


}
