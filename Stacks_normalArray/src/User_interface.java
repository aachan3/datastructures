import java.util.Scanner;

public class User_interface {

	public static void main(String args[])
	{
		int i=1;
		
		System.out.println("enter the length of stack\n");
		Scanner s = new Scanner(System.in);
		int length = s.nextInt();
		Implementation stacks = new Implementation(length);
		while(i==1)
		{
			System.out.println("1.push element into stack\n");
			System.out.println("2.pop element from stack\n");
			System.out.println("3.print the list\n");
			System.out.println("4.Exit from program");
			int ch = s.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter the data\n");
				int data = s.nextInt();
				stacks.push(data);
				break;
			case 2: 
				System.out.println("removing element:\n");
				stacks.pop();
				break;
			case 3:
				System.out.println("printing the stack:\n");
				stacks.print();
				break;
			case 4:
				System.out.println("Exiting.......");
				System.exit(1);
			}
		}
	s.close();	
	}
}
