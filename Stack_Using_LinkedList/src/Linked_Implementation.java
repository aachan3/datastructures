
public class Linked_Implementation {

	node top;
	
	public void Linked_Implementation()
	{
		//top = new node();
		
	}
	public void push(int data)
	{
		if(top==null)
		{
		//node stack = new node(data);
		top = new node();
		top.set_data(data);
		top.set_next(null);
		}
		else
		{
			node stack = new node(data);
			stack.set_next(top);
			top = stack;
		}
				
	}
	public void pop()
	{
		if(top!= null)
		{
			top = top.get_next();
		}
		else
		{
			System.out.println("Undeflow condition");
		}
	}
	public void print()
	{
		node p = top;
		if(top == null)
		{
			System.out.println("No element to print");
			
		}
		else{
		while(p.get_next()!= null)
		{
			System.out.println(p.get_data());
			p = p.get_next();
		}
		System.out.println(p.get_data());
		}
	}
	
	
}
