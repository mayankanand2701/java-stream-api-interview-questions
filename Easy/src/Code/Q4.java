package Code;

import java.util.Arrays;
import java.util.List;

// Convert a list of strings to uppercase
public class Q4 
{
	public static void main(String[] args) 
	{
		List<String> words=Arrays.asList("Hi","Hello","How","Are","You");
		
		List<String> upperCase=words.stream()
									.map(s -> s.toUpperCase())
									.toList();
		
		System.out.println("Strings in Uppercase : "+upperCase);
	}
}
