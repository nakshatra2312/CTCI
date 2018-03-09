package ArraysAndStrings;

public class OneEditAway {
	
	public static boolean oneEditAway(String s1,String s2)
	{
		int lengthDifference= s1.length()-s2.length();
		switch(lengthDifference)
		{
		case 0:
		{
		 return oneReplaceAway(s1,s2);
		}
		case 1:
		{
			return oneRemovalAway(s1,s2);
		}
		case -1:
		{
			return oneInsertionAway(s1,s2);
		}
		default:
		{
			return false;
		}
		}
	}
	
	public static boolean oneReplaceAway(String s1, String s2)
	{
		boolean foundDifference=false;
		
		for(int index=0;index<s1.length();index++)
		{
			if(s1.charAt(index)!=s2.charAt(index))
			{
				if(foundDifference)
				{
					return false;
				}
				foundDifference=true;
			}
		}
		return true;
	
	}
	public static boolean oneRemovalAway(String s1, String s2)
	{
		int index1=0;
		int index2=0;
		
		while(index1<s1.length() && index2<s2.length())
		{
			if(s1.charAt(index1)!=s2.charAt(index2))
			{
				if(index1!=index2)
				{
					return false;
				}
				
				index1++;
			}
			else
			{
				index1++;
				index2++;
			}
			
		}
		return true;
		
		
	}
	public static boolean oneInsertionAway(String s1, String s2)
	{
		int index1=0;
		int index2=0;
		
		while(index2<s2.length() && index1<s1.length())
		{
			if(s1.charAt(index1)!=s2.charAt(index2))
			{
				if(index1!=index2)
				{
					return false;
				}
				
				index2++;
			}
			else
			{
				index1++;
				index2++;
			}
			
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(oneEditAway("tom","tommm"));

	}

}
