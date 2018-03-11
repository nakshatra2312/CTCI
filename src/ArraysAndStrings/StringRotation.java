package ArraysAndStrings;

public class StringRotation {
	
	public static boolean stringRotation(String s1, String s2)
	{
		if(s1==null || s2==null || s1.length()==0 || s2.length()==0)
		{
			return false;
		}
		else
		{
			
			if((s1+s1).contains(s2))
			{
				return true;
			}
			else return false;
		}
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(stringRotation("waterbottle", "erbottlewat"));

	}

}
