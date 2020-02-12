class HelloName
{
public static void main (String[] args)
{
	System.out.print("enter your name: ");
	String name = System.console().readLine();
	System.out.print("enter your surname  ");
	String name2  = System.console().readLine();
	System.out.println("Hello " + name + " " + name2);
}

}
