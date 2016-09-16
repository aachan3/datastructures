package circular_single_linked_list;

public class node {

	private Object data;
	node next;
	
	public node(Object data)
	{
		this.data=data;
	}
	public void set_next_node()
	{
		this.next = null;
	}
	public void set_next_node(node a)
	{
		this.next = a;
	}
	public node get_next_node()
	{
		return this.next;
	}
	public void set_data(int data)
	{
		this.data=data;
	}
	public Object get_data()
	{
		return this.data;
	}
}
