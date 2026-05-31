package Code;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// Find the kth smallest element. 
public class Q5 
{
	public static void main(String[] args) 
	{
		List<Integer> numbers = Arrays.asList(1, 3, 12, 9, 20, 16, 21);
		int k=3;
		
		Optional<Integer> result = numbers.stream()
									.sorted()        
									.skip(k - 1)     
									.findFirst();  
		
		System.out.println("Kth smallest Number is : "+result);
	}
}
