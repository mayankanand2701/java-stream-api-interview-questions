package Code;

import java.util.Arrays;
import java.util.List;

// Flatten a List of Lists
public class Q14
{
	public static void main(String[] args) 
	{
		List<List<Integer>> listOfLists = Arrays.asList(
			    Arrays.asList(1, 2, 3),
			    Arrays.asList(4, 5),
			    Arrays.asList(6, 7, 8, 9)
			);
		
		List<Integer> flattenList=listOfLists.stream()
											 .flatMap(List::stream)
											 .toList();
		
		System.out.println("Flattend List : "+flattenList);
	}
}
