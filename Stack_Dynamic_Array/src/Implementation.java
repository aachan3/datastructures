
public class Implementation {

	int[] Dynam_stack;
	int top;
	int length = 1;
	public Implementation()
	{
		top=-1;
		Dynam_stack = new int[1];
	}
	public void push(int data)
	{
		if(top<length-1)
		{
		   Dynam_stack[++top] = data;
		}
		else
		{
			length = length * 2;
			int[] temp = new int[length];
			for(int h = 0; h < Dynam_stack.length;h++)
			{
				temp[h] = Dynam_stack[h];
			}
			Dynam_stack = null;
			Dynam_stack = temp;
			Dynam_stack[++top] = data;
			
		}
		
	}
	
	public void pop()
	{
	System.out.println(Dynam_stack[top--]);	
	}
	public void print()
	{
		for(int g = top; g>=0;g--)
		{
			System.out.println(Dynam_stack[g]);
		}
	}
	
}
