package Code;

import java.util.Arrays;
import java.util.List;

// Sort a list of integers in ascending order. 
public class Q5 
{
	public static void main(String[] args) 
	{
		List<Integer> list=Arrays.asList(5,6,7,1,2,3,9,8);
		
		List<Integer> sortedList=list.stream()
									 .sorted()
									 .toList();
		
		System.out.println(sortedList);
	}
}
