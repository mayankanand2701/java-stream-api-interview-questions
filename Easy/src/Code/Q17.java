package Code;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

// Calculate the average of a list of integers.
public class Q17 
{
	public static void main(String[] args) 
	{
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		
		double average=list.stream()
				.mapToInt(Integer::intValue)
				.average()
				.orElse(0.0);
		
		System.out.println("Average of list of numbers is : "+average);
	}
}
