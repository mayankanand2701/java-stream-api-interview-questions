package Code;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

// Find the difference between max and min number. 
public class Q1 
{
	public static void main(String[] args)
	{
		 List<Integer> numbers = Arrays.asList(1, 3, 12, 9, 20, 16, 21);
		 
		 IntSummaryStatistics stats=numbers.stream()
				 .mapToInt(Integer::intValue)
				 .summaryStatistics();

		 int diff=stats.getMax()-stats.getMin();
		 System.out.println("Differnce between max and min number is : "+diff);
	}
}
