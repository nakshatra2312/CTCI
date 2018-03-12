package LinkList;

import java.util.HashSet;

public class RemoveDuplicate {
	
	public static Node removeDuplicate(Node head)
	{
		if(head ==null)
		{
			return null;
		}
		
		HashSet<Integer> listData= new HashSet<Integer>();
		Node prev= null;
		Node start=head;
		
		while(start!=null)
		{
			if(listData.contains(start.data))
			{
				prev.next=start.next;
				
			}
			else
			{
				listData.add(start.data);
				prev=start;
				
			}
			start=start.next;
		}
		
		return head;
		
	}
	
	public static Node removeDuplicateWithoutBuffer(Node head)
	{
		if(head ==null)
		{
			return null;
		}
		
		Node current=head;
		
		while(current!=null)
		{
			Node runner= current;
			while(runner.next!=null)
			{
				if(current.data==runner.next.data)
				{
					runner.next=runner.next.next;
				}
				else
				{
					runner=runner.next;
				}
			}
			
			current=current.next;
		}
		
		return head;
		
	}



public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	
	
	

}
}
