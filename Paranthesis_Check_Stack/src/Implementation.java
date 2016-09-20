
public class Implementation {
	
	stack_adt chem;
	boolean test;
	int count=0;
	public boolean check(String line)
	{
		chem = new stack_adt(line.length());
		for(int i=0; i<line.length();i++)
		{
			System.out.println("Char is::"+line.charAt(i));
			if(line.charAt(i)=='('||line.charAt(i)=='['||line.charAt(i)=='{')
			{
				
				System.out.println("Pushed into array\n");
				chem.push(line.charAt(i));
				count++;
				System.out.println(count);
			}
			
			if(line.charAt(i)==')'||line.charAt(i)==']'||line.charAt(i)=='}')
			{
				System.out.println("The element is ending with"+line.charAt(i));
				char ll = chem.pop();
				
				System.out.println("NEeds to be checked with:"+ll);
				if((ll=='(')&&(line.charAt(i)==')')||(ll=='[')&&(line.charAt(i)==']')||(ll=='{')&&(line.charAt(i)=='}'))
				{
					count--;
					System.out.println(count);
					//test = true;
				}
				
			}
			
		}
		if(count==0)
		{
			test = true;
		}
		else
		{
			test =false;
		}
		return test;
	}

}
