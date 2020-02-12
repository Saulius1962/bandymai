class Nr7
{
public static void main (String[] args)
{
	System.out.print("Enter a < 127 : ");
	int a = Integer.parseInt(System.console().readLine());
	int c;
	for(int i=0; i<11; i++){
	c = a * i;
	System.out.println(a + "*" + i + "=" + c);
}
}
}
