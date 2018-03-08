package ArraysAndStrings;

import java.util.Arrays;

public class Permutation {
	
	
	public static boolean permutationUsingSorting(String str1, String str2)
	{
		if(str1.length()!=str2.length())
		{
			return false;
		}
		
		char[] str1Arr= str1.toCharArray();
		Arrays.sort(str1Arr);
		String input1= new String(str1Arr);
		
		char[] str2Arr= str2.toCharArray();
		Arrays.sort(str2Arr);
		String input2= new String(str2Arr);
		
		if(input1.equals(input2))
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
	}
	
	
	public static boolean permutationsUsingCountBucket(String str1, String str2)
	{
		if(str1.length()!=str2.length())
		{
			return false;
		}
		int bucket[]= new int[128];
		
		for(char ch: str1.toCharArray())
		{
			bucket[ch]++;
		}
		
		for(char ch: str2.toCharArray())
		{
			
			
			bucket[ch]--;
			if(bucket[ch]<0)
			{
				return false;
			}
		}
		
		return true;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(permutationUsingSorting("dog","God"));
		System.out.println(permutationsUsingCountBucket("dog","God"));
	}

}
