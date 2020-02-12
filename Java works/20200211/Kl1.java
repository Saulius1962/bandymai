public class Kl1
{
public static void main (String[] args) 
	{
	
	System.out.print("Enter a < 127 : ");
	int a = Integer.parseInt(System.console().readLine());
	System.out.print("Enter b <  127 :  ");
	int b = Integer.parseInt(System.console().readLine());
	char rezult ='n';
	if (a > b) {
		rezult = '>';
		} else if (a < b) {
			rezult = '<';
		} else {rezult = '=';}
	System.out.println();
	System.out.println("a" + " " + rezult + " " + "b");
	}
}