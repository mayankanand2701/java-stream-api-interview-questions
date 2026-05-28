package Code;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Map strings to their lengths. 
public class Q9 
{
	public static void main(String[] args) 
	{
		List<String> words=Arrays.asList("Dog","Cat","Fish","Ball","Bat","Ground");
		
		Map<String, Integer> stringToLength = words.stream()
			    .distinct() 
			    .collect(Collectors.toMap(
			        word -> word,           
			        String::length          
			    ));

		System.out.println("String with length count : "+stringToLength); 
	}
}
