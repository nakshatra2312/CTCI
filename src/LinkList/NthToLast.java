package LinkList;

public class NthToLast {
	
	public static Node nthToLast(Node head, int k)
	{
		
		//considering k is less than the length of the link list
		Node slow=head;
		Node runner=head;
		
		for(int i=0;i<k;i++)
		{
			if(runner==null)
			{
				return null;
			}
			runner=runner.next;
		}
		
		while(runner!=null)
		{
			slow=slow.next;
			runner=runner.next;
		}
		
		return slow;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
