
public class node	
{
	private Object data;
	private node next;
	private node prev;
	
	public node(int data)
	{
		this.data = (Integer)data;
	}
	
	public void set_prev_node(node prev)
	{
		this.prev = prev;
	}
	
	public void set_prev_node()
	{
		this.prev = null;
	}
	public node get_prev_node()
	{
		return this.prev;
	}
	public void set_data(Object data)
	{
		this.data = data;
	}
	public Object get_data()
	{
		return this.data;
	}
	public void set_next_node(node next)
	{
		this.next = next ;
	}
	public void set_next_node()
	{
		next = null;
	}

	public node get_next_node()
	{
		return this.next;
	}

}
