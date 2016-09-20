import java.util.Scanner;

public class stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		//char[] string  = new char[15];
		Implementation g = new Implementation();
		
		while(true)
		{
		System.out.println("Enter the string that you want to check the balancing of:\n");
		String line = s.nextLine();
		System.out.println(line);
		Boolean k = g.check(line);
		System.out.println("Test:"+ k);
		}
	}

}
