package ArraysAndStrings;

public class Compress {
	
	public static String compress(String originalStr)
	{
		StringBuilder compressedString= new StringBuilder();
		
		int countConsecutive=0;
		
		for(int i=0;i<originalStr.length();i++)
		{
			countConsecutive++;
			if(i+1>=originalStr.length() || originalStr.charAt(i)!= originalStr.charAt(i+1))
			{
				compressedString.append(originalStr.charAt(i));
				compressedString.append(countConsecutive);
				
				countConsecutive=0;
			}
		}
		
		
		
		return originalStr.length()<compressedString.length()?originalStr:compressedString.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
