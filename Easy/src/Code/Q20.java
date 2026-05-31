package Code;

import java.util.Arrays;
import java.util.List;

// Find shortest string in a list. 
public class Q20 
{
	public static void main(String[] args) 
	{
		List<String> words=Arrays.asList("Danger","Cat","Rabbit","Horse","Elephant");
		
		String result=words.stream()
							.reduce((s1,s2)-> s1.length()<=s2.length() ? s1:s2)
							.orElse(" ");
		
		System.out.println("Shortest string in a list is : "+result);
	}
}
