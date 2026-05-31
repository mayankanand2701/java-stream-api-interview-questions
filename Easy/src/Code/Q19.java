package Code;

import java.util.Arrays;
import java.util.List;

// Sort strings alphabetically. 
public class Q19 
{
	public static void main(String[] args)
	{
		List<String> words=Arrays.asList("Dog","Cat","Rat","Kite","Ant");
		
		List<String> sortedWords=words.stream()
									  .sorted()
									  .toList();
		
		System.out.println("List after sorting alphabetically : "+sortedWords);
	}
}
