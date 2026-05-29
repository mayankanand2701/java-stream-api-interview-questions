package Code;

import java.util.Arrays;
import java.util.List;

// Extract distinct odd numbers.
public class Q13 
{
	public static void main(String[] args) 
	{
		List<Integer> list=Arrays.asList(1,2,1,3,4,5,6,7,8,8,7,9);

		List<Integer> oddNumbers=list.stream()
									 .filter(n -> n%2!=0)
									 .distinct()
									 .toList();
		
		System.out.println("Distinct Odd Numbers form List : "+oddNumbers);
	}
}
