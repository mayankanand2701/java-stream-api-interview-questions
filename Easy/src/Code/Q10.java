package Code;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Count vowels in each string.
public class Q10 
{
	public static void main(String[] args) 
	{
		List<String> words=Arrays.asList("Dog","Cat","Fish","Ball","Bat","Ground");
		String vowels="aeiouAEIOU";
		
		Map<String, Long> result = words.stream()
	            .collect(Collectors.toMap(
	                word -> word, 
	                word -> word.chars()
	                            .filter(ch -> vowels.indexOf(ch) != -1)
	                            .count()
	            ));
		System.out.println("String with each vowel count : "+result); 
	}
}
