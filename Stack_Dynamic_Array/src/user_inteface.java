import java.util.Scanner;

public class user_inteface {
	
	public static void main(String Args[])
	{
		Implementation k = new Implementation();
		System.out.println("Implementing dynamic stack");
		while(true)
		{
			System.out.println("1.push element");
			System.out.println("2.Pop element");
			System.out.println("3.Print elements");
			System.out.println("4.Exit");
			Scanner s = new Scanner(System.in);
			int ch = s.nextInt();
			switch(ch)
			{
			case 1:
				int data=s.nextInt();
				System.out.println("Pushing the element\n");
				k.push(data);
				break;
				
			case 2:
				System.out.println("Removing the element\n");
				k.pop();
				break;
			case 3:
				System.out.println("Printing\n");
				k.print();
				break;
			case 4:
				System.exit(1);
			}
		}
	}
	

}
