package Code;

import java.util.Arrays;
import java.util.List;

// Filter even numbers from a list of integers. 
public class Q3 
{
	public static void main(String[] args)
	{
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		
		List<Integer> evenNumbers=list.stream()
									  .filter(n -> n%2==0)
									  .toList();
		
		System.out.println("Even numbers from the list : "+evenNumbers);
	}
}
