package Code;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Concatenate all strings in a list. 
public class Q15 
{
	public static void main(String[] args)
	{
		List<String> words=Arrays.asList("Hi","Rohan.","How","are","you ?");
		
		String sentance=words.stream()
							 .collect(Collectors.joining(" "));
		
		System.out.println("Sentance Formed : "+sentance);
	}
}
