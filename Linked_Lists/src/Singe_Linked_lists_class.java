
public class Singe_Linked_lists_class {
	
	private Object data;
	private Singe_Linked_lists_class next;
	
	public Singe_Linked_lists_class(int data)
	{
		this.data = (Integer)data ;
	}
	
	public void set_data(Object data)
	{
		this.data = data;
	}
	public Object get_data()
	{
		return this.data;
	}
	public void set_next_node(Singe_Linked_lists_class node)
	{
		next = node;
	}
	public void set_next_node()
	{
		next = null;
	}

	public Singe_Linked_lists_class get_next_node()
	{
		return this.next;
	}

}
