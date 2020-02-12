public class Nr1
{
public static void main (String[] args)
	{
		System.out.print("Enter a : ");
		int a = Integer.parseInt(System.console().readLine());
		if (a >= 0) {
			System.out.println();
			System.out.println("Number is positive");	
		} else {
			System.out.println();
			System.out.println("Number is negative");
			}
	}
}