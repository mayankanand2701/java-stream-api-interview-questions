package Code;

import java.util.Arrays;
import java.util.List;

// Square each odd number in a list. 
public class Q8
{
	public static void main(String[] args) 
	{
		List<Integer> list=Arrays.asList(1,2,3,4,5,6);
		
		List<Integer> squareList=list.stream()
				 					 .filter(num -> num%2!=0)
									 .map(num -> num*num)
									 .toList();
		
		System.out.println("List formed after squaring each odd number from list : "+squareList);
	}
}
