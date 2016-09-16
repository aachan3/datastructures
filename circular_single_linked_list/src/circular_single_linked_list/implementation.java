package circular_single_linked_list;

public class implementation {

	node head;
	node p;
	node tail;//= new Singe_Linked_lists_class();
	//Singe_Linked_lists_class node = new Singe_Linked_lists_class();
	//ArrayList<Integer> pr = new ArrayList<Integer>();
	
	public void insert_begin(Object data)
	{
		node nodes = new node((Integer)data);

		if(head == null)
		{
			//Singe_Linked_lists_class node = new Singe_Linked_lists_class((Integer)data);
			nodes.set_next_node(nodes);
			head = nodes;
			tail = nodes;
		}
		
		else
		{
			nodes.set_next_node(head);
			head = nodes;
			tail.set_next_node(head);
			//p=head;
			//p.set_next_node(nodes);
			//nodes.set_next_node(head);
			//head = nodes;
			//p=null;
			
		}
	}
	
	public void insert_position(Object data,int pos)
	{
		node nodes = new node((Integer)data);

		if(head == null)
		{
			nodes.set_next_node(nodes);
			head = nodes;
			tail = nodes;
			
		}
		else
		{
			p=head;
			for(int i=0;i<pos-2;i++)//if pos-1,takes it to the node where the input shoud be put before, so beter to stop before hand itself.1
			{
				p = p.get_next_node();
			}
			//node.set_data(data);
            nodes.set_next_node(p.get_next_node());
			p.set_next_node(nodes);
			p=null;
			
		}
		
	}
	public void insert_end(Object data)
	{
		node nodes = new node((Integer)data);

		if(head == null)
		{
			nodes.set_next_node(nodes);
			//node.set_data(data);
			head = nodes;
			tail = nodes;
			//head.set_next_node();
		}
		else
		{
			tail.set_next_node(nodes);
			nodes.set_next_node(head);
			tail = nodes;
		}
	}
	public void remove_begin()
	{
		if(head == null)
		{
			System.out.println("No element present");
		}
		if(head == tail)
		{
			head = tail = null;
			System.out.println("removed the only element\n");
		}
		else
		{
			head = head.get_next_node();
	        tail.set_next_node(head);
			System.out.println("removed the first element\n");
			
		}
		
	}
	public void remove_end()
	{
		if(head == null){
			System.out.println("No element present\n");
		}
		if(head==tail)
		{
			head = tail = null;
			System.out.println("removed the only element\n");
		}
		
	else{
		p=head;
		while(p.get_next_node()!=tail)
		{
			p = p.get_next_node();
		}
		//p.get_next_node().set_next_node();
		p.set_next_node(head);
		tail =p;
		System.out.println("removed the last element\n");
		p=null;
	}
		
	}
	public void remove_position(int pos)
	{
		if(head == null)
		{
			System.out.println("No element\n");
		}
		if(head==tail)
		{
			head = tail = null;
			System.out.println("only one element and removed\n");
		}
		
	else{
		p=head;
		for(int l = 0; l< pos-2; l++)
		{
			p = p.get_next_node();
		}
		p.set_next_node(p.get_next_node().get_next_node());
		System.out.println("Element at position removed\n");
	}
	}
	public void show()
	{
		p=head;
		if(head == tail)
		{
			System.out.println(head.get_data());
		}
		else{
			
		while(p!=tail)
		{
			System.out.println(p.get_data());
			p = p.get_next_node();

		}
		System.out.println(p.get_data());
		}
		p=null;
		
		
		
	}


}
