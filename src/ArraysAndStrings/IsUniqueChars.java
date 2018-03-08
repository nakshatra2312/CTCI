package ArraysAndStrings;


import java.util.HashSet;
import java.util.Map;

public class IsUniqueChars {
	
	//using HashSet
	public static boolean isUniqueCharsUsingHashSet(String input)
	{
		if(input.length()>128)
		{
			return false;
		}
		HashSet<Character> set= new HashSet<Character>();
		for(char ch: input.toCharArray())
		{
			if(set.contains(ch))
			{
				return false;
			}
			else
			{
				set.add(ch);
			}
		}
		
		return true;
		
	}
	
	//Using BooleanArray
	public static boolean isUniqueCharsUsingArray(String input)
	{
		if(input.length()>128)
		{
			return false;
		}
		
		boolean charArr[]=new boolean[256];
		
		for(char ch: input.toCharArray())
		{
			if(charArr[ch-'a'])
			{
				return false;
			}
			charArr[ch-'a']=true;
		}
		
		return true;
		
	}
	
	
	//Using Bitwise
	public static boolean isUniqueCharsUsingBitwise(String input)
	{
		if(input.length()>128)
		{
			return false;
		}
		
		int parity=0;
		
		for(char ch: input.toCharArray())
		{
			int value= ch-'a';
			if( (parity & (1<<value)) >0)//check if the ch bit is already checked or not
			{
				return false;
			}
			
			parity=parity | (1<<value);
		}
		
		return true;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//boolean result= isUniqueCharsUsingArray("nakss");
		//boolean result= isUniqueCharsUsingArray("nakss");
		boolean result= isUniqueCharsUsingBitwise("naks");
		System.out.println(result);
		
		

	}

}
