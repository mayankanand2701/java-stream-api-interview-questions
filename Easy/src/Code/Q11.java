package Code;

import java.util.Arrays;
import java.util.List;

// Find maximum number in a list.
public class Q11
{
	public static void main(String[] args)
	{
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		int maxNumber=list.stream()
						  .max(Integer::compare)
						  .orElseThrow();
		
		System.out.println("Maximum Number is : "+maxNumber);
	}
}
