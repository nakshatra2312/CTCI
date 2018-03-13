package LinkList;

public class Partition {
	
	public static Node partition(Node head, int x)
	{
		Node start=head;
		Node end=head;
		
		while(head!=null)
		{
			Node next= head.next;

			if(head.data<x)
			{
				head.next=start;
				start=head;
			}
			else
			{
				end.next=head;
				end=head;
			}
			
			head=next;
		}
		
		end.next=null;
		
		
		return start;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
