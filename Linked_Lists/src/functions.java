import java.util.ArrayList;

public class functions {

	Singe_Linked_lists_class head;
	Singe_Linked_lists_class p;//= new Singe_Linked_lists_class();
	//Singe_Linked_lists_class node = new Singe_Linked_lists_class();
	//ArrayList<Integer> pr = new ArrayList<Integer>();
	
	public void insert_begin(Object data)
	{
		Singe_Linked_lists_class node = new Singe_Linked_lists_class((Integer)data);

		if(head == null)
		{
			//Singe_Linked_lists_class node = new Singe_Linked_lists_class((Integer)data);
			node.set_next_node();
			head = node;
		}
		else
		{
			//node.set_data(data);
			node.set_next_node(head);
			head = node;
		}
	}
	
	public void insert_position(Object data,int pos)
	{
		Singe_Linked_lists_class node = new Singe_Linked_lists_class((Integer)data);

		if(head == null)
		{
			node.set_next_node();
			head = node;
			
		}
		else
		{
			p=head;
			for(int i=0;i<pos-2;i++)//if pos-1,takes it to the node where the input shoud be put before, so beter to stop before hand itself.1
			{
				p = p.get_next_node();
			}
			//node.set_data(data);
            node.set_next_node(p.get_next_node());
			p.set_next_node(node);
			p=null;
			
		}
		
	}
	public void insert_end(Object data)
	{
		Singe_Linked_lists_class node = new Singe_Linked_lists_class((Integer)data);

		if(head == null)
		{
			node.set_next_node();
			//node.set_data(data);
			head = node;
			//head.set_next_node();
		}
		else
		{
			p=head;
			while(p.get_next_node()!=null)
			{
				System.out.println(p.get_data());
				p = p.get_next_node();
				
			}
			System.out.println(p.get_data());
			//node.set_data(data);
			p.set_next_node(node);
			System.out.println("hello"+p.get_next_node().get_data());
			node.set_next_node();
			System.out.println("hello"+node.get_next_node());
			p=null;
		}
	}
	public void remove_begin()
	{
		if(head == null)
		{
			System.out.println("No element present");
		}
		if(head.get_next_node()==null)
		{
			head = null;
			System.out.println("removed the only element\n");
		}
		else
		{
			head = head.get_next_node();
			//System.out.println(head.get_data());
	
			System.out.println("removed the first element\n");
			
		}
		
	}
	public void remove_end()
	{
		if(head == null){
			System.out.println("No element present\n");
		}
		if(head.get_next_node()==null)
		{
			head = null;
			System.out.println("removed the only element\n");
		}
		
	else{
		p=head;
		while(p.get_next_node().get_next_node()!=null)
		{
			p = p.get_next_node();
		}
		p.set_next_node();
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
		if(head.get_next_node()==null)
		{
			head = null;
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
		while(p!=null)
		{
			System.out.println(p.get_data());
			p = p.get_next_node();

		}
		p=null;
		
		
		
	}


}
