public class Nr4
{
public static void main (String[] args)
	{
		System.out.print("Enter a : ");
		double a = Double.valueOf(System.console().readLine());	
		if (a > 0) {
			System.out.println();
			System.out.println("Positive");	
		} else if (a < 0){
			System.out.println();
			System.out.println("Negative");
		} else {
			System.out.println();
			System.out.println("0");
		}
	}
}