public class Nr5
{
public static void main (String[] args)
	{
		String diena = "Kuku";
		System.out.print("Enter day number 1 .. 7 : ");
		int day = Integer.valueOf(System.console().readLine());	
		
		switch (day) {
			case 1 : diena = "Pirmadienis";
					break;
			case 2 : diena = "Antradienis";
					break;
			case 3 : diena = "Treciadieis";
					break;
			case 4 : diena = "Ketvirtadienis";
					break;
			case 5 : diena = "Penktadienis";
					break;
			case 6 : diena = "Sestadienis";
					break;
			case 7 : diena = "Sekmadienis";
					break;		
			}
			System.out.println();
			System.out.println(diena);
	}
}