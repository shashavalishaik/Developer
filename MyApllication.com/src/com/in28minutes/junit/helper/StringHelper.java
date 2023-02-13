package com.in28minutes.junit.helper;

public class StringHelper {
    
	// AACD=>CD, ACD=>CD
	public String truncateAInFirst2Positions(String str) {
		if (str.length() <= 2)
			return str.replaceAll("A", "");
	//	System.out.println(str);
		String first2Chars = str.substring(0, 2);
	//	System.out.println(first2Chars);
		String stringMinusFirst2Chars = str.substring(2);
	//	System.out.println(stringMinusFirst2Chars);

		return first2Chars.replaceAll("A", "") 
				+ stringMinusFirst2Chars;
	}

	
	//ABCD=> FALSE , ABAB=>TRUE, AB=>TRUE, A=>FALSE
	public boolean areFirstAndLastTwoCharactersTheSame(String str) {

		if (str.length() <= 1)
			return false;
		if (str.length() == 2)
			return true;

		String first2Chars = str.substring(0, 2);
	//	System.out.println(first2Chars);
		String last2Chars = str.substring(str.length() - 2);
	//	System.out.println(last2Chars);
		return first2Chars.equals(last2Chars);
	}
	
	public static void main(String[] a)
	{
		StringHelper s=new StringHelper();
		//s.truncateAInFirst2Positions("vali");
	//	System.out.println(" "+s.truncateAInFirst2Positions("AACD"));
	//	System.out.println(""+s.areFirstAndLastTwoCharactersTheSame("vali"));
	}

}
