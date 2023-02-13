package Programming;

import java.util.List;

public class FP01StructuredEven {
	
	private static void printEvenNumbersInListStructured(List<Integer> numbers)
	{
		for(int number:numbers)
		{
			if(number%2==0)
			{
			System.out.println(number);
		}
		}
		
	}
	
	public static void main(String[] args) {

		

		printEvenNumbersInListStructured(List.of(1,2,3,4,5));

	}

}
