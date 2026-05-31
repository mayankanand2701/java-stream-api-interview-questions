package Code;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

// Find the second largest number. 
public class Q2 
{
	public static void main(String[] args)
	{
		List<Integer> numbers = Arrays.asList(1, 5, 13, 41, 88, 99, 99, 77 , 100);

		Optional<Integer> sl=numbers.stream().distinct()
				.sorted(Comparator.reverseOrder())  
				.skip(1)
				.findFirst();

		sl.ifPresentOrElse(System.out::println, 
				() -> System.out.println("No second largest element found.")
				);
	}
}
