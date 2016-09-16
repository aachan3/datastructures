import java.util.ArrayList;
import java.util.Scanner;

public class implementation {
	
	public static void main(String args[])
	{
		int i=1;
		int p;
		int inp;
		int pos;
		Object data;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		functions x = new functions();
		
		  
	  while(i==1)
	  {

		  System.out.println("1.Add at beginning");
		  System.out.println("2.Add at a position");
		  System.out.println("3.Add at end");
		  System.out.println("4.Remove from beginning");
		  System.out.println("5.Remove from a position");
		  System.out.println("6.Remove from end");
		  System.out.println("7.Show the linked list");
		  System.out.println("8.Exit from the program");
		  
		  Scanner scan = new Scanner(System.in);
		  inp = scan.nextInt();
		  
		  switch(inp)
		  {
		  case 1: 
		  {
			 System.out.println("Enter the data to be entered at beginning\n");
			 data = (Integer)scan.nextInt();
			 x.insert_begin(data); 
			 break;
		  }
		  case 2:
		  {
			  System.out.println("Enter the data to be entered at a position\n");
			  data = (Integer)scan.nextInt();
			  System.out.println("Enter the position to be entered at a data\n");
			  pos = scan.nextInt();
			  x.insert_position(data,pos);
			  break;
		  }
		  case 3:
		  {
			  System.out.println("Enter the data to be entered at end\n");
			  data=(Integer)scan.nextInt();
			  x.insert_end(data);
			  break;
		  }
		  case 4:
		  {
			  System.out.println("Removing from beginning");
			   x.remove_begin();
			  break;
		  }
		  case 6:
		  {
			  System.out.println("Removing from end");
			   x.remove_end();
			  break;
		  }
		  case 5:
		  {
			  System.out.println("Enter the position to be entered at a data\n");
			  pos=(Integer)scan.nextInt();
			  System.out.println("Removing from position");
			   x.remove_position(pos);
			  break;
		  }
		  case 7:
		  {
			  System.out.println("Showing the list");
			  x.show();
			  //System.out.println(arr);
			  break;
			  
		  }
		  case 8:
		  {
			  System.exit(1);
		  }
		  }
		  
		    
	  }
		
		
	}

}
