package Code;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Partition numbers into even and odd
public class Q3
{
	public static void main(String[] args)
	{
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		Map<String, List<Integer>> group = numbers.stream()
		        								  .collect(Collectors.groupingBy(n -> n % 2 == 0 ? "EVEN" : "ODD"));
		
		System.out.println("List : "+group);
	}
}
