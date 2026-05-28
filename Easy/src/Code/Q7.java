package Code;

import java.util.Arrays;
import java.util.List;

// Find names starting with specific character
public class Q7 
{
	public static void main(String[] args)
	{
		List<String> words=Arrays.asList("Ram","Shyam","Ramesh","Raju","Sita","Rakesh");
		
		List<String> list=words.stream()
								.filter(s -> s.startsWith("R"))
								.toList();
		
		System.out.println("Names that starts with specific character : "+list);
	}
}
