
public class Implementation {

	int length;
	int top;
	int[] stack;
	public Implementation(int length)
	{
		this.length = length;
		stack = new int[length];
		top = -1;
	}
	public void push(int data)
	{
		if(top < length-1)
		{
			stack[++top] = data;
			System.out.println("Inserted "+ data + " at "+ top +" position\n");
		}
		else
		{
			System.out.println("Overflow condition,Can't insert anymore\n");
		}
	}
	public void pop()
	{
		if(top == -1)
		{
			System.out.println("Underflow problems, can't pop as list empty");
		}
		else
		{
			System.out.println("Removing "+ stack[top--] +" from "+ (top+1));
		}
	}
	public void print()
	{
		for(int i=top;i>=0;i--)
		{
			System.out.println(stack[i]);
		}
	}
	
}
