package Code;

import java.util.Arrays;
import java.util.List;

// Find the sum of all elements in a list. 
public class Q1 
{
	public static void main(String[] args) 
	{
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		
		int sum=list.stream()
					.mapToInt(n -> n.intValue())
					.sum();
		
		System.out.println("Sum of all elements in list is : "+sum);
	}
}
