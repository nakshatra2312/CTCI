package ArraysAndStrings;

public class IsPermutationOfPalindrome {
	
	public static boolean isPermutationOfPalindrome(String str)
	{
		int[] freqtable= new int[Character.getNumericValue('z')- Character.getNumericValue('a')+1]; // only a-z are considered
		int countOdd=0;
		for(char ch : str.toCharArray())
		{
			freqtable[ch-'a']++;
			if(freqtable[ch-'a']%2!=0)
			{
				countOdd++;
			}
			else
			{
				countOdd--;
			}
		}
		
		return countOdd<=1?true:false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isPermutationOfPalindrome("tommot"));

	}

}
