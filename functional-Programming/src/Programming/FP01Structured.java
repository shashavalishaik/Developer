package Programming;

import java.util.List;

public class FP01Structured {
	
	private static void printAllNumbersInListStructured(List<Integer> numbers)
	{
		for(int number:numbers)
		{
			System.out.println(number);
		}
		
		
	}
	
	public static void main(String[] args) {

		

		printAllNumbersInListStructured(List.of(1,2,3,4,5));

	}

}
