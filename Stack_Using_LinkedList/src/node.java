
public class node {

	int data;
	node next;

	public node()
	{
		next = null;
	
	}
	
	public node(int data)
	{
		next = null;
		this.data = data;
	}
	public node get_next()
	{
		return next;
	}
	public void set_next(node s)
	{
		this.next = s;
	}
	public void set_data(int data)
	{
		this.data = data;
	}
	public int get_data()
	{
		return data;
	}
		
}
