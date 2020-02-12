public class Nr3
{
public static void main (String[] args)
	{
		System.out.print("Enter a : ");
		int a = Integer.parseInt(System.console().readLine());
		System.out.print("Enter b : ");
		int b = Integer.parseInt(System.console().readLine());
		System.out.print("Enter c : ");
		int c = Integer.parseInt(System.console().readLine());
		if (a > b) {
			if (a > c) {
			System.out.println();
			System.out.println(a);	
		} else if (b < c){
			System.out.println();
			System.out.println(c);
			}
		}
			System.out.println();
			System.out.println(b);
	}
}