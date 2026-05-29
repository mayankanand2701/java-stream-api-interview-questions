package Code;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

// Remove null values from a list.
public class Q16 
{
	public static void main(String[] args)
	{
		List<String> words=Arrays.asList("Hi",null,"Rohan.",null);
		
		List<String> newList=words.stream()
								  .filter(Objects::nonNull)
								  .toList();
		
		System.out.println("New List without null : "+newList);
	}
}
