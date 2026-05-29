package Code;

import java.util.Arrays;
import java.util.List;

// Reverse each word in a list of string
public class Q18 
{
	public static void main(String[] args) 
	{
		List<String> words=Arrays.asList("Dog","Cat","Rat","Kite");
		
		List<String> reverseString=words.stream()
										.map(word -> new StringBuilder(word).reverse().toString())
										.toList();
		
		System.out.println("List of string after reverse operation : "+reverseString);
	}
}
