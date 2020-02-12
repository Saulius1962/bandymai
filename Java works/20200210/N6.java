class Nr6
{
public static void main (String[] args)
{
	System.out.print("Enter a < 127 : ");
	int a = Integer.parseInt(System.console().readLine());
	System.out.print("Enter b <  127 :  ");
	int b = Integer.parseInt(System.console().readLine());
	System.out.println();
	int c = a + b;
	System.out.println(a + "+" + b + "=" + c);
	c = a - b;
	System.out.println(a + "-" + b + "=" + c);
	c = a * b;
	System.out.println(a + "*" + b + "=" + c);
	c = a / b;
	System.out.println(a + "/" + b + "=" + c);
	c = a % b;
	System.out.println(a + "mod" + b + "=" + c);
}
}
