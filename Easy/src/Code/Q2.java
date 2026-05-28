package Code;

import java.util.Arrays;
import java.util.List;

// Count number of elements in a stream. 
public class Q2 
{
	public static void main(String[] args)
	{
		List<Integer> list=Arrays.asList(1,2,3,4,5,6);
		
		long count=list.stream()
						.count();
		
		System.out.println("Count of all elements in the list : "+count);
	}
}
