package Code;

import java.util.Arrays;
import java.util.List;

// Count number of strings containing a given character. 
public class Q6 
{
	public static void main(String[] args) 
	{
		List<String> words=Arrays.asList("Hill","Hello","How","Are","You","Welcome");
		
		long count=words.stream()
						.filter(s -> s.contains("ll"))
						.count();

		System.out.println("Count of strings that contins the search element is : "+count);
	}
}
