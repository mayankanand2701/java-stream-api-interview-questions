package Code;

import java.util.Arrays;
import java.util.List;

// Remove duplicate elements from a list.  
public class Q12 
{
	public static void main(String[] args) 
	{
		List<Integer> list=Arrays.asList(1,2,1,3,4,5,6,7,8,8,7,9);
		
		List<Integer> oddNumbers=list.stream()
									 .distinct()
									 .toList();
		
		System.out.println("Distinct Numbers form List : "+oddNumbers);
	}
}
