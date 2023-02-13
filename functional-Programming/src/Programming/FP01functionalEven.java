package Programming;

import java.util.List;

public class FP01functionalEven {
	
//	private static void print(int number)
//	{
//		System.out.println(number);	
//	}
	
	private static boolean isEven(int number)
	{
		return number%2==0;
	}
	
	private static void printEvenNumbersInListFunctional(List<Integer> numbers)
	{
//		for(int number:numbers)
//		{
//			System.out.println(number);
//		}
		
		numbers.stream()
		.filter(FP01functionalEven::isEven);
		//.forEach(FP01functionalEven::print);//method reference
	}
	
	public static void main(String[] args) {

		
        List<Integer> numbers=List.of(1,2,3,4,5);

        printEvenNumbersInListFunctional(numbers);
	}

}
