public class HelloNames
{
public static void main (String[] args)
{
	String name = "name";
	String lastname = "lastname";
	final String usageMessage = "Usage: vardas + pavarde 2 parametrai";
	if (args.length > 1) {
		name = args[0];
		lastname  = args[1];
		System.out.println("Hello " + " " + name + " " + lastname);
	}
	else {
		System.out.println(usageMessage);
	}

}

}
