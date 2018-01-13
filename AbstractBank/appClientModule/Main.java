/*
A class that is declared with abstract keyword, is known as abstract.
It can have abstract and non-abstract methods (method with body)

*/

/*  Abstraction in java
    Abstraction is a process of hiding the implementation details and 
    showing only functionality to the user.
	   
	Two ways to achieve abstraction in java
	1. Abstract class (0 to 100%)
	2. Interface (100%)
 */

abstract class Bank {
	
	abstract float rateOfInterest(); // must add abstract keyword
	
	void getNonAbstractMethod() // Non-abstract methods 
	{
		System.out.println("Non Abstract Method called");
	}
	
}

class SBI extends Bank{
 
	float rateOfInterest() {
		return 8.2f;
	}
	 
}

class PNB extends Bank{
	 
	float rateOfInterest() {
		return 8.0f;
	}
	 
}

public class Main {
	public static void main(String[] args) {

		Bank bSBI = new SBI();  
		System.out.println("SBI of the PNB bank :"+bSBI.rateOfInterest());
		 
		Bank bPNB = new PNB();
		System.out.println("ROI of the PNB bank :"+bPNB.rateOfInterest());
		
		bPNB.getNonAbstractMethod(); 
		 
		//s
	}

	  
}