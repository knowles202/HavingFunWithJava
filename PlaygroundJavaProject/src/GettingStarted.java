
public class GettingStarted {

	public static void main(String[] args) {
	//	fizzBuzz(120);
		double finalResult = multiplyWithoutSymbols(10,200);	
		System.out.print(finalResult);
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
	public static double multiplyWithoutSymbols(double theFirstNumber, double theSecondNumber){
		int runningTotal = 0;
		
		for(int i = 0; i < theFirstNumber; i++){
			runningTotal += theSecondNumber;
		}
		
		return runningTotal;
	}

}
