package LinkList;

public class DeleteNode {
	
	public static boolean deleteNode(Node node)
	{
		if(node==null || node.next==null)
		{
			return false;// can't be solved if node is the last node
		}
		
		Node next=node.next;
		node.data=next.data;
		node.next=next.next;
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
