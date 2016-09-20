
public class stack_adt {
	
	char[] balance;
	int top;
	int len;
	char f;
	
	public stack_adt(int length)
	{
		balance = new char[length];
		top = -1;
		len = length;
	}
	
	public void push(char c)
	{
		if(top<=(len-1))
		{
			balance[++top] = c;
		}
		else{
			System.out.println("Element can't be inserted,as stack full\n");
		}
	}
	public char pop()
	{
		if(top>-1)
		{
		 f =  balance[top--];
		}
		else
		System.out.println("Stack underflow,No element present\n");	
		return f;
	}

}
