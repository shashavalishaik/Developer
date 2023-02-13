package Programming;

import java.util.List;

public class FP01functional {
	
	private static void print(int number)
	{
		System.out.println(number);	
	}
	
	private static void printAllNumbersInListFunctional(List<Integer> numbers)
	{
//		for(int number:numbers)
//		{
//			System.out.println(number);
//		}
		
		numbers.stream().forEach(FP01functional::print);//method reference
	}
	
	public static void main(String[] args) {

		

		printAllNumbersInListFunctional(List.of(1,2,3,4,5));

	}

}
