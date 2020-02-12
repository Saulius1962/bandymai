public class ArrayType
{
public static void main (String[] args) 
	{

	int numbers[] = {1, 2, 3, 4, 5}; 
	int rows[][] = {
	{1, 2, 3, 4, 5},
	{6, 7, 8, 9, 10}
	};

	System.out.print("Enter a : ");
	double a = Double.valueOf(System.console().readLine());
	System.out.print("Enter b :  ");
	double b = Double.valueOf(System.console().readLine());
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